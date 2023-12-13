import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        int len = s.length();
        int ans = 1;

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();


        for (int i = 0; i < len / 2; i++) {
//            System.out.println(s.charAt(i));
            if(s.charAt(i) != sb.charAt(i)){
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}





