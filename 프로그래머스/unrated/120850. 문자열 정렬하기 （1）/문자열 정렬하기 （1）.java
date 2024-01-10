import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int [] answer = {};
        
         String[] st = my_string.replaceAll("[a-z]","").split("");

        Arrays.sort(st);

        answer = new int[st.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(st[i]);
        }

        return answer;
        
        
    }
}