drop database if exists Furama_Da_Nang;
create database Furama_Da_Nang;
use Furama_Da_Nang;

CREATE TABLE kieu_thue(
id int NOT NULL,
ten_kieu_thue varchar(45),
gia_thue double,
PRIMARY KEY (id)
);

create table loai_dich_vu(
ma_loai_dich_vu int,
ten_loai_dich_vu varchar(45),
primary key (ma_loai_dich_vu)
);

CREATE TABLE dich_vu(
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
FOREIGN KEY(ma_kieu_thue) REFERENCES kieu_thue(id),
FOREIGN KEY (ma_loai_dich_vu) REFERENCES loai_dich_vu(ma_loai_dich_vu)
);

create table loai_khach(
ma_loai_khach int,
ten_loai_khach varchar(45),
primary key (ma_loai_khach)
);

create table khach_hang(
ma_khach_hang int,
ma_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
primary key ( ma_khach_hang),
FOREIGN KEY (ma_loai_khach) REFERENCES loai_khach(ma_loai_khach)
);
create table hop_dong(
ma_hop_dong int,
ngay_lam_hop_dong DATETIME,
ngay_ket_thuc DATETIME,
tien_dat_coc DOUBLE,
tong_tien DOUBLE,
ma_nhan_vien INT,
ma_khach_hang INT,
ma_dich_vu INT,
PRIMARY KEY (ma_hop_dong),
FOREIGN KEY (ma_dich_vu) REFERENCES dich_vu(ma_dich_vu),
FOREIGN KEY (ma_khach_hang) REFERENCES khach_hang(ma_khach_hang)
);
create table dich_vu_di_kem(
ma_dich_vu_di_kem int,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi int,
trang_thai varchar(45),
primary key ( ma_dich_vu_di_kem)

);
create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int,
ma_hop_dong int,
ma_dich_vu_di_kem int,
so_luong int,
primary key (ma_hop_dong_chi_tiet),
foreign key (ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key (ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);

