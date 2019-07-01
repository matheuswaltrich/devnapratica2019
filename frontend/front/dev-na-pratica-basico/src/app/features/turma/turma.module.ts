import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TurmaFormComponent } from './views/turma-form/turma-form.component';
import { TurmaListComponent } from './views/turma-list/turma-list.component';
import { TurmaRouterModule } from './turma.routing';
import { CardModule } from 'primeng/card';
import { AutoCompleteModule } from 'primeng/autocomplete';
import { ButtonModule } from '@seniorsistemas/angular-components';
import { TableModule } from 'primeng/table';
import { ReactiveFormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import {MultiSelectModule, DropdownModule} from 'primeng/primeng';
import { KeyFilterModule } from 'primeng/keyfilter';
import { CalendarModule } from 'primeng/calendar';
import { RadioButtonModule } from 'primeng/radiobutton';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { MessageService } from 'primeng/api';
import { TurmaResolver } from './views/turma-form/turma.resolver';

@NgModule({
  declarations: [TurmaFormComponent, TurmaListComponent],
  imports: [
    CommonModule,
    TurmaRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    AutoCompleteModule,
    MultiSelectModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,    
    DropdownModule,
    ToastModule
  ],
  providers: [
    MessageService,
    TurmaResolver
  ]
})
export class TurmaModule { }
