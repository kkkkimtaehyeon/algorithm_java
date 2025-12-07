-- 코드를 입력하세요
SELECT b.BOOK_ID	,a.AUTHOR_NAME,	date_format(b.PUBLISHED_DATE, '%Y-%m-%d') as published_date
from book b
inner join author a on a.author_id = b.author_id
where category in ('경제')
order by published_date asc;