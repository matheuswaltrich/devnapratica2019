import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MateriaFormComponent } from './views/materia-form/materia-form.component';
import { MateriaListComponent } from './views/materia-list/materia-list.component';
import { MateriaRouterModule } from './materia.routing';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { TableModule } from 'primeng/table';
import { ReactiveFormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { KeyFilterModule } from 'primeng/keyfilter';
import { CalendarModule } from 'primeng/calendar';
import { RadioButtonModule } from 'primeng/radiobutton';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { MessageService } from 'primeng/api';
import { MateriaResolver } from './views/materia-form/materia.resolver';

@NgModule({
  declarations: [MateriaFormComponent, MateriaListComponent],
  imports: [
    CommonModule,
    MateriaRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,
    ToastModule
  ],
  providers: [
    MessageService,
    MateriaResolver
  ]
})
export class MateriaModule { }
