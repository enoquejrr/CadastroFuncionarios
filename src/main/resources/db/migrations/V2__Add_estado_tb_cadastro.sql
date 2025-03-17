-- V2: Migrations para adicionar a coluna ESTADO na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN estado VARCHAR(255);