import { Component, OnInit } from '@angular/core';
import { Materia } from 'src/app/core/entities/materia/materia';
import { MateriaService } from 'src/app/core/entities/materia/materia.service';
import { MessageService } from 'primeng/api';
import { Router, ActivatedRoute } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-materia-list',
  templateUrl: './materia-list.component.html'
})
export class MateriaListComponent implements OnInit {

  materia: Materia[];  
  columns: any[];

  constructor(
    private MateriaService: MateriaService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.MateriaService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.materia = contents;
    });

    this.columns = this.getGridColumns();
  }


  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },     
      { field: '', header: 'Acoes' }
    ];

    return gridcloumns;
  }

  public onRemove(materia: Materia) {
    this.messageService.add({
      key: 'removeConfirm',
      data: materia, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/materia/create'], { relativeTo: this.route });
  }

  public editMateria(materia: Materia) {
    this.router.navigate([`/materia/edit/${materia.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(materia: any) {
    const { id, nome } = materia.data;

    this.MateriaService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar a Matéria`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.materia = this.materia.filter(materia => materia.id !== id);
      this.materia.find((materia: Materia) => materia.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Matéria ${nome} deletada!`
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