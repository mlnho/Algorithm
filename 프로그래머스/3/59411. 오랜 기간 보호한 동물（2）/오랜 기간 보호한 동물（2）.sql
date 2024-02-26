-- 코드를 입력하세요

SELECT a.ANIMAL_ID, a.NAME
FROM(
SELECT o.ANIMAL_ID, o.ANIMAL_TYPE,o.name, datediff(o.datetime,i.datetime) as datetime
FROM ANIMAL_INS i inner join ANIMAL_OUTS o
on i.ANIMAL_ID = o.ANIMAL_ID
order by datetime desc
limit 2
    ) a
    # where 1=1
    # and a.datetime <=2