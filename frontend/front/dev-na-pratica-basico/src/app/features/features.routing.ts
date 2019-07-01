import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
{
  path: 'aluno', redirectTo: 'aluno/list'
},
{
  path: 'professor', redirectTo: 'professor/list'
},
{
  path: 'materia', redirectTo: 'materia/list'
},
{
  path: 'turma', redirectTo: 'turma/list'
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FeaturesRouterModule { }
