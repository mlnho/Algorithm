import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        int answer = 0;

        for (int i = 1; i <= N; i++) {
             answer += i;
        }
        System.out.print(answer);
    }
}


