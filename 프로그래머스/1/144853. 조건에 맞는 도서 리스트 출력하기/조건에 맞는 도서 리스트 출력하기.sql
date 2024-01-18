-- 코드를 입력하세요
SELECT BOOK_ID, date_format(PUBLISHED_DATE,'%Y-%m-%d')
FROM BOOK
WHERE 1=1
AND CATEGORY = '인문'
AND date_format(PUBLISHED_DATE,'%Y') = '2021'
order by PUBLISHED_DATE