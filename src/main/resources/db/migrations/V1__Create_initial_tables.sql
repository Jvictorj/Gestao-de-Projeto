-- Versão 1: Criação das tabelas iniciais com base nos Models

-- Cria a tabela de projetos
CREATE TABLE TB_PROJETO (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            titulo VARCHAR(255),
                            descricao VARCHAR(255),
                            data_inicio DATE,
                            data_fim_prevista DATE,
                            status VARCHAR(255)
);

-- Cria a tabela de consultores e a ligação com projetos
CREATE TABLE TB_CONSULTOR (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                              nome VARCHAR(255) NOT NULL,
                              email VARCHAR(255) NOT NULL UNIQUE,
                              idade INT,
                              cargo VARCHAR(255),
                              projetos_id BIGINT,
                              FOREIGN KEY (projetos_id) REFERENCES TB_PROJETO(id)
);