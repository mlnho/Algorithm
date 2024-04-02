class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int answer [] = {};
        
        //num_list 의 길이가 짝수라면 num_list.length()/n 가 answer의 길이
        //반대로 홀수라면 ,, num_list.length()/n+1
        
        if(num_list.length%n==0){
            answer = new int[num_list.length/n];
        } else {
            answer = new int[num_list.length/n+1];
        }
        

        int index = 0; //answer 배열 순서대로 넣기 위한 index값 
        for(int i=0; i<num_list.length; i+=n){
            answer[index] = num_list[i];
            index++;
        }
        
        
        
        
        return answer;
    }
}