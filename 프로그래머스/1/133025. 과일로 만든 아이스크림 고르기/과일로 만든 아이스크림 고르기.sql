-- 코드를 입력하세요
SELECT fh.FLAVOR
from FIRST_HALF fh
inner join ICECREAM_INFO ii on ii.flavor = fh.flavor
where total_order > 3000 and ii.INGREDIENT_TYPE = 'fruit_based'
order by total_order desc;