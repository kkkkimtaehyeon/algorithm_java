-- 코드를 작성해주세요
select sum(item_info.price) as total_price
from item_info
where item_info.rarity = 'LEGEND';