class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String [] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                arr[i]="0";
                arr[i-1]="0";
            }
        }

        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}