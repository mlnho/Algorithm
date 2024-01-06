class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
            //arr1 의 행길이 - 3
        int r1 = arr1.length;
        int c1 = arr1[0].length;
        
        //arr2의 열길이 - 2
        int c2 = arr2[0].length;

         answer = new int [r1][c2];

        
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        
        
        
        return answer;
    }
}