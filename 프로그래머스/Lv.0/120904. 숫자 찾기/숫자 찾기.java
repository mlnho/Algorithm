class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        
        String stNum = String.valueOf(num);
        
        int searchNum = stNum.indexOf(String.valueOf(k));
        
        if(searchNum < 0){
            answer = searchNum;
        } else {
            answer = searchNum+1;
        }
       
        
        return answer;
    }
}