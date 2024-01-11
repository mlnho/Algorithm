class Solution {
    public int solution(int order) {
        int answer = 0;
        
       String stOrder = String.valueOf(order);

        
        for (int i = 0; i < stOrder.length(); i++) {
            System.out.println(stOrder.charAt(i));
            if (stOrder.charAt(i) == '3') {
                answer++;
            } else if (stOrder.charAt(i) == '6') {
                answer++;
            } else if (stOrder.charAt(i) == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}