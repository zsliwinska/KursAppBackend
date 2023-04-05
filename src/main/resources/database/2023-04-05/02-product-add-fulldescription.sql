--liquibase formatted sql
--changeset zsliwinska:4
alter table product add full_description text default null after description;