import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int count = 0;
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            for (int j = 2; j <= n; j++) {
                if (n == j) {
                    count ++;
                } else if (n % j == 0) {
                    break;
                }
            }

        }
        System.out.println(count);
    }

}





