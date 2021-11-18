drop database if exists demo;
create database demo;
use demo;

create table products (
id int auto_increment not null primary key,
product_code int,
product_name varchar(15),
product_price double,
product_amount int ,
product_description varchar(50),
product_status varchar(50)
);

insert into products
values(1,1,'xe đạp',2300000,1,'xe đẹp','tốt'),
(2,2,'xe máy',222300000,1,'xe đẹp','tốt'),
(3,3,'xe oto',12222200000,1,'xe đẹp','tốt');


 -- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
select *
from products
where product_code = 2;

create unique index index_product_code
on products(product_code);

-- -- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index index_name_price
on products(product_name,product_price);
select * 
from products
where product_name = 'xe máy' and product_price = 222300000;

-- -- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view view_product as
select  product_code ,product_name,product_price,product_status
from products;
-- xem view
select * from view_product;

-- cập nhật view 
update view_product 
set product_price = 200000
where product_name = 'xe máy';
-- xóa view
drop view view_product;

--------------------------- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product ----------------------------
delimiter //

create procedure find_all_product()

begin

  select * from products;

end //

delimiter ;

call find_all_product();

---------------------------------------- Tạo store procedure thêm một sản phẩm mới ------------------------------------------------
drop procedure if exists them_san_pham;
delimiter //
create procedure them_san_pham(id int,product_code int, product_name varchar(35),product_price double,product_amount int,
product_description varchar(50),product_status varchar(50))
begin
insert into products(id,product_code,product_name,product_price,product_amount,product_description,product_status)
value(id,product_code,product_name,product_price,product_amount,product_description,product_status);
end
//
delimiter ;
call them_san_pham(4,4,'thuyền',50000000,1,'thuyền đẹp','tốt');
call them_san_pham(5,5,'cano',20000000,1,'cano đẹp','tốt');

--------------------------- Tạo store procedure sửa thông tin sản phẩm theo id ---------------------------------------------------------
drop procedure if exists them_san_pham;
delimiter //
create procedure sua_san_pham(id_new int,product_code_new int, product_name_new varchar(35),product_price_new double,product_amount_new int,
product_description_new varchar(50),product_status_new varchar(50))
begin
update products
set id = id_new,product_code = product_code_new,product_name = product_name_new,product_price = product_price_new,
product_amount = product_amount_new,product_description = product_description_new,product_status = product_status_new
where id = id_new;
end
//
delimiter ;
call sua_san_pham(1,7,'xe lu',212122,1,'xe đẹp','tốt');

-- -----------------------------------------------------Tạo store procedure xoá sản phẩm theo id ------------------------------------
delimiter //
create procedure xoa_product(id_new int)
begin
delete from products
where id = id_new;
end 
// delimiter ;
call xoa_product(4);
