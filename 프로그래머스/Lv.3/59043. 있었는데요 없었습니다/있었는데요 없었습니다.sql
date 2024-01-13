-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.name
FROM ANIMAL_INS i inner join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
where 1=1
and o.DATETIME < i.DATETIME
order by i.DATETIME