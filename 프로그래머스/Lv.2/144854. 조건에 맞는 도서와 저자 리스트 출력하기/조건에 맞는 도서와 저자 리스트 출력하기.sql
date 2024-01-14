-- 코드를 입력하세요
SELECT b.book_id, a.author_name, date_format(b.PUBLISHED_DATE,'%Y-%m-%d')
from book b left join author a
on b.author_id = a.author_id
where 1=1
and b.category = '경제'
order by PUBLISHED_DATE