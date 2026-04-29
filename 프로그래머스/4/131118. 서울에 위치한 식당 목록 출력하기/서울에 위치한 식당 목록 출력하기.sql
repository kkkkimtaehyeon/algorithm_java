SELECT 
    i.REST_ID, 
    i.REST_NAME, 
    i.FOOD_TYPE, 
    i.FAVORITES, 
    i.ADDRESS, 
    ROUND(AVG(r.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO i  -- 식당 정보 테이블 (이름, 주소 등이 있음)
JOIN REST_REVIEW r ON i.REST_ID = r.REST_ID -- 리뷰 테이블 (점수가 있음)
WHERE i.ADDRESS LIKE '서울%' -- 서울로 시작하는 식당 필터링
GROUP BY i.REST_ID
ORDER BY SCORE DESC, i.FAVORITES DESC;