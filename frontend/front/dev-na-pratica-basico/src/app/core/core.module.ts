import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlunoModule } from './entities/aluno/aluno.module';
import { ProfessorModule } from './entities/professor/professor.module';
import { MateriaModule } from './entities/materia/materia.module';
import { TurmaModule } from './entities/turma/turma.module';
import { AlunoTurmaModule } from './entities/turma/alunoTurma/alunoTurma.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    AlunoModule,
    ProfessorModule,
    MateriaModule,
    TurmaModule,
    AlunoTurmaModule
  ]
})
export class CoreModule { }
