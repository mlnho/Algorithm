import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int num1 = Integer.parseInt(bin1, 2); //10진수 int 타입으로 변경
        int num2 = Integer.parseInt(bin2, 2);
        
        int num3 = num1+num2;
        
        answer = Integer.toBinaryString(num3);
        
        return answer;
    }
}