CREATE DATABASE java

USE java

CREATE TABLE PRODUTOS (
	id INT PRIMARY KEY,
	nome VARCHAR(50),
	estoque INT,
	preco MONEY
)
-- login: usuario, fatec
INSERT produtos VALUES (1, 'Sabonete', 10, 2.34)
INSERT produtos VALUES (2, 'Detergente',25,1.99)
INSERT produtos VALUES (3, 'Omo', 5, 23.56)
INSERT produtos VALUES (4, 'Água Sanitária', 100, 5.78)
SELECT * FROM PRODUTOS
