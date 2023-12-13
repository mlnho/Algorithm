import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        int len = s.length();
        int ans = 1;

        
//        StringBuilder 의 reverse 사용
        StringBuilder sb = new StringBuilder(s);
        sb.reverse(); 

        // 문자열 길이 / 2만 하는 이유? : 검증 이정도만하면 되기 때문
        // level 일경우 lev 까지 확인함
        for (int i = 0; i < len / 2; i++) {
            // 확인차 출력해봄
            // System.out.println(s.charAt(i));
            if(s.charAt(i) != sb.charAt(i)){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}





