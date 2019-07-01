import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlunoListComponent } from './views/aluno-list/aluno-list.component';
import { AlunoRouterModule } from './aluno.routing';
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
import { AlunoFormComponent } from './views/aluno-form/aluno-form.component';
import { AlunoResolver } from './views/aluno-form/aluno.resolver';

@NgModule({
  declarations: [AlunoFormComponent, AlunoListComponent],
  imports: [
    CommonModule,
    AlunoRouterModule,
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
    AlunoResolver
  ]
})
export class AlunoModule { }
