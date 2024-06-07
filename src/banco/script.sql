create database java

use java
create table produtos (
	id int primary key,
	nome varchar(50),
	estoque int,
	preco money
)
-- usuario, fatec
insert produtos values (1,'Sabonete',10,2.34)
insert produtos values (2,'Detergente',25,1.99)
insert produtos values (3,'Omo',5,23.56)
insert produtos values (4,'Água Sanitária',100,5.78)
select * from produtos
