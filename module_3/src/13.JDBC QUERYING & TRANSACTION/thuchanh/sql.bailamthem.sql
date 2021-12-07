drop database if exists sinhVien;
create database sinhVien;
USE sinhVien;

create table sinhVien(
id int primary key not null,
hoTen varchar(15),
gioiTinh varchar(5),
tuoi int ,
diemTrungBinh float
);
insert into sinhVien(id,hoTen,gioiTinh,tuoi,diemTrungBinh) values(1,"lanh","nam",13,7);
insert into sinhVien(id,hoTen,gioiTinh,tuoi,diemTrungBinh) values(2,"hieu","nam",33,9);
insert into sinhVien(id,hoTen,gioiTinh,tuoi,diemTrungBinh) values(3,"an","nam",23,5);
insert into sinhVien(id,hoTen,gioiTinh,tuoi,diemTrungBinh) values(4,"týn","nam",26,5);