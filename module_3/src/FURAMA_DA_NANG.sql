drop database if exists Furama_Da_Nang;
create database Furama_Da_Nang;
use Furama_Da_Nang;
CREATE TABLE kieu_thue(
id int NOT NULL,
ten_kieu_thue varchar(45),
gia_thue double,
PRIMARY KEY (id)
);
CREATE TABLE DICHVU(
ma_dich_vu INT NOT NULL,
ten_dich_vu VARCHAR(45)NULL,
dien_tich_su_dung INT NOT NULL,
chi_phi_thue DOUBLE,
so_luong_nguoi INT NOT NULL,
ma_kieu_thue INT NOT NULL,
ma_loai_dich_vu INT NOT NULL,
tieu_chuan_phong VARCHAR(45),
dien_tich_ho_boi DOUBLE,
so_tang INT NOT NULL,
PRIMARY KEY (ma_dich_vu),
FOREIGN KEY(ma_kieu_thue) REFERENCES kieu_thue(id)
);
