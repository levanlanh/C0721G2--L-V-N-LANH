drop database if exists student_management;
create database student_management;
use student_management;
CREATE TABLE student(
id INT NOT NULL,
name VARCHAR(45)NULL,
age INT NULL,
country VARCHAR(45)NULL,
PRIMARY KEY(id));
CREATE TABLE class(
id INT NOT NULL,
name VARCHAR(15)NULL,
PRIMARY KEY(id));
CREATE TABLE teacher(
id INT NOT NULL,
name VARCHAR(45)NULL,
age INT NULL,
country VARCHAR(45)NULL,
PRIMARY KEY(id));

insert into student 
values(1,'hung',23,'viet nam'),
(2,'long',53,'trung quốc'),
(3,'hien',43,'mỹ'),
(4,'thien',13,'anh'),
(5,'hoa',63,'mỹ');

insert into class 
values (1,'c0821g1'),
 (2,'c0821g1'),
 (3,'c0721g1'),
 (4,'c0721g1'),
 (5,'c0921g1');
 
 insert into teacher 
 values(1,'hoa',23,'viet nam'),
 (2,'ku',33,'viet nam'),
 (3,'hung',76,'viet nam'),
 (4,'hue',43,'viet nam'),
 (5,'khien',55,'viet nam');

