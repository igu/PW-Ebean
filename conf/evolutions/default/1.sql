# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cliente (
  codigo                        integer auto_increment not null,
  endereco                      varchar(255) not null,
  telefone                      varchar(255),
  constraint pk_cliente primary key (codigo)
);

create table compra (
  codigo                        integer auto_increment not null,
  livro_isbn                    varchar(255) not null,
  cliente_codigo                integer not null,
  constraint pk_compra primary key (codigo)
);

create table editora (
  codigo                        integer auto_increment not null,
  endereco                      varchar(255) not null,
  gerente                       varchar(255) not null,
  telefone                      varchar(255) not null,
  constraint pk_editora primary key (codigo)
);

create table livro (
  isbn                          varchar(255) not null,
  autor                         varchar(255) not null,
  qtde                          integer,
  assunto                       varchar(255) not null,
  editora_codigo                integer,
  constraint pk_livro primary key (isbn)
);

create index ix_compra_livro_isbn on compra (livro_isbn);
alter table compra add constraint fk_compra_livro_isbn foreign key (livro_isbn) references livro (isbn) on delete restrict on update restrict;

create index ix_compra_cliente_codigo on compra (cliente_codigo);
alter table compra add constraint fk_compra_cliente_codigo foreign key (cliente_codigo) references cliente (codigo) on delete restrict on update restrict;

create index ix_livro_editora_codigo on livro (editora_codigo);
alter table livro add constraint fk_livro_editora_codigo foreign key (editora_codigo) references editora (codigo) on delete restrict on update restrict;


# --- !Downs

alter table compra drop constraint if exists fk_compra_livro_isbn;
drop index if exists ix_compra_livro_isbn;

alter table compra drop constraint if exists fk_compra_cliente_codigo;
drop index if exists ix_compra_cliente_codigo;

alter table livro drop constraint if exists fk_livro_editora_codigo;
drop index if exists ix_livro_editora_codigo;

drop table if exists cliente;

drop table if exists compra;

drop table if exists editora;

drop table if exists livro;

