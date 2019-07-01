import { Component, OnInit } from '@angular/core';
import { Turma } from 'src/app/core/entities/turma/turma';
import { TurmaService } from 'src/app/core/entities/turma/turma.service';
import { MessageService } from 'primeng/api';
import { Router, ActivatedRoute } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-turma-list',
  templateUrl: './turma-list.component.html',
})
export class TurmaListComponent implements OnInit {

  turma: Turma[];  
  columns: any[];

  constructor(
    private TurmaService: TurmaService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.TurmaService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.turma = contents;
    });

    this.columns = this.getGridColumns();
  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'materia', header: 'Materia' },
      { field: 'professor', header: 'Professor' },
      { field: 'vagas', header: 'Vagas' },      
      { field: '', header: 'Acoes' }
    ];

    return gridcloumns;
  }

  public onRemove(turma: Turma) {
    this.messageService.add({
      key: 'removeConfirm',
      data: turma, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/turma/create'], { relativeTo: this.route });
  }

  public editTurma(turma: Turma) {
    this.router.navigate([`/turma/edit/${turma.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(turma: any) {
    const { id,  materia } = turma.data;

    this.TurmaService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar a Turma`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.turma = this.turma.filter(turma => turma.id !== id);
      this.turma.find((turma: Turma) => turma.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `turma de ${materia.nome} deletada!`
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