import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String [] b = before.split("");
        String [] a = after.split("");
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        
        
        for(int i=0; i<b.length; i++){
            if(b[i].equals(a[i])){
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }
        
        
        return answer;
    }
}