-- 코드를 입력하세요
SELECT PT_NAME, pt_no, gend_cd, age, ifnull(tlno, 'NONE') as tlno
from PATIENT
where age <= 12
and gend_cd = 'W'
order by age desc, pt_name