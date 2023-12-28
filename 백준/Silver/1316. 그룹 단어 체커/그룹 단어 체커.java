import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = N; // 최종 결과 값이 N인 이유는 모든 단어에서 그룹단어 아닐시 --할 예정
        for (int i = 0; i < N; i++) {
            String a = sc.next();
            boolean[] arr = new boolean[26]; // 알파벳 (초기값 false)

            for (int j = 0; j < a.length()-1; j++) { // j와 j+1 비교이기에 -1해준 것
                if (a.charAt(j) != a.charAt(j + 1)) {
                    if (arr[a.charAt(j + 1) - 97] == true) { //소문자 a 아스키코드(97)
                        count--;
                        break;

                    }
                }
                arr[a.charAt(j) - 97] = true;
            }
        }
        System.out.println(count);
    }

}


