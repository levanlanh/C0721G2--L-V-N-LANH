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
name VARCHAR(45)NULL,
PRIMARY KEY(id));
CREATE TABLE teacher(
id INT NOT NULL,
name VARCHAR(45)NULL,
age INT NULL,
country VARCHAR(45)NULL,
PRIMARY KEY(id));