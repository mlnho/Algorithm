import java.util.*;

class Solution {
    boolean solution(String s) {
    boolean answer = true;
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                if (String.valueOf(s.charAt(i)).equals("(")) {
                    stack.push(String.valueOf(s.charAt(i)));
                } else {
                    answer = false;
                    break;
                }
            } else {
                if (String.valueOf(s.charAt(i)).equals(")")) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        answer = true;
                    }
                } else {
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
        }
        
         if(!stack.isEmpty()){
            answer = false;
        }
        return answer;
    }
}