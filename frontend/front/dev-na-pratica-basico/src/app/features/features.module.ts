import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { RouterModule } from '@angular/router';
import { AlunoModule } from './aluno/aluno.module';
import { ProfessorModule } from './professor/professor.module';
import { MateriaModule } from './materia/materia.module';
import { TurmaModule } from './turma/turma.module';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    AlunoModule,
    ProfessorModule,
    MateriaModule,
    TurmaModule
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
