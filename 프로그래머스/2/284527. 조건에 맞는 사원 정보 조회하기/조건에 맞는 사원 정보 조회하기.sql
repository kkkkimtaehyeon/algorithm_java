# select sum(hg.score) as score, he.emp_no, he.emp_name, he.position, he.email
# from HR_EMPLOYEES he
# join HR_GRADE hg on hg.emp_no = he.emp_no
# group by he.emp_no, he.emp_name, he.position, he.email
# order by score desc
# limit 1;

select hg.score, he.emp_no, he.emp_name, he.position, he.email
from HR_EMPLOYEES he
inner join (
    select sum(score) as score, emp_no
    from HR_GRADE
    group by emp_no
    order by score desc
    limit 1
    ) hg on hg.emp_no = he.emp_no;