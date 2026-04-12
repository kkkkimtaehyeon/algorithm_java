SELECT fc.CATEGORY, fc.price as max_price, fc.product_name
from FOOD_PRODUCT fc
join (
    select category, max(price) as max_price
    from FOOD_PRODUCT
    where CATEGORY in ('과자', '국', '김치', '식용유')
    group by category) f
on fc.category = f.category and fc.price = f.max_price
order by fc.price desc;