drop database if exists quan_ly_ban_hang ; 

create database quan_ly_ban_hang; 

use quan_ly_ban_hang ; 

create table customer(
customer_id int, 
customer_name varchar(50),
customer_age int,
primary key(customer_id) 
);

create table _order(
order_id int primary key, 
oder_date date, 
oder_toltal_price float,
customer_id_order int ,
foreign key (customer_id_order) references customer(customer_id)
);

create table product(
product_id int primary key ,
product_name varchar(50),
product_price float
);

create table order_detail(
order_id_detail int ,
product_id_detail int ,
oder_qty  int ,
primary key(order_id_detail,product_id_detail),
foreign key (order_id_detail) references _order(order_id),
foreign key (product_id_detail) references product(product_id)
);

