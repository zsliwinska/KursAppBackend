--liquibase formatted sql
--changeset zsliwinska:2
alter table product add image varchar(128) after currency;