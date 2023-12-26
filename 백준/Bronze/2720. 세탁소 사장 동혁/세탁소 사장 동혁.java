import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        //q=0.25
        //d=0.10
        //n=0.05
        //p=0.01

        for (int i = 0; i < T; i++) {
            int money = sc.nextInt();
            int q = money/25;
            int d = money%25/10;
            int n = money%25%10/5;
            int p = money%25%10%5;
            System.out.println(q + " " + d + " " + n + " " + p);
        }



    }
}


