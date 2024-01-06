-- 코드를 입력하세요
SELECT ANIMAL_ID, name
from ANIMAL_INS
where 1=1
and name like '%el%'
and ANIMAL_TYPE = 'dog'
order by name