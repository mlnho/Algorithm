-- 코드를 입력하세요
SELECT BOOK_ID, date_format(PUBLISHED_DATE,'%Y-%m-%d')
FROM BOOK
WHERE 1=1
AND CATEGORY = '인문'
AND PUBLISHED_DATE between '2021-01-01' and '2021-12-31'
order by PUBLISHED_DATE