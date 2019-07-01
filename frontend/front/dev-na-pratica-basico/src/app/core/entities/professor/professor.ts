import * as moment from 'moment';
import { ProfessorDto } from './professor-dto';

export class Professor {
    public id?: string;
    public nome?: string;
    public dataNascimento?: string;
    public cpf?: string;    
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(professorDto: ProfessorDto, originEntity?: string): Professor {
        const model: any = { ...professorDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.dataNascimento = model.dataNascimento && moment(model.dataNascimento).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Professor;
    }

    public static toDto(professor: Professor, originEntity?: string): Professor {
        const dto: any = { ...professor };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.dataNascimento = dto.dataNascimento && moment(dto.dataNascimento).format('YYYY-MM-DD');        
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
