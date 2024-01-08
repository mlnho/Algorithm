-- 코드를 입력하세요
select CATEGORY, count(CATEGORY)
from(
SELECT left(PRODUCT_CODE,2) as CATEGORY
from product 
    ) a
group by CATEGORY
order by CATEGORY 