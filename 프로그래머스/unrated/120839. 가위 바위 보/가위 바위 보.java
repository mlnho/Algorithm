class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        
         String [] arr_rsp = rsp.split("");

        for (int i = 0; i < arr_rsp.length ; i++) {
            if(arr_rsp[i].equals("2")){
                answer += "0";
            } else if(arr_rsp[i].equals("0")){
                answer += "5";
            } else {
                answer += "2";
            }
        }

        
        return answer;
    }
}