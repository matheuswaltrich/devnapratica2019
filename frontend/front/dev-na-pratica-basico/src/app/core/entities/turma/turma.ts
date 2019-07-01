import * as moment from 'moment';
import { TurmaDto } from './turma-dto';
import { Materia } from '../materia/materia';
import { Professor } from '../professor/professor';
import { AlunoTurma } from './alunoTurma/alunoTurma';
import { Aluno } from '../aluno/aluno';

export class Turma {
    public id?: string;
    public materia?: Materia;
    public professor?: Professor;
    public alunos?: AlunoTurma[];    
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(turmaDto: TurmaDto, originEntity?: string): Turma {
        const model: any = { ...turmaDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();        
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Turma;
    }

    public static toDto(turma: Turma, originEntity?: string): Turma {
        const dto: any = { ...turma };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();    
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
