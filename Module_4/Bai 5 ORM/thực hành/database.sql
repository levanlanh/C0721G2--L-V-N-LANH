drop database if exists customer;
create database customer;
use customer;

create table customer(
id int primary key not null,
name varchar(35),
email varchar(50),
address varchar(70)
);
insert into customer values 
(1,"lanhlv","abc@gmail.com","gialai"),
(2,"luyenlv","abc123@gmail.com","phuquoc"),
(3,"loilv","ab33333c@gmail.com","hanoi"),
(4,"loclv","a1221bc@gmail.com","danang"),
(5,"Danhlv","ab2121212c@gmail.com","hue");