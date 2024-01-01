class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)<97){
                int tmp = my_string.charAt(i)+32;
                answer += (char)tmp;
            } else {
                int tmp = my_string.charAt(i)-32;
                answer += (char)tmp;
            }
        }
        
        return answer;
    }
}