-- 코드를 입력하세요
# 완료된 중고 거래의 총금액이 70만 원 이상인 사람의 회원 ID, 닉네임, 총거래금액을 조회
select ugu.user_id, ugu.nickname, ugb.total_price
from USED_GOODS_USER ugu
inner join (
    SELECT writer_id, sum(price) as total_price
    from USED_GOODS_BOARD
    where status = 'DONE'
    group by writer_id
    having total_price >= 700000
) ugb on ugb.writer_id = ugu.user_id
order by ugb.total_price asc;


