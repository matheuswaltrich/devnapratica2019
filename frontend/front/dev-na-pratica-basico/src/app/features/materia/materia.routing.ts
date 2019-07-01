import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MateriaListComponent } from './views/materia-list/materia-list.component';
import { MateriaFormComponent } from './views/materia-form/materia-form.component';
import { MateriaResolver } from './views/materia-form/materia.resolver';

const routes: Routes = [{
  path: 'materia',  children: [
    {
      path: 'create', component: MateriaFormComponent
    },

    {
      path: 'list', component: MateriaListComponent
    },
    {
      path: 'edit/:id', component: MateriaFormComponent, resolve: [MateriaResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class MateriaRouterModule { }
