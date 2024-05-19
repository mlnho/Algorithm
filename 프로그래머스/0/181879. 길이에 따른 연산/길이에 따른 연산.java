class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int arrayLength = num_list.length;
        
        if(arrayLength >= 11){
            for(int i=0; i<arrayLength; i++){
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for(int i=0; i<arrayLength; i++){
                answer *= num_list[i];
            }
        }
        
        return answer;
    }
}