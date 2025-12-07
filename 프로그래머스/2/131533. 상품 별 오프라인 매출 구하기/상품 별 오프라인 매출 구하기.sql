-- 코드를 입력하세요
SELECT p.PRODUCT_CODE,	sum(p.price * os.sales_amount) as SALES
from product p
join offline_sale os on os.product_id = p.product_id
group by p.product_code
order by sales desc, p.product_code asc;