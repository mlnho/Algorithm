-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, date_format(hire_ymd, '%Y-%m-%d') as hire_ymd
from DOCTOR
where 1=1
and mcdp_cd like '%CS%'
or mcdp_cd like '%GS%'
order by hire_ymd desc, dr_name asc

