import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        
        while (true) {
            String answer = "yes";
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder(String.valueOf(n));
            sb.reverse();

            for (int i = 0; i < String.valueOf(n).length(); i++) {
                if (String.valueOf(n).charAt(i) !=  sb.charAt(i)) {
                    answer = "no";
                }
            }
            System.out.println(answer);


        }


    }
}





