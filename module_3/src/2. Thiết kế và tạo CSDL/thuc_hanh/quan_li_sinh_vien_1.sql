drop database if exists quan_ly_diem_thi;
CREATE DATABASE quan_ly_diem_thi;
USE quan_ly_diem_thi;
CREATE TABLE hoc_sinh(
    MaHS VARCHAR(20) PRIMARY KEY,
    TenHS VARCHAR(50),
    NgaySinh DATETIME,
    Lop VARCHAR(20),
    GT VARCHAR(20)
);
CREATE TABLE mon_hoc(
    MaMH VARCHAR(20) PRIMARY KEY,
    TenMH VARCHAR(50)
);
CREATE TABLE bang_diem(
    MaHS VARCHAR(20),
    MaMH VARCHAR(20),
    DiemThi INT,
    NgayKT DATETIME,
    PRIMARY KEY (MaHS, MaMH),
    FOREIGN KEY (MaHS) REFERENCES hoc_sinh(MaHS),
    FOREIGN KEY (MaMH) REFERENCES mon_hoc(MaMH)
);
CREATE TABLE giao_vien(
    MaGV VARCHAR(20) PRIMARY KEY,
    TenGV VARCHAR(20),
    SDT VARCHAR(10)
);
ALTER TABLE mon_hoc ADD MaGV VARCHAR(20);
ALTER TABLE mon_hoc ADD CONSTRAINT FK_MaGV FOREIGN KEY (MaGV) REFERENCES giao_vien(MaGV);
