import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        int[] arr = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++; //소문자 이기 - 'a'
        }

        for (int i = 0; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += Math.abs(arr[i]-arr2[i]); //마이너스 값이 안나오게 하기 위해 절댓값 반환(Math.abs)
        }

        System.out.println(count);
    }
}


