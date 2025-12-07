-- 코드를 작성해주세요
select count(*) as fish_count
from FISH_INFO fi 
inner join fish_name_info fni on fni.fish_type = fi.fish_type
where fni.fish_name in ('BASS', 'SNAPPER')