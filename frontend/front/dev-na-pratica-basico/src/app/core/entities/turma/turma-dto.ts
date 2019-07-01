import { Materia } from '../materia/materia';
import { Professor } from '../professor/professor';
import { AlunoTurma } from './alunoTurma/alunoTurma';
import { Aluno } from '../aluno/aluno';

export interface TurmaDto {
    id?: string;
    materia?: Materia;
    professor?: Professor;
    alunos?: AlunoTurma[];
    createdBy?: string;
    createdDate?: Date;
    lastModifiedBy?: string;
    lastModifiedDate?: Date;
    custom?: any;
  }


  