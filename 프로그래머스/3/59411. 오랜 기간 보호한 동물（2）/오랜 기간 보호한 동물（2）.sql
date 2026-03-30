-- 코드를 입력하세요
SELECT ao.animal_id, ao.name
from ANIMAL_OUTS ao
inner join ANIMAL_INS ai on ai.animal_id = ao.animal_id
order by ao.datetime - ai.datetime desc
limit 2;