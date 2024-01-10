-- 코드를 입력하세요
SELECT date_format(DATETIME,'%H') as HOUR, count(*) as COUNT
from ANIMAL_OUTS
where 1=1
and date_format(DATETIME,'%H') between '09' and '19'
group by date_format(DATETIME,'%H') 
order by date_format(DATETIME,'%H') 
