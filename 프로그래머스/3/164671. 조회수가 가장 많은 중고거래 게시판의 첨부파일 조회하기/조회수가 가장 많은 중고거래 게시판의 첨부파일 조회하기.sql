select concat('/home/grep/src/', f.board_id, '/', f.file_id, f.file_name,f.file_ext) as file_path
from USED_GOODS_FILE f
join (
    select board_id
    from USED_GOODS_BOARD
    order by views desc
    limit 1
) b on f.board_id = b.board_id
order by f.file_id desc;