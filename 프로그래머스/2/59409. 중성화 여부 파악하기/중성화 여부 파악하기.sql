# -- 코드를 입력하세요
# SELECT ANIMAL_ID	,NAME,
# case 
# when SEX_UPON_INTAKE REGEXP 'Neutered | Spayed' then 'O'
# else 'X'
# end as 중성화
# from animal_ins;


-- 코드를 입력하세요
SELECT 
    ANIMAL_ID,
    NAME,
    CASE 
        WHEN SEX_UPON_INTAKE REGEXP 'Neutered|Spayed' THEN 'O'
        ELSE 'X'
    END AS 중성화
FROM animal_ins;
