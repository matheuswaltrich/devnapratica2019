import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { Professor } from 'src/app/core/entities/professor/professor';
import { Subject, throwError } from 'rxjs';
import { ProfessorService } from 'src/app/core/entities/professor/professor.service';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { takeUntil, catchError } from 'rxjs/operators';

@Component({
  selector: 'app-professor-form',
  templateUrl: './professor-form.component.html',
})
export class ProfessorFormComponent implements OnInit {


  public professorForm: FormGroup;
  @Input() professor: Professor;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private professorService: ProfessorService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.professorForm = this.getFormGroup();
    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));
  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
      dataNascimento: new FormControl(undefined, Validators.compose([Validators.required])),
      cpf: new FormControl(undefined, Validators.compose([Validators.required])),     
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
    if (!this.professorForm.valid) {
      return this.validateAllFormFields(this.professorForm);
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
    const previousRoute = '/professor/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Professor.fromDto(entity);
        this.professorForm.patchValue(value);
    } else {
        this.professorForm.patchValue(new Professor());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.professorForm;
    const professorDto = Professor.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.professorService.insert(professorDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O Professor foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.professorService.update(id, professorDto);
    }

    return observable;
  }

}
