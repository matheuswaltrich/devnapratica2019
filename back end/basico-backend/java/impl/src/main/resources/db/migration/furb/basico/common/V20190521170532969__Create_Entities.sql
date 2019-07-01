/* Database: PostgreSql. Generation date: 2019-06-23 21:21:04:844 */
/* Entity Item */
create table item (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UUID NOT NULL
);



/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL
);



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
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

/* master: Turma as turma, detail: Aluno as aluno */
create table turma_alunos (
	turma_id UUID NOT NULL,
	alunos_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);
alter table cliente add constraint pk_cliente_id primary key(id);
alter table aluno add constraint pk_aluno_id primary key(id);
alter table professor add constraint pk_professor_id primary key(id);
alter table materia add constraint pk_materia_id primary key(id);
alter table turma_alunos add constraint pk_turma_alunos primary key(turma_id, alunos_id);
alter table turma add constraint pk_turma_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkdd77nfxpfvz0hu9cdsg8aniyjt01 foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fknostq7fqqu53fm98xrv4zmaw1css foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkdkx9qtcqlfvtypvwgoyyj2jo1pr9 foreign key (itens_id) references item (id);
alter table turma add constraint fkvepd2csjn6jrmfs2jpca6rmrwuqr foreign key (materia) references materia (id);
alter table turma add constraint fk7qxkeucrjz7n3qtmhsgznwh27nd8 foreign key (professor) references professor (id);
alter table turma_alunos add constraint fkkp7gaqimyeauvn6xwaj5jsixeekd foreign key (turma_id) references turma (id);
alter table turma_alunos add constraint fkibim5amb54jhlgs1awqvvfjohdfb foreign key (alunos_id) references aluno (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
