--liquibase formatted sql
--changeset zsliwinska:5
create table category(
                         id bigint not null auto_increment PRIMARY KEY,
                         name varchar(255) not null,
                         description text,
                         slug varchar(255) not null
);