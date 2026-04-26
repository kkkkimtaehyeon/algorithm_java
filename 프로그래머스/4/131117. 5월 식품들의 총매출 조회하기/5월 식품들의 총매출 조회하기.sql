-- 코드를 입력하세요
SELECT fd.product_id, fd.product_name, (fd.price * sum(fo.AMOUNT)) as TOTAL_SALES
from FOOD_PRODUCT fd
left join FOOD_ORDER fo on fo.product_id = fd.product_id
where fo.PRODUCE_DATE >= '2022-05-01' and fo.PRODUCE_DATE < '2022-06-01'
group by fd.product_id
order by TOTAL_SALES desc, fd.product_id asc;