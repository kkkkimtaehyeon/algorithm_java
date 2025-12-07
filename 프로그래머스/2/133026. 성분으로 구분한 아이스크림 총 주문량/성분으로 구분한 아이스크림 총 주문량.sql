-- 코드를 입력하세요
SELECT ii.INGREDIENT_TYPE, sum(fh.total_order) as	TOTAL_ORDER
from ICECREAM_INFO ii
inner join first_half fh on fh.flavor = ii.flavor
group by INGREDIENT_TYPE
order by TOTAL_ORDER asc;