drop database if exists don_hang;
create database don_hang;
use don_hang;

create table phieu_xuat(
so_phieu_xuat int primary key,
ngay_xuat date
);

create table vat_tu(
ma_vat_tu int primary key,
ten_vat_tu varchar(60)
);

create table phieu_nhap(
so_phieu_nhap int primary key,
ngay_nhap date);

create table don_dat_hang(
so_dat_hang int primary key,
ngay_dat_hang date);

create table nhacc(
ma_ncc int primary key,
ten_ncc varchar(45),
dia_chi varchar(45),
sdt varchar(45)
);

create table chi_tiet_phieu_xuat (
dg_xuat int,
sl_xuat int,
so_phieu_xuat_id int,
ma_vat_tu_id int ,
primary key (so_phieu_xuat_id,ma_vat_tu_id),
foreign key (so_phieu_xuat_id) references phieu_xuat(so_phieu_xuat),
foreign key (ma_vat_tu_id) references vat_tu(ma_vat_tu)
);

create table chi_tiet_phieu_nhap(
dg_nhap int,
sl_nhap int,
ma_vat_tu int,
so_phieu_nhap int,
primary key (ma_vat_tu,so_phieu_nhap),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_phieu_nhap) references phieu_nhap(so_phieu_nhap)
);

create table chi_tiet_don_dat_hang(
ma_vat_tu int,
so_don_hang int,
primary key (ma_vat_tu,so_don_hang),
foreign key (ma_vat_tu) references vat_tu(ma_vat_tu),
foreign key (so_don_hang) references don_dat_hang(so_dat_hang)
);

create table cung_cap(
so_don_hang int,
ma_ncc int ,
primary key(so_don_hang,ma_ncc),
foreign key (so_don_hang) references don_dat_hang(so_dat_hang),
foreign key (ma_ncc) references nhacc(ma_ncc)
);
