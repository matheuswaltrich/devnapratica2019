import { Component, OnInit } from '@angular/core';
import { Professor } from 'src/app/core/entities/professor/professor';
import { ProfessorService } from 'src/app/core/entities/professor/professor.service';
import { MessageService } from 'primeng/api';
import { Router, ActivatedRoute } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-professor-list',
  templateUrl: './professor-list.component.html',
})
export class ProfessorListComponent implements OnInit {


  professor: Professor[];  
  columns: any[];
  constructor(
    private ProfessorService: ProfessorService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.ProfessorService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.professor = contents;
    });

    this.columns = this.getGridColumns();
  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataNascimento', header: 'Data Nascimento' },
      { field: 'cpf', header: 'CPF' },      
      { field: '', header: 'Acoes' }
    ];

    return gridcloumns;
  }

  public onRemove(professor: Professor) {
    this.messageService.add({
      key: 'removeConfirm',
      data: professor, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/professor/create'], { relativeTo: this.route });
  }

  public editProfessor(professor: Professor) {
    this.router.navigate([`/professor/edit/${professor.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(professor: any) {
    const { id, nome } = professor.data;

    this.ProfessorService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar o Professor`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.professor = this.professor.filter(professor => professor.id !== id);
      this.professor.find((professor: Professor) => professor.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Professor ${nome} deletado!`
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