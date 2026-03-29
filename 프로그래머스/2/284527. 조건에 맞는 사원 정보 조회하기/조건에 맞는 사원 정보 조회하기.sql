-- 코드를 작성해주세요
# HR_DEPARTMENT -- 회사 부서 정보
# HR_EMPLOYEES -- 회사 사원 정보
# HR_GRADE -- 22년 사원 평가 정보

select sum(hg.score) as score, he.emp_no, he.emp_name, he.position, he.email
from HR_EMPLOYEES he
join HR_GRADE hg on hg.emp_no = he.emp_no
join HR_DEPARTMENT hd on hd.dept_id = he.dept_id
group by he.emp_no
order by score desc
limit 1;
