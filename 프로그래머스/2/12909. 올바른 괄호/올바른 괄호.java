import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        
       Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String word = String.valueOf(s.charAt(i));
            if (!stack.isEmpty()) {
                if (word.equals(")")) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(word);
                    }
                } else {
                    stack.push(word);
                }
            } else {
                stack.push(word);
            }

        }

        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}