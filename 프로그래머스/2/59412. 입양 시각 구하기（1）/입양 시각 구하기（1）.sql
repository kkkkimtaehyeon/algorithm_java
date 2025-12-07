-- 코드를 입력하세요
SELECT date_format(datetime, '%H') as hour, count(*) as count
from animal_outs
where date_format(datetime, '%H:%i') between '09:00' and '19:59' 
group by date_format(datetime, '%H') 
order by hour