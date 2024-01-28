-- 코드를 입력하세요
SELECT a.flavor
from FIRST_HALF a inner join ICECREAM_INFO b
on a.FLAVOR = b.FLAVOR
where 1=1
and a.TOTAL_ORDER > 3000
and b.INGREDIENT_TYPE = 'fruit_based'
order by TOTAL_ORDER desc