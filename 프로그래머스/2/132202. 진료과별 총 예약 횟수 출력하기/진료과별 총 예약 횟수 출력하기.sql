-- 코드를 입력하세요
SELECT MCDP_CD as '진료과코드', count(*) as '5월예약건수'
from APPOINTMENT
where 1=1
and APNT_YMD between '2022-05-01' and '2022-05-31'
group by MCDP_CD
order by `5월예약건수`, MCDP_CD asc