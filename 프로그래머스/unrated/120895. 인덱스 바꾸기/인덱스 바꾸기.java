class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
         String[] array = my_string.split("");

        String tmp = array[num1];
        array[num1] = array[num2];
        array[num2] = tmp;


        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }

        return answer;
    }
}