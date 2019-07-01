import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { Materia } from 'src/app/core/entities/materia/materia';
import { Subject, throwError } from 'rxjs';
import { MateriaService } from 'src/app/core/entities/materia/materia.service';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { takeUntil, catchError } from 'rxjs/operators';

@Component({
  selector: 'app-materia-form',
  templateUrl: './materia-form.component.html',
})
export class MateriaFormComponent implements OnInit {

  public materiaForm: FormGroup;
  @Input() materia: Materia;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private materiaService: MateriaService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.materiaForm = this.getFormGroup();
    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));
  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
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
    if (!this.materiaForm.valid) {
      return this.validateAllFormFields(this.materiaForm);
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
    const previousRoute = '/materia/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Materia.fromDto(entity);
        this.materiaForm.patchValue(value);
    } else {
        this.materiaForm.patchValue(new Materia());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.materiaForm;
    const materiaDto = Materia.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.materiaService.insert(materiaDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `A Matéria foi inserida com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.materiaService.update(id, materiaDto);
    }

    return observable;
  }

}
