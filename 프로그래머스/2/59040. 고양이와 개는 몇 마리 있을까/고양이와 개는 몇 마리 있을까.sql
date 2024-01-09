-- 코드를 입력하세요
select ANIMAL_TYPE, count(*)
from animal_ins
group by ANIMAL_TYPE
order by ANIMAL_TYPE