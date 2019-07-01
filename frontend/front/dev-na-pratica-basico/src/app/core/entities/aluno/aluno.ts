import * as moment from 'moment';
import { AlunoDto } from './aluno-dto';

export class Aluno {
    public id?: string;
    public nome?: string;
    public dataNascimento?: string;
    public cpf?: string;
    public devedor?: boolean;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(alunoDto: AlunoDto, originEntity?: string): Aluno {
        const model: any = { ...alunoDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.dataNascimento = model.dataNascimento && moment(model.dataNascimento).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Aluno;
    }

    public static toDto(aluno: Aluno, originEntity?: string): Aluno {
        const dto: any = { ...aluno };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.dataNascimento = dto.dataNascimento && moment(dto.dataNascimento).format('YYYY-MM-DD');        
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
