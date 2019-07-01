import { Component, OnInit, Input } from '@angular/core';
import { Aluno } from 'src/app/core/entities/aluno/aluno';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { Subject, throwError } from 'rxjs';
import { AlunoService } from 'src/app/core/entities/aluno/aluno.service';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { takeUntil, catchError } from 'rxjs/operators';

@Component({
  selector: 'app-aluno-form',
  templateUrl: './aluno-form.component.html',
})
export class AlunoFormComponent implements OnInit {

  public alunoForm: FormGroup;
  @Input() aluno: Aluno;
  private routeParams: any;
  private ngUnsubscribe = new Subject();
  
  constructor(
    private alunoService: AlunoService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.alunoForm = this.getFormGroup();
    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));
  }
  
  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
      dataNascimento: new FormControl(undefined, Validators.compose([Validators.required])),
      cpf: new FormControl(undefined, Validators.compose([Validators.required])),
      devedor: new FormControl(undefined, Validators.compose([Validators.required])),      
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
    if (!this.alunoForm.valid) {
      return this.validateAllFormFields(this.alunoForm);
    }

    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe(() => {
      this.goBack();
      console.log(`Saved`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/aluno/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Aluno.fromDto(entity);
        this.alunoForm.patchValue(value);
    } else {
        this.alunoForm.patchValue(new Aluno());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.alunoForm;
    const alunoDto = Aluno.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.alunoService.insert(alunoDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O Aluno foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.alunoService.update(id, alunoDto);
    }

    return observable;
  }

}
