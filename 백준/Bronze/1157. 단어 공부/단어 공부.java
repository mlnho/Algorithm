import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        //알파벳 개숫
        int[] abc = new int[26];


        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);

            if (c >= 65 && c <= 90) {
                // 대문자
                abc[c - 65]++;
            } else if (c >= 97 && c <= 122) {
                // 소문자
                abc[c - 97]++;
            }
        }

//        System.out.println(Arrays.toString(abc));

        int max = -1;
        char answer = '?'; //초기값 ? 설정
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] > max) {
                max = abc[i];
                answer = (char) (i+65);
            } else if (max == abc[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}



