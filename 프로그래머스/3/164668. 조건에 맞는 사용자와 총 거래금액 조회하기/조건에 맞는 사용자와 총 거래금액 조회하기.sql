-- 코드를 입력하세요
select * 
from(
SELECT WRITER_ID, b.nickname, sum(PRICE) as TOTAL_SALES
from USED_GOODS_BOARD a inner join USED_GOODS_USER b
on a.WRITER_ID = b.USER_ID
where a.status = 'done'
group by WRITER_ID
    ) a
where 1=1
and TOTAL_SALES >= 700000
order by TOTAL_SALES