select fh.flavor
from first_half fh
join (
    select j.flavor, sum(j.total_order) as j_order
    from july j
    group by j.flavor
) j on fh.flavor = j.flavor
order by (fh.total_order + j_order) desc
limit 3;
