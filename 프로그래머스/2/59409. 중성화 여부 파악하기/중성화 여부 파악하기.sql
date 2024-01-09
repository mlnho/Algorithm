-- 코드를 입력하세요
SELECT animal_id, name, 
       case 
        when(substring_index(SEX_UPON_INTAKE, ' ', 1) = 'Neutered') then 'O'
        when(substring_index(SEX_UPON_INTAKE, ' ', 1) = 'Spayed') then 'O'
        else 'X'
        end '중성화'
from ANIMAL_INS
order by animal_id