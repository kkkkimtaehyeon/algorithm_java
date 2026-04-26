-- 코드를 입력하세요
select a.author_id, a.author_name, b.category, sum(b.price * bs.sales) as total_sales
from author a
join book b on b.author_id = a.author_id
join (
    SELECT book_id, sum(sales) as sales
    from BOOK_SALES 
    where SALES_DATE >= '2022-01-01' and SALES_DATE < '2022-02-01'
    group by book_id
    ) bs on bs.book_id = b.book_id
group by a.author_id, b.category
order by a.author_id asc, b.category desc;


    # SELECT book_id, sum(sales) as sales
    # from BOOK_SALES 
    # where SALES_DATE >= '2022-01-01' and SALES_DATE < '2022-02-01'
    # group by book_id
    # order by book_id
    
    # select *
    # from book
    # order by book_id
