/* Database: PostgreSql. Generation date: 2019-06-30 22:21:33:799 */
/* Entity Aluno */
create table aluno (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	cpf VARCHAR(255) NOT NULL,
	devedor BOOLEAN
);



/* Entity Professor */
create table professor (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	cpf VARCHAR(255) NOT NULL
);



/* Entity Materia */
create table materia (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL
);



/* Entity Turma */
create table turma (
	id UUID NOT NULL,
	materia UUID NOT NULL,
	professor UUID NOT NULL,
	vagas NUMERIC(19) NOT NULL
);



/* Join Tables */
/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id UUID NOT NULL,
	alunos_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table aluno add constraint pk_aluno_id primary key(id);
alter table professor add constraint pk_professor_id primary key(id);
alter table materia add constraint pk_materia_id primary key(id);
alter table turma_alunos add constraint pk_turma_alunos primary key(turma_id, alunos_id);
alter table turma add constraint pk_turma_id primary key(id);

/* Foreign Key Constraints */
alter table turma add constraint fk5pepzwmki9fjxsn600urbonjuf1i foreign key (materia) references materia (id);
alter table turma add constraint fkuj6cqlzfgbqav3cipsbhigfaknpe foreign key (professor) references professor (id);
alter table turma_alunos add constraint fkaagpmfmz4gaaukha5dl6bc1dajn2 foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkjwgjsmpwqwkitwexfkagv0ioc79d foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
