import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        int[] answer = new int[commands.length];

		for (int j = 0; j < commands.length; j++) {
			int start = commands[j][0] ;
			int end = commands[j][1] ;
			int needNum = commands[j][2] - 1; // 새로운 배열에서 찾을 것

			// System.out.println("needNum :" + needNum);

			// int a = array[start]; // array의 5
			// int b = array[end]; // array의 3
			// System.out.println("a :" + a);
			// System.out.println("b :" + b);

			// 새로운 배열
			int[] newArray = new int[end - start + 1];
			int count = 0;
			for (int k = 0; k < newArray.length; k++) {
				newArray[k] = array[start-1 + count];
				count++;
			}
			Arrays.sort(newArray); // 새로운 배열 정렬
			// System.out.println(Arrays.toString(newArray));

			answer[j] = newArray[needNum];
			// System.out.println(Arrays.toString(answer));
		}
        return answer;
    }
}