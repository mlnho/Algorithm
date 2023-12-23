class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int quiz : array){
            if(quiz>height){
                answer ++;
            }
        }
        
        return answer;
    }
}