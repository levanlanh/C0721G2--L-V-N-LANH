drop database if exists furama;
create database furama;
use furama;
SET SQL_SAFE_UPDATES = 0;
create table vitri(
id_vitri int auto_increment primary key,
ten_vi_tri varchar(45)
);
insert into vitri values
(1,'GM'),(2,'Manager'),(3,'Supervisor'),(4,'Employee'), (5,'Sever'),(6, 'Receptionist');
create table trinh_do(
id_trinh_do int auto_increment primary key,
trinh_do varchar(45)
);
insert into trinh_do  values
(1,'DH'),(2,'CD'),(3,'TC');
create table bo_phan(
id_bo_phan int auto_increment primary key,
ten_bo_phan varchar(45)
);
insert into bo_phan values
(1,'operation'),(2,'kitchen'),(3,'restaurant');
create table loai_khach(
id_loai_khach int auto_increment primary key,
ten_loai_khach varchar(45)
);
insert into loai_khach values
(1,'Diamond'),(2,'Platium'),(3,'Gold'),(4,'Sliver'),(5,'Member');
create table kieu_thue(
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45),
gia int
);
insert into kieu_thue values (1,'Day',1000),(2,'Week',5000),(3,'Month',1500);
create table loai_dich_vu(
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45)
);
insert into loai_dich_vu(id_loai_dich_vu,ten_loai_dich_vu) values
(1,'Villa'),(2,'House'),(3,'Room');
create table nhan_vien(
id_nhan_vien int auto_increment primary key,
ho_ten varchar(45),
id_vitri int,
id_trinh_do int,
id_bo_phan int,
ngay_sinh date,
so_CMTND varchar(45),
luong varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_vitri) references vitri(id_vitri),
foreign key(id_trinh_do) references trinh_do(id_trinh_do),
foreign key(id_bo_phan) references bo_phan(id_bo_phan)
);
insert into nhan_vien (id_nhan_vien, ho_ten,id_vitri,id_trinh_do, id_bo_phan, ngay_sinh, so_CMTND, luong, sdt, email, dia_chi) values
(1001,'Truong Hung',1,2,3,'1989-09-09', 'A123456', 10, 0905112112, 'TruongHung@gmail.com', 'Hải Châu'),
(1002,'Nguyen Thao',2,3,3,'1990-09-08', 'A123457', 20, 0863159875, 'NguyenThao@gmail.com', 'Liên Chiểu'),
(1003,'Hoang Khoi',3,3,2,'1989-08-08', 'A123458', 30, 0121589789, 'HoangKhoi@gmail.com', 'Hải Châu'),
(1004,'Nguyen Hung',3,2,3,'1986-08-08', 'A123459', 30, 0987154698, 'NguyenHung@gmail.com', 'Hòa phú'),
(1005,'Nguyen Hoang',3,2,3,'1988-01-01', 'A123489', 30, 0121458987, 'NguyenHoang@gmail.com', 'Hòa Vang');
create table khach_hang(
id_khach_hang int auto_increment primary key,
id_loai_khach int,
ho_ten varchar(45),
ngay_sinh date,
so_cmtnd varchar(45),
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key(id_loai_khach) references loai_khach(id_loai_khach)
);
insert into khach_hang(id_khach_hang, id_loai_khach, ho_ten, ngay_sinh,sdt, dia_chi) values
(101,5,'Nguyen Anh', '1981-10-20',0987654321, 'Da Nang'),
(102,1,'Nguyen Binh', '1988-11-20',098989898, 'Quang Ngai'),
(103,2,'Nguyen An', '1963-10-20',098765678, 'Quang Nam'),
(104,1,'Nguyen Trai', '1982-09-20',09876877, 'Quang Ngai'),
(105,4,'Doan Truong', '1983-11-20',0987677677, 'Hue'),
(106,2,'Nguyen Anh', '1981-10-20',09877884, 'Da Nang'),
(107,5,'Dinh Thang', '1985-06-20',098777788, 'Ho Chi Minh');
create table dich_vu(
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(45),
dien_tich int,
so_tang int,
dien_tich_ho_boi int,
so_nguoi_toi_da int,
chi_phi_thue int,
id_kieu_thue int,
id_loai_dich_vu int,
trang_thai bit,
foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);
insert dich_vu(id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,id_kieu_thue,dien_tich_ho_boi,so_tang,id_loai_dich_vu,trang_thai)
values
(1,'Villa',500,500,6,1,30,2,1,1);
insert dich_vu(id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,id_kieu_thue,so_tang,id_loai_dich_vu,trang_thai)
values
(2,'House',300,300,5,2,3,2,1);
insert dich_vu(id_dich_vu,ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,id_kieu_thue,id_loai_dich_vu,trang_thai)
values
(3,'Room',200,200,2,3,3,1);
create table hop_dong(
id_hop_dong int auto_increment primary key,
id_nhan_vien int ,
id_khach_hang int,
id_dich_vu int,
ngay_lam_hd date ,
ngay_ket_thuc date,
tien_dat_coc int,
tong_tien int,
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien) on delete set null,
foreign key(id_khach_hang) references khach_hang(id_khach_hang) on delete set null,
foreign key(id_dich_vu) references dich_vu(id_dich_vu) on delete set null
);
insert into hop_dong(id_hop_dong,id_nhan_vien,id_khach_hang,id_dich_vu,ngay_lam_hd,ngay_ket_thuc,tien_dat_coc,tong_tien)
values (1,1004,101,1,'2015-08-11','2016-12-16',20,12000),
       (2,1002,102,2,'2018-07-21','2018-10-10',30,300),
	   (3,1003,103,3,'2021-05-01','2021-08-12',5,50),
	   (4,1003,104,3,'2019-12-12','2019-12-19',10,1000),
	   (5,1005,107,2,'2019-10-10','2019-10-11',50,5000),
	   (6,1003,107,3,'2019-12-12','2019-12-15',50,11000);
create table dich_vu_di_kem(
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(45),
gia int,
don_vi int,
trang_thai_kha_dung bit default 0
);
insert into dich_vu_di_kem (id_dich_vu_di_kem, ten_dich_vu_di_kem, gia,don_vi,trang_thai_kha_dung) values
(1,'Freepool',50,3,1),(2,'Free Breakfast',20,5,1);
create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int auto_increment primary key,
id_hop_dong int,
id_dich_vu_di_kem int,
so_luong int,
-- unique(id_hopdong,id_dich_vu_di_kem),
foreign key(id_hop_dong) references hop_dong(id_hop_dong) on delete set null,
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem) on delete set null
);
insert into hop_dong_chi_tiet(id_hop_dong_chi_tiet,id_hop_dong,id_dich_vu_di_kem,so_luong)
values (1,1,2,3),
       (2,2,1,4),
       (3,3,2,9),
       (4,5,1,25),
       (5,4,2,25),
       (6,6,2,5)
       ;
-------------------------------------------------------------- task2 -----------------------------------------------------------
-- Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu t, k ,h
-- là một trong các ký tự  và có tối đa 15 ký tự
  select * from nhan_vien 
  where (ho_ten  like 'k%' or ho_ten like't%'
  or ho_ten like 'h%') and char_length(ho_ten) < 15;
--  -------------------------------------------------------------- task3 -----------------------------------------------------------
  -- Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi 
  -- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
  select * 
  from khach_hang
  where timestampdiff(year,ngay_sinh,curdate()) between 18 and 50 and 
  dia_chi in('đà nẵng' ,'quãng trị');
--   
-- ------------------------------------------------------------ task4 -----------------------------------------------------------
-- -- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
-- -- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- -- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select lk.ten_loai_khach,kh.ho_ten,hd.id_hop_dong,count(kh.id_khach_hang) as solanthue
from loai_khach lk
	join khach_hang kh
		on lk.id_loai_khach = kh.id_loai_khach
	join hop_dong hd
		on kh.id_khach_hang = hd.id_khach_hang
where lk.id_loai_khach = 2
group by kh.id_khach_hang
	order by kh.id_khach_hang;

-- -- ----------------------------------- task5 ------------------------------------------------------------
-- -- Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong,
--  -- ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia,
--  -- với SoLuong và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng
--  -- đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra)
--  
 select kh.id_khach_hang,kh.ho_ten,lk.ten_loai_khach,hd.id_hop_dong,dv.ten_dich_vu,hd.ngay_lam_hd,
        hd.ngay_ket_thuc,sum(dv.chi_phi_thue + hdct.so_luong * dvdk.gia ) as 'tổng tiền'
        from khach_hang kh 
        left join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
        left join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
        left join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
        left join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
        left join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
        group by kh.ho_ten;
        
        --------------------------------------- task6 ---------------------------------------
 -- Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của 
 -- tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt
 -- từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
 
 select dv.id_dich_vu, dv.ten_dich_vu,dv.chi_phi_thue,dv.dien_tich,ldv.id_loai_dich_vu
from dich_vu dv 
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
where (year(hd.ngay_lam_hd) > '2019') or (month(hd.ngay_lam_hd ) > 3 ) or (year(hd.ngay_lam_hd ) < '2019')  ;

------------------------------------------------------ task7 -------------------------------------------------
-- Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue,
-- ten_loai_dich_vu của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2018
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2019.

select dv.id_dich_vu, dv.ten_dich_vu , dv.dien_tich,dv.chi_phi_thue,ldv.id_loai_dich_vu
from dich_vu dv
join hop_dong hd on dv.id_dich_vu = hd.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
where (year(hd.ngay_lam_hd) = 2018)  and not (year(hd.ngay_lam_hd) = 2019)  ;
 
 ------------------------------------------------------ task8 ----------------------------------------------------
-- Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- cách 1
select distinct kh.ho_ten
from khach_hang kh ;

-- cách 2
select kh.ho_ten
from khach_hang kh
union
select kh.ho_ten
from khach_hang kh;

-- cách 3
select kh.ho_ten
from khach_hang kh
group by kh.ho_ten;
-------------------------------------------------------- task9 ---------------------------------------------------------

-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(hd.ngay_lam_hd) as 'tháng' ,kh.id_khach_hang,count(kh.id_khach_hang) as ' số lần '
from khach_hang kh
join hop_dong hd on kh.id_khach_hang = hd.id_khach_hang
where year(hd.ngay_lam_hd) = 2019 
 group by tháng 
 order by hd.ngay_lam_hd;

----------------------------------------------------------- task10 -------------------------------------------------
-- Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc,
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select hd.id_hop_dong,hd.ngay_lam_hd,hd.ngay_ket_thuc,hd.tien_dat_coc, hdct.so_luong,sum(dvdk.id_dich_vu_di_kem) as 'số lần'
from hop_dong hd 
join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
join dich_vu_di_kem dvdk on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
group by hd.id_hop_dong
order by hd.id_hop_dong;
------------------------------------------------------- task11 ------------------------------------------------------------
-- 	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond”
--  và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
select  dvdk.id_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem,dvdk.gia,dvdk.don_vi,dvdk.trang_thai_kha_dung
from dich_vu_di_kem dvdk 
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
join loai_khach lk on kh.id_loai_khach = lk.id_loai_khach
where lk.ten_loai_khach = 'Diamond' and (kh.dia_chi = 'vinh' or kh.dia_chi = 'Quang Ngai');

--------------------------------------------------------- task12 ---------------------------------------------------------------
-- Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng),
 -- ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem),
 -- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019
 -- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
 
 select hd.id_hop_dong,nv.ho_ten,kh.ho_ten,kh.sdt,dv.ten_dich_vu,count(hdct.so_luong) as 'số lượng dịch vụ đi kèm', hd.tien_dat_coc
 from hop_dong hd 
 join nhan_vien nv on hd.id_nhan_vien = nv.id_nhan_vien
 join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
 join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
 join hop_dong_chi_tiet hdct on hd.id_hop_dong = hdct.id_hop_dong
 join dich_vu_di_kem dvdk on hdct.id_dich_vu_di_kem = dvdk.id_dich_vu_di_kem
 where (hd.ngay_lam_hd between '2019-10-01' and '2019-12-31'  ) and not (year(hd.ngay_lam_hd) = 2019 and month(hd.ngay_lam_hd) = 6) 
 group by hd.id_hop_dong;
 
 --------------------------------------------------- task13 ----------------------------------------------------------------
 -- Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng.
 -- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
 select   dvdk.id_dich_vu_di_kem,dvdk.ten_dich_vu_di_kem,dvdk.gia,dvdk.don_vi,dvdk.trang_thai_kha_dung ,
 count(dvdk.id_dich_vu_di_kem) 
from dich_vu_di_kem dvdk 
join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
 group by  dvdk.id_dich_vu_di_kem
 having count(dvdk.id_dich_vu_di_kem) = (select count(dvdk.id_dich_vu_di_kem) as 'dịch vụ đi kèm nhiều nhất'
 from dich_vu_di_kem dvdk 
 join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join khach_hang kh on hd.id_khach_hang = kh.id_khach_hang
 group by  dvdk.id_dich_vu_di_kem
limit 1);
--------------------------------------------------------- task14 ------------------------------------------------------------
-- Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất.
 -- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem,
 -- so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
 select * -- hd.id_hop_dong,ldv.ten_loai_dich_vu,ldv.ten_loai_dich_vu, sum(dvdk.id_dich_vu_di_kem) as 'số lần sử dụng'
  from dich_vu_di_kem dvdk 
 join hop_dong_chi_tiet hdct on dvdk.id_dich_vu_di_kem = hdct.id_dich_vu_di_kem
join hop_dong hd on hdct.id_hop_dong = hd.id_hop_dong
join dich_vu dv on hd.id_dich_vu = dv.id_dich_vu
join loai_dich_vu ldv on dv.id_loai_dich_vu = ldv.id_loai_dich_vu
group by hd.id_hop_dong;

------------------------------------------------------------ task15 -----------------------------------------------------------
-- Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, trinh_do, ten_bo_phan,
 -- so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
 select nv.id_nhan_vien,nv.ho_ten,nv.id_trinh_do,nv.id_bo_phan,nv.sdt,nv.dia_chi 
 from nhan_vien nv
 join hop_dong hd on hd.id_nhan_vien = nv.id_nhan_vien
 where year(hd.ngay_lam_hd) between 2018 and 2019 
 limit 3;
 ------------------------------------------------------------- task16 ---------------------------------------------------------------
 SET SQL_SAFE_UPDATES = 0;
 delete 
 from  nhan_vien nv
 where nv.id_nhan_vien not in ( 
 select hd.id_nhan_vien
 from hop_dong hd
 where hd.ngay_lam_hd is null  or (hd.id_nhan_vien = nv.id_nhan_vien and year(hd.ngay_lam_hd) between 2017 and 2019 ))
 ;