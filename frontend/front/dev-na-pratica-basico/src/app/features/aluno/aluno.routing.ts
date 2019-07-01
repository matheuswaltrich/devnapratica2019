import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AlunoListComponent } from './views/aluno-list/aluno-list.component';
import { AlunoFormComponent } from './views/aluno-form/aluno-form.component';
import { AlunoResolver } from './views/aluno-form/aluno.resolver';

const routes: Routes = [{
  path: 'aluno',  children: [
    {
      path: 'create', component: AlunoFormComponent
    },

    {
      path: 'list', component: AlunoListComponent
    },
    {
      path: 'edit/:id', component: AlunoFormComponent, resolve: [AlunoResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AlunoRouterModule { }
