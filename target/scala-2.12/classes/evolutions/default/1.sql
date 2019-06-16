# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table compra (
  codigo                        integer auto_increment not null,
  livro_isbn                    varchar(255),
  fisico_codigo                 integer,
  juridico_codigo               integer,
  constraint pk_compra primary key (codigo)
);

create table editora (
  codigo                        integer auto_increment not null,
  endereco                      varchar(35) not null,
  gerente                       varchar(25) not null,
  telefone                      varchar(15) not null,
  constraint pk_editora primary key (codigo)
);

create table fisico (
  codigo                        integer auto_increment not null,
  endereco                      varchar(25) not null,
  telefone                      varchar(15) not null,
  cpf                           varchar(11) not null,
  constraint pk_fisico primary key (codigo)
);

create table juridico (
  codigo                        integer auto_increment not null,
  endereco                      varchar(25) not null,
  telefone                      varchar(15) not null,
  cnpj                          varchar(14) not null,
  constraint pk_juridico primary key (codigo)
);

create table livro (
  isbn                          varchar(255) not null,
  autor                         varchar(25) not null,
  qtde                          integer not null,
  assunto                       varchar(255) not null,
  editora_codigo                integer,
  constraint pk_livro primary key (isbn)
);

create index ix_compra_livro_isbn on compra (livro_isbn);
alter table compra add constraint fk_compra_livro_isbn foreign key (livro_isbn) references livro (isbn) on delete restrict on update restrict;

create index ix_compra_fisico_codigo on compra (fisico_codigo);
alter table compra add constraint fk_compra_fisico_codigo foreign key (fisico_codigo) references fisico (codigo) on delete restrict on update restrict;

create index ix_compra_juridico_codigo on compra (juridico_codigo);
alter table compra add constraint fk_compra_juridico_codigo foreign key (juridico_codigo) references juridico (codigo) on delete restrict on update restrict;

create index ix_livro_editora_codigo on livro (editora_codigo);
alter table livro add constraint fk_livro_editora_codigo foreign key (editora_codigo) references editora (codigo) on delete restrict on update restrict;


# --- !Downs

alter table compra drop constraint if exists fk_compra_livro_isbn;
drop index if exists ix_compra_livro_isbn;

alter table compra drop constraint if exists fk_compra_fisico_codigo;
drop index if exists ix_compra_fisico_codigo;

alter table compra drop constraint if exists fk_compra_juridico_codigo;
drop index if exists ix_compra_juridico_codigo;

alter table livro drop constraint if exists fk_livro_editora_codigo;
drop index if exists ix_livro_editora_codigo;

drop table if exists compra;

drop table if exists editora;

drop table if exists fisico;

drop table if exists juridico;

drop table if exists livro;

