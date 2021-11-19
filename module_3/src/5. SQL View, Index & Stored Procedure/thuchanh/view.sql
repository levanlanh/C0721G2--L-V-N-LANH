CREATE VIEW customer_views AS

SELECT customer_number, customer_name, phone

FROM  customers;

select * from customer_views;

CREATE OR REPLACE VIEW customer_views AS

SELECT customer_number, customer_name, contact_first_name, contact_last_name, phone

FROM customers

WHERE city = 'Nantes';

select * from customer_views;

DROP VIEW customer_views;