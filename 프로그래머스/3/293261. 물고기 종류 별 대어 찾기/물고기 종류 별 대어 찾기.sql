-- 코드를 작성해주세요
select fi.id, fni.fish_name, fi.length
from fish_info fi
inner join fish_name_info fni on fi.fish_type = fni.fish_type
where length = (
    select max(length)
    from fish_info fis
    where fis.fish_type = fi.fish_type
)