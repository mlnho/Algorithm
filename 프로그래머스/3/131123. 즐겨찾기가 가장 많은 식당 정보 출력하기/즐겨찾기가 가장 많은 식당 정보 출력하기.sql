-- 코드를 
# SELECT a.FOOD_TYPE,a.REST_ID, a.REST_NAME, a.max as FAVORITES
# FROM(
# SELECT *, MAX(FAVORITES) as max
# FROM REST_INFO
# GROUP BY FOOD_TYPE
# ) A
# order by food_type desc
SELECT FOOD_TYPE,REST_ID,REST_NAME,FAVORITES
FROM(
select *
from REST_INFO
where 1=1
and FAVORITES IN (SELECT max(FAVORITES)
                  FROM REST_INFO
                  GROUP BY FOOD_TYPE
                 )
GROUP by FOOD_TYPE
    ) a
order by FOOD_TYPE desc