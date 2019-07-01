import { AlunoDto } from '../../aluno/aluno-dto';

export interface AlunoTurmaDto {
    id?: string;
    turma?: any;
    aluno: AlunoDto;
    createdBy?: string;
    createdDate?: Date;
    lastModifiedBy?: string;
    lastModifiedDate?: Date;
    custom?: any;
}


  