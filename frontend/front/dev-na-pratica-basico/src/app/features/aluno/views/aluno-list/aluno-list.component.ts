import { Component, OnInit } from '@angular/core';
import { Aluno } from 'src/app/core/entities/aluno/aluno';
import { AlunoService } from 'src/app/core/entities/aluno/aluno.service';
import { MessageService } from 'primeng/api';
import { Router, ActivatedRoute } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-aluno-list',
  templateUrl: './aluno-list.component.html',
})
export class AlunoListComponent implements OnInit {

  aluno: Aluno[];  
  columns: any[];
  constructor(
    private AlunoService: AlunoService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.AlunoService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.aluno = contents;
    });

    this.columns = this.getGridColumns();
  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataNascimento', header: 'Data Nascimento' },
      { field: 'cpf', header: 'CPF' },
      { field: 'devedor', header: 'Devedor' },
      { field: '', header: 'Acoes' }
    ];

    return gridcloumns;
  }

  public onRemove(aluno: Aluno) {
    this.messageService.add({
      key: 'removeConfirm',
      data: aluno, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/aluno/create'], { relativeTo: this.route });
  }

  public editAluno(aluno: Aluno) {
    this.router.navigate([`/aluno/edit/${aluno.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(aluno: any) {
    const { id, nome } = aluno.data;

    this.AlunoService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar o Aluno`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.aluno = this.aluno.filter(aluno => aluno.id !== id);
      this.aluno.find((alunos: Aluno) => aluno.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Aluno ${nome} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch(summary?: string, detail?: string) {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: summary || `Error!`,
            detail: detail || `Default error!`
          });
        }
        this.messageService.clear('removeConfirm');
        return throwError(err);
      });
  }

}
