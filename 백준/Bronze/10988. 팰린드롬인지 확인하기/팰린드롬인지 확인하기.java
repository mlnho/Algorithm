import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] s1 = new String[s.length()];
        String[] s2 = new String[s.length()];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = String.valueOf(s.charAt(i));
        }


        //뒤집은 알파벳
        int s2word = 0;
        for (int i = s2.length - 1; i >= 0; i--) {
            s2[i] = String.valueOf(s.charAt(s2word));
            s2word++;
        }


        int answer = 1;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(s2[i])) {
                answer = 1;
            } else {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
    }
}





