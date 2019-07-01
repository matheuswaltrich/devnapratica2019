import * as moment from 'moment';
import { MateriaDto } from './materia-dto';

export class Materia {
    public id?: string;
    public nome?: string;    
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(materiaDto: MateriaDto, originEntity?: string): Materia {
        const model: any = { ...materiaDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();        
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Materia;
    }

    public static toDto(materia: Materia, originEntity?: string): Materia {
        const dto: any = { ...materia };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();    
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
