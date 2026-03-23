-- 코드를 입력하세요
SELECT ao.animal_id, ao.name
from animal_outs ao
left join animal_ins ai on ai.animal_id = ao.animal_id
where ao.animal_id is not null and ai.animal_id is null;