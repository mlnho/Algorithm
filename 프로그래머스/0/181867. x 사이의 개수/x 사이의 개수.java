class Solution {
    public int[] solution(String myString) {
        
        int countX=0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                countX++;
            }
        }        
        
        int[] answer = new int[countX+1];

        int index=0;
        
        for(int i=0; i<answer.length; i++){
            for(int j=index; j<myString.length(); j++){
                if(myString.charAt(j)=='x'){
                    index++;
                    break;
                } else {
                    index++;
                    answer[i] += 1;
                }
            }
        }
        
        
        return answer;
    }
}