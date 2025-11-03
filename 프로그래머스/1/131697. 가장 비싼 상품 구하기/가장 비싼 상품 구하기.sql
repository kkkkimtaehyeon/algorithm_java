-- 코드를 입력하세요
SELECT product.price as max_price
from product
order by price desc limit 1;