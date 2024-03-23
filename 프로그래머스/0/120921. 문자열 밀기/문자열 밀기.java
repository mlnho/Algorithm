class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        
        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                return answer;
            } else {
                String a = A.substring(A.length()-1); //A의 맨 마지막 글자를 변수 a에 담기
                A = a + A.substring(0,A.length()-1);
                answer ++;
            }

        }
        answer = -1;
        
        return answer;
    }
}