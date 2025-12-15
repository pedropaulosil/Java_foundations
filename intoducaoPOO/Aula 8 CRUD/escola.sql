CREATE DATABASE ESCOLA;
USE ESCOLA;

-- Comando para criar tabelas (create)
CREATE TABLE ALUNOS (
id int primary key auto_increment, 
nome varchar(10), 
nota1 decimal(4,2),
nota2 decimal(4,2)
);

INSERT INTO  alunos (nome, nota1, nota2)
values ("Joao,10,10");

select *from alunos;

-- Comando para apagar tabelas(drop)
DROP TABLE ALUNOS;

select*from alunos;