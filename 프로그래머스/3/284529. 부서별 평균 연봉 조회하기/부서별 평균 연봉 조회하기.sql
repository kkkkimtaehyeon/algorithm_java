-- 코드를 작성해주세요
select hd.dept_id, hd.DEPT_NAME_EN, round(avg(he.sal), 0) as avg_sal
from HR_EMPLOYEES he
inner join HR_DEPARTMENT hd on hd.dept_id = he.dept_id
group by hd.dept_id, hd.DEPT_NAME_EN
order by avg_sal desc;