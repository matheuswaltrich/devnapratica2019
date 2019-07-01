import * as moment from 'moment';
import { AlunoTurmaDto } from './Alunoturma-dto';
import { Aluno } from '../../aluno/aluno';

export class AlunoTurma {
    public id?: string;
    public aluno: Aluno;    
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(alunoTurmaDto: AlunoTurmaDto, originEntity?: string): AlunoTurma {
        const model: any = { ...alunoTurmaDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();        
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as AlunoTurma;
    }

    public static toDto(alunoTurmaDto: AlunoTurma, originEntity?: string): AlunoTurma {
        const dto: any = { ...alunoTurmaDto };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();    
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
