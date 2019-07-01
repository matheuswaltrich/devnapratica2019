import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { Turma } from 'src/app/core/entities/turma/turma';
import { Subject, throwError } from 'rxjs';
import { Aluno } from 'src/app/core/entities/aluno/aluno';
import { Materia } from 'src/app/core/entities/materia/materia';
import { Professor } from 'src/app/core/entities/professor/professor';
import { AlunoTurma } from 'src/app/core/entities/turma/alunoTurma/alunoTurma';
import { TurmaService } from 'src/app/core/entities/turma/turma.service';
import { AlunoService } from 'src/app/core/entities/aluno/aluno.service';
import { MateriaService } from 'src/app/core/entities/materia/materia.service';
import { ProfessorService } from 'src/app/core/entities/professor/professor.service';
import { MessageService } from 'primeng/api';
import { Router, ActivatedRoute } from '@angular/router';
import { takeUntil, catchError } from 'rxjs/operators';

@Component({
  selector: 'app-turma-form',
  templateUrl: './turma-form.component.html',
})
export class TurmaFormComponent implements OnInit {

  public turmaForm: FormGroup;
  public alunoTurmaForm: FormGroup;
  @Input() turma: Turma;
  private routeParams: any;
  private ngUnsubscribe = new Subject();
  public listAluno: Aluno[];
  public listMateria: Materia[];
  public listProfessor: Professor[];
  
  //Alunos da turma
  public alunosColumns: any[];
  public alunosTurma: AlunoTurma[];
  public alunos;
  constructor(
    private turmaService: TurmaService,
    private alunoService: AlunoService,
    private materiaService: MateriaService,
    private professorService: ProfessorService,
    private formBuilder: FormBuilder,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    
  ) { }

  ngOnInit() {
    this.turmaForm = this.getFormGroup();
    this.turmaService.list()
    .pipe(this.listAlunosErrorCatch())
    .subscribe(({ contents }) => {
      this.turma = contents;
    }); 

    this.alunoService.list().subscribe(({ contents}) => {
      this.alunos = contents
    })

    //alunos da turma
    this.alunosTurma = [];
    this.alunosColumns = this.getAlunosGridColumns();
    this.alunoTurmaForm = this.getFormGroupAlunoTurma();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));
  }


  private getFormGroup() {
    return this.formBuilder.group({
      materia: new FormControl(undefined, Validators.compose([Validators.required])),
      professor: new FormControl(undefined, Validators.compose([Validators.required])),
      vagas: new FormControl(undefined, Validators.compose([Validators.required])),
    });
  }

  private validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
        const control = formGroup.get(field);
        if (control instanceof FormControl) {
          control.markAsDirty({ onlySelf: true });
        } else if (control instanceof FormGroup) {
          this.validateAllFormFields(control);
        }
    });
  }

  public onSave() {
    if (!this.turmaForm.valid) {
      return this.validateAllFormFields(this.turmaForm);
    }

    if ((this.alunosTurma.length === 0)) {
      this.messageService.add({
        key: 'form-toast',
        severity: 'error',
        summary: `Erro!`,
        detail: `Deve ser informado ao menos um aluno para a Turma!`,
        sticky: true
      });
      return this.validateAllFormFields(this.turmaForm);
    }


    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe(() => {
      this.goBack();
      console.log(`Saved turma`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/turma/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Turma.fromDto(entity);
        this.turmaForm.patchValue(value);
    } else {
        this.turmaForm.patchValue(new Turma());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
  }

  private getSaveObservable() {
    const { value } = this.turmaForm;
    const turmaDto = Turma.toDto(value);
    turmaDto.alunos = this.alunosTurma;    

    let observable;

    if (this.isNew()) {
        observable = this.turmaService.insert(turmaDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `A Turma foi inserida com sucesso!`,
          sticky: true
        });
    } else {
        const id = this.routeParams.id;
        observable = this.turmaService.update(id, turmaDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `A Turma foi atualizado com sucesso!`,
          sticky: true
        });
    }

    return observable;
  }





  private listAlunosErrorCatch() {
    return catchError((err: any) => {
      if (err) {
        this.messageService.add({
          key: 'remove-toast',
          severity: 'error',
          summary: 'Erro!',
          detail: `Erro ao carregar a lista de alunos!`
        });
      }
      return throwError(err);
    });
  }

  private filterMateria(query, materias: any[]):any[] {
    let filtered : any[] = [];
    for(let i = 0; i < materias.length; i++) {
        let materia = materias[i];
        if(materia.nome.toLowerCase().indexOf(query.toLowerCase()) == 0) {
            filtered.push(materia);
        }
    }
    return filtered;
  }
  
  public searchMateria(event) {
    let query = event.query;

    this.materiaService.list()
    .pipe(this.listMateriaErrorCatch())
    .subscribe(({ contents }) => {
      this.listMateria = this.filterMateria(query, contents);
    });
  }

  private listMateriaErrorCatch() {
    return catchError((err: any) => {
      if (err) {
        this.messageService.add({
          key: 'remove-toast',
          severity: 'error',
          summary: 'Erro!',
          detail: `Erro ao carregar a lista de Materias!`
        });
      }
      return throwError(err);
    });
  }

  private filterProfessor(query, professores: any[]):any[] {
    let filtered : any[] = [];
    for(let i = 0; i < professores.length; i++) {
        let professor = professores[i];
        if(professor.nome.toLowerCase().indexOf(query.toLowerCase()) == 0) {
            filtered.push(professor);
        }
    }
    return filtered;
  }
  
  public searchProfessor(event) {
    let query = event.query;

    this.professorService.list()
    .pipe(this.listProfessorErrorCatch())
    .subscribe(({ contents }) => {
      this.listProfessor = this.filterProfessor(query, contents);
    });
  }

  private listProfessorErrorCatch() {
    return catchError((err: any) => {
      if (err) {
        this.messageService.add({
          key: 'remove-toast',
          severity: 'error',
          summary: 'Erro!',
          detail: `Erro ao carregar a lista de Professores!`
        });
      }
      return throwError(err);
    });
  }

  //Alunos da Turma

  private getAlunosGridColumns() {    
    const gridcloumns = [      
      { field: 'aluno.nome', header: 'Nome' },
      { field: 'aluno.dataNascimento', header: 'Data Nascimento' },
      { field: 'aluno.cpf', header: 'CPF' },
      { field: '', header: '' },
    ];

    return gridcloumns;
  }

  private getFormGroupAlunoTurma() {
    return this.formBuilder.group({
      alunos: new FormControl(undefined, Validators.compose([Validators.required]))
    });
  }

  public onRemoveAlunoTurma(alunoTurma: AlunoTurma) {
    const id = alunoTurma.id;

    this.alunosTurma = this.alunosTurma.filter(alunoTurma => alunoTurma.id !== id);
    this.messageService.clear('removeConfirmAlunoTurma');

    this.messageService.add({
      key: 'form-toast',
      severity: 'success',
      summary: `Sucesso!`,
      detail: `O Aluno foi removido com sucesso!`,
      sticky: false
    });
  }

  public onAddAlunoTurma(){
    const { value } = this.alunoTurmaForm;    
    this.alunosTurma.push(value.alunos);    
  }
  
}


