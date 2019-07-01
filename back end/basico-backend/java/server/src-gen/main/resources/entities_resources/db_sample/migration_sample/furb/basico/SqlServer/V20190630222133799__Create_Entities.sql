/* Database: SqlServer. Generation date: 2019-06-30 22:21:33:799 */
/* Entity Aluno */
create table aluno (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	cpf VARCHAR(255) NOT NULL,
	devedor BIT
);



/* Entity Professor */
create table professor (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	cpf VARCHAR(255) NOT NULL
);



/* Entity Materia */
create table materia (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Turma */
create table turma (
	id UNIQUEIDENTIFIER NOT NULL,
	materia UNIQUEIDENTIFIER NOT NULL,
	professor UNIQUEIDENTIFIER NOT NULL,
	vagas NUMERIC(19) NOT NULL
);



/* Join Tables */
/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id UNIQUEIDENTIFIER NOT NULL,
	alunos_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table aluno add constraint pk_aluno_id primary key(id);
alter table professor add constraint pk_professor_id primary key(id);
alter table materia add constraint pk_materia_id primary key(id);
alter table turma_alunos add constraint pk_turma_alunos primary key(turma_id, alunos_id);
alter table turma add constraint pk_turma_id primary key(id);

/* Foreign Key Constraints */
alter table turma add constraint fkrgkrsoidrca1ohrzsms0t5dhyos1 foreign key (materia) references materia (id);
alter table turma add constraint fkjczp8dup0am7tf1u6wckb8t1hlti foreign key (professor) references professor (id);
alter table turma_alunos add constraint fkdjwfb0l0buaciyao3yncp2zmao0e foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkjxga8nlep1gp2rfsfblfi8h6kwn1 foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
