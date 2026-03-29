-- 코드를 입력하세요
# 자동차 종류가 '세단'인 자동차들 중 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트

SELECT distinct(crcc.car_id)
from CAR_RENTAL_COMPANY_CAR crcc
inner join (
    select car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where start_date >= '2022-10-01'
) crcrh on crcrh.car_id = crcc.car_id
where crcc.car_type = '세단'
order by crcc.car_id desc;

