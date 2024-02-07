-- 코드를 입력하세요
SELECT BOARD_ID,WRITER_ID,TITLE,Price,
    (case 
        when STATUS='sale' then '판매중'
        when status='reserved' then '예약중'
    else '거래완료'
     end)
from USED_GOODS_BOARD 
where 1=1
and date_format(CREATED_DATE,'%Y-%m-%d') = '2022-10-05'
order by BOARD_ID desc