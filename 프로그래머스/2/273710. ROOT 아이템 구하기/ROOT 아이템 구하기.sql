-- 코드를 작성해주세요
select ii.item_id, ii.item_name
from item_info ii
inner join item_tree it on it.item_id = ii.item_id
where it.parent_item_id is null;