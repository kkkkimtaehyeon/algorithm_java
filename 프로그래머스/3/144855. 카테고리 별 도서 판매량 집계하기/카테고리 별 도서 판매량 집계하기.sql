-- 코드를 입력하세요
SELECT b.CATEGORY,	sum(bs.sales) as TOTAL_SALES
from book b
inner join book_sales bs 
on bs.book_id = b.book_id 
and bs.sales_date >= '2022-01-01'
and bs.sales_date < '2022-02-01'
group by b.category
order by b.category asc;