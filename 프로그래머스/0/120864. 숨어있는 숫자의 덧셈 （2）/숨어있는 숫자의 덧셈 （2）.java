class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
         String [] array = my_string.replaceAll("[^\\d]"," ").split(" ");
        
          for (int i = 0; i < array.length; i++) {
            if(!array[i].equals("")){
                answer += Integer.parseInt(array[i]);
            }
        }
        
        
        return answer;
    }
}