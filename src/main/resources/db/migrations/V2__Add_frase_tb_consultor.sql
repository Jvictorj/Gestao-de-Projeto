-- V2: Migrations para adicionar coluna de frase na tabela de consultor

ALTER TABLE tb_consultor
ADD COLUMN frase VARCHAR(255)