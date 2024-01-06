-- 코드를 입력하세요
select name
from animal_ins
where 1=1
and datetime = (select min(datetime)
                from animal_ins)
