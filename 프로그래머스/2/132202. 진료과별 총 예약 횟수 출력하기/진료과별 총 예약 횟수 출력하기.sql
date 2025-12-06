-- 코드를 입력하세요
# SELECT MDDR_ID as 진료과코드, count(*) as 5월예약건수
# from APPOINTMENT
# group by mddr_id
# where month(apnt_ymd) = 5 
# order by 5월예약건수 asc, 진료과코드 asc;


-- 코드를 입력하세요
SELECT a.MCDP_CD as 진료과코드, count(*) as 5월예약건수
from (
    select MCDP_CD, apnt_ymd
    from appointment
    where month(apnt_ymd) = 5
) as a
group by a.MCDP_CD
order by count(*) asc, a.MCDP_CD asc;