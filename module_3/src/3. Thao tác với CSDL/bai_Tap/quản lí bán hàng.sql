use quan_ly_ban_hang;

insert into customer 
values (1,'Minh Quan', 10) ,
	(2,'Ngoc Anh',20),
    (3,'Hong Ha',50),
    (4,'Hong ',30);
    
    insert into _order
values (1,3/21/2006,null,1),
		(2,3/23/2006,null,2),
        (3,3/16/2006,null,3),
        (4,3/16/2006,null,4);

insert into product
values (1,'may giat', 5),
		(2,'may ui', 10),
	(3,'may sinh to', 10);
    
insert into order_detail
values (1,1,5),
	(1,3,8),
    (2,2,4),
    (3,3,2);
    
    -- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
     select o.order_id,o.oder_date,o.oder_toltal_price
     from _order o;
    
    -- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
   select c.customer_name,p.product_id,o.order_id
   from customer c
   join _order o on  c.customer_id = o.customer_id_order join product p  on  p.product_id = o.order_id ;
     
     -- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select *
from customer c left join _order o on c.customer_id = o.customer_id_order
where o.customer_id_order is null;


     -- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng
    --  xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
-- select o.order_id,o.oder_date,sum(dt.oder_qty * p.product_price) as `Total Price`
-- from _order o 
-- join order_detail dt on o.order_id = dt.order_id_detail
-- join product p on p.product_id = dt.product_id_detail
-- group by o.order_id;
select od.order_id,od.oder_date,sum(odl.oder_qty * pd.product_price) as 'total price'
from _order od 
join order_detail odl 
on od.order_id = odl.order_id_detail
join product pd 
on pd.product_id =  odl.product_id_detail
group by od.order_id