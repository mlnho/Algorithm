class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        int[] answer = new int[sum];
        
        int index=0;
        int count=0;

        for(int i=0; i<arr.length; i++){
            count += arr[i];
            for(int j=index; j<count; j++){
                answer[j]=arr[i];
            }
            index += arr[i];
        }
        
        
        
        
        return answer;
    }
}