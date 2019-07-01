/* Database: SqlServer. Generation date: 2019-06-11 17:33:07:551 */
/* Entity Cliente */
create table cliente (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BIT /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id UNIQUEIDENTIFIER NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade FLOAT(32) NOT NULL,
	valor_unitario FLOAT(32) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id UNIQUEIDENTIFIER NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UNIQUEIDENTIFIER NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UNIQUEIDENTIFIER NOT NULL,
	itens_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkmvk2idaheo77fsrjy2rwghajg69h foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkj4yihdkd65n9lye07d35mhr3bwe6 foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fk7nx8rsku6zcnkrijfoqxytvq0fgn foreign key (itens_id) references item (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
