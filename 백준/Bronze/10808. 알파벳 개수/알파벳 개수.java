import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // 알파벳 개수는 - 26개
        int[] alphabet = new int[26];


        // 문자열 만큼 반복문
        // 문자열(s) 한글자씩 아스키코드를 구함 -> 향후 배열 위치로 사용하게 됌
        // ex) 문자열 a는 알파벳에서 첫번쨰 숫자이니 배열(알파벳개수) 0번째 항목 칸임
        // -97 하는 이유는 소문자 a의 아스키코드 == 97
        // 0번째 배열은 a의 자리니깐 97함
        for (int i = 0; i < s.length(); i++) {
            char sAscii = s.charAt(i);
            int sNumber = (int) sAscii - 97;

            alphabet[sNumber]++;

        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }

}





