import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TurmaListComponent } from './views/turma-list/turma-list.component';
import { TurmaFormComponent } from './views/turma-form/turma-form.component';
import { TurmaResolver } from './views/turma-form/turma.resolver';

const routes: Routes = [{
  path: 'turma',  children: [
    {
      path: 'create', component: TurmaFormComponent
    },
    {
      path: 'list', component: TurmaListComponent
    },
    {
      path: 'edit/:id', component: TurmaFormComponent, resolve: [TurmaResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class TurmaRouterModule { }
