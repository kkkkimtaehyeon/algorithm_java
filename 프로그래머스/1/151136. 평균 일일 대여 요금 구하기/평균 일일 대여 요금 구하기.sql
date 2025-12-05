-- 코드를 입력하세요
SELECT truncate(avg(daily_fee), '%1') as average_fee
from CAR_RENTAL_COMPANY_CAR
where car_type = 'SUV';