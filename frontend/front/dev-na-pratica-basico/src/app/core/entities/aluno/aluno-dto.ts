export interface AlunoDto {
  id?: string;
  nome?: string;
  dataNascimento?: string;
  cpf?: string;
  devedor?: boolean;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
