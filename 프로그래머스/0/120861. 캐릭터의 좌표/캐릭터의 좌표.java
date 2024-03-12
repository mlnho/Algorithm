class Solution {
    public int[] solution(String[] keyinput, int[] board) {
    
        int[] result = {0,0};
        
             for (int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")){
                result[0]--;
                if(Math.abs(result[0]) > board[0]/2){
                    result[0]++;
                }
            } else if (keyinput[i].equals("right")){
                result[0]++;
                if(Math.abs(result[0]) > board[0]/2){
                    result[0]--;
                }

            } else if (keyinput[i].equals("up")){
                result[1]++;
                if(Math.abs(result[1]) > board[1]/2){
                    result[1]--;
                }

            } else if (keyinput[i].equals("down") ){
                result[1]--;
                if(Math.abs(result[1]) > board[1]/2){
                    result[1]++;
                }

            }
        
       
    }
         return result;
    }
}