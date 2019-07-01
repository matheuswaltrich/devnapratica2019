/* Database: Oracle. Generation date: 2019-06-30 22:21:33:814 */
/* Entity Aluno */
create table aluno (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	cpf VARCHAR(255) NOT NULL,
	devedor NUMBER(1)
);



/* Entity Professor */
create table professor (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	cpf VARCHAR(255) NOT NULL
);



/* Entity Materia */
create table materia (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Turma */
create table turma (
	id RAW(16) NOT NULL,
	materia RAW(16) NOT NULL,
	professor RAW(16) NOT NULL,
	vagas NUMBER(19) NOT NULL
);



/* Join Tables */
/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id RAW(16) NOT NULL,
	alunos_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table aluno add constraint pk_aluno_id primary key(id);
alter table professor add constraint pk_professor_id primary key(id);
alter table materia add constraint pk_materia_id primary key(id);
alter table turma_alunos add constraint pk_turma_alunos primary key(turma_id, alunos_id);
alter table turma add constraint pk_turma_id primary key(id);

/* Foreign Key Constraints */
alter table turma add constraint fkbgr0jlt1thrkhn4mfr5x6nc3by0r foreign key (materia) references materia (id);
alter table turma add constraint fkvpt0klpv9rgntgivpyvi9fmttlvf foreign key (professor) references professor (id);
alter table turma_alunos add constraint fkilviucmwyhpmzxuuonkx0ylahxdx foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkxlcioflcujahngcj8arafkgoqm6c foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
