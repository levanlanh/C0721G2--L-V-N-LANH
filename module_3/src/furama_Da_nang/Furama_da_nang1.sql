drop database if exists furama_database;
create database furama_database;
use furama_database;

create table vi_tri(
id_vi_tri int primary key auto_increment,
ten_vi_tri varchar(45)
);

create table trinh_do(
id_trinh_do int primary key auto_increment,
ten_trinh_do varchar(45)
);

create table bo_phan(
id_bo_phan int primary key auto_increment,
ten_bo_phan varchar(45)
);
create table nhan_vien(
id_nhan_vien int primary key auto_increment,
ho_ten varchar(45) not null,
id_vi_tri int not null,
id_trinh_do int not null,
id_bo_phan int not null,
ngay_sinh date not null,
so_cmnd int not null,
luong int not null,
sdt int not null,
email varchar(45)not null,
dia_chi varchar(45)not null,
foreign key(id_vi_tri) references vi_tri(id_vi_tri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan)
);

create table loai_khach(
id_loai_khach int primary key auto_increment,
ten_loai_khach varchar(45)
);

create table khach_hang(
id_khach_hang int primary key auto_increment,
id_loai_khach int not null,
ho_ten varchar(45) not null,
ngay_sinh date,
so_cmnd int,
sdt int,
email varchar(45),
dia_chi varchar(45),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
);

create table kieu_thue(
id_kieu_thue int primary key auto_increment,
ten_kieu_thue varchar(45),
gia int
);

create table loai_dich_vu(
id_loai_dich_vu int primary key auto_increment,
ten_loai_dich_vu varchar(45)
);

create table dich_vu(
id_dich_vu int primary key auto_increment,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
so_nguoi_toi_da varchar(45),
chi_phi_thue varchar(45),
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai varchar(45),
foreign key (id_kieu_thue) references kieu_thue (id_kieu_thue),
foreign key (id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);


create table hop_dong(
id_hop_dong int primary key auto_increment,
id_nhan_vien int,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hop_dong date,
ngay_ket_thuc date,
tien_dat_coc int,
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien) ,
foreign key(id_khach_hang) references khach_hang(id_khach_hang) ,
foreign key(id_dich_vu) references dich_vu(id_dich_vu)
);


create table dich_vu_di_kem(
id_dich_vu_di_kem int primary key auto_increment,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung varchar(45)
);

create table hop_dong_chi_tiet(
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
primary key (id_hop_dong,id_dich_vu_di_kem),
 foreign key (id_hop_dong) references hop_dong(id_hop_dong),
 foreign key (id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)
);

-- task1
-- thêm mới vị trí nhân viên
insert into vi_tri(ten_vi_tri)
values('le tan'),('phuc vu'),('chuyen vien'),('giam sat'),('quan ly'),('giam doc');

-- thêm mới bộ phận nhân viên
insert into bo_phan(ten_bo_phan)
values ('quản lí'),('phục vụ'),('bảo vệ'),('vệ sinh');

-- thêm mới bộ phận trình độ 
insert into trinh_do(ten_trinh_do)
values ('trung cấp'),('cao đẳng'),('đại học'),('cấp 3');

-- thêm mới nhân viên
insert into nhan_vien(ho_ten,id_vi_tri,id_trinh_do,id_bo_phan,ngay_sinh,so_cmnd,luong,sdt,email,dia_chi)
value('văn lanh',1,1,1,'1999-02-18',2343234,19000000,0987654321,'abc@gmail.com','gialai'),
('văn bảo',2,2,2,'1987-02-28',2876234,30000000,0987676321,'xxxyy@gmail.com','hanoi'),
('văn kiên',1,1,1,'1995-08-18',238888884,34500000,0909999991,'baoyen@gmail.com','danang');

-- thêm mới loại khách 
insert into loai_khach(ten_loai_khach)
values('Vàng'),('Bạc'),('Bạch kim'),('Kim Cương'),('Đồng');

-- Thêm mới khách hàng
insert into khach_hang(id_loai_khach,ho_ten,ngay_sinh,so_cmnd,sdt,email,dia_chi)
values(1,'Hải Truong','1995-10-09',102021,09021231,'Truong@gmail.com','Quãng ngãi'),
(2,'Nam Cừ','1992-05-09',102021,09021231,'Hoa@gmail.com','Vinh'),
(3,'Ly Chiến','1995-10-09',102021,09021231,'LY@gmail.com','Quãng ngãi');

-- Thêm mới dịch vụ đi kèm
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai_kha_dung)
values ('Massage',10000,1,'San Sang'), 
('Karaoke',20000,1,'San Sang'), 
('Thức ăn',50000,1,'San Sang'),
 ('Nước uống',5000,1,'San Sang'),
 ('Xe tham quan',100000,1,'San Sang');
 
 -- Thêm mới kiểu thuê
insert into kieu_thue(ten_kieu_thue,gia)
values('Thuê Năm',100000),('Thuê Tháng',50000),('Thuê Ngày',1500),('Thuê Giờ',200);

-- Thêm mới loại dich vụ
insert into loai_dich_vu(ten_loai_dich_vu)
values('Villa'),('House'),('Room');

-- Thêm mới dịch vụ
insert into dich_vu(ten_dich_vu,dien_tich,so_tang,so_nguoi_toi_da,chi_phi_thue,id_kieu_thue,id_loai_dich_vu,trang_thai)
values('Villa',50,4,3,10000,1,1,'Ready'),
('House',40,5,2,5000,2,2,'Ready'),
('Room',20,4,3,600,4,3,'Ready');

-- Thêm mới hợp đồng
insert into hop_dong(id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc)
values
(1,2,1,'2018-2-18','2020-10-10',2000000),
(2,3,2,'2019-3-12','2021-10-10',4000000),
(3,1,1,'2020-1-2','2019-5-30',7000000),
(2,3,2,'2019-6-12','2021-10-10',4000000),
(1,2,2,'2020-9-16','2020-10-10',2000000),
(1,2,1,'2019-2-18','2020-10-10',2000000),
(2,3,2,'2019-6-12','2021-10-10',4000000),
(3,1,1,'2020-1-2','2019-5-30',7000000),
(1,2,2,'2019-12-12','2020-10-10',2000000),
(2,2,2,'2020-9-16','2020-10-10',2000000),
(1,2,2,'2019-9-16','2020-10-10',2000000);

-- Thêm mới hợp đồng chi tiết 
insert into hop_dong_chi_tiet(id_hop_dong,id_dich_vu_di_kem,so_luong)
values 
(4,2,2),
(1,2,3),
(2,1,6),
(2,3,1),
(3,5,4),
(5,3,2),
(6,4,1),
(9,1,4),
(8,1,3),
(7,5,5);