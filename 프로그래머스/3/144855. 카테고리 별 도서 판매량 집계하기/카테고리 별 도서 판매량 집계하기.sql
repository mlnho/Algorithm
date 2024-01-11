-- 코드를 입력하세요

# select b.category as CATEGORY, a.sum as TOTAL_SALES
# from (
SELECT a.category, sum(sales) as sum
from book a left join BOOK_SALES b
on a.BOOK_ID = b.BOOK_ID
where 1=1
and b.SALES_DATE between '2022-01-01' and '2022-01-31'
group by a.category
order by a.category
    # ) a inner join book b
    # on a.book_id = b.book_id
    # group by b.category
    # order by b.category
    