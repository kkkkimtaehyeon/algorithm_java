-- 코드를 입력하세요
select animal_id, animal_type, name
from ANIMAL_OUTS
where animal_id in (
    SELECT animal_id
    from ANIMAL_INS
    where SEX_UPON_INTAKE like "Intact%"
)
and (SEX_UPON_OUTCOME like "Spayed%" or SEX_UPON_OUTCOME like "Neutered%")
order by animal_id;

# select ao.animal_id, ao.animal_type, ao.name
# from ANIMAL_OUTS ao
# join ANIMAL_INS ai on ai.animal_id = ao.animal_id
# where SEX_UPON_INTAKE like "Intact%" and SEX_UPON_OUTCOME like "Spayed%" or SEX_UPON_OUTCOME like "Neutered%"
# order by ao.animal_id;