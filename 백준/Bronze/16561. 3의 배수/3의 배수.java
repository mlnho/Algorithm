import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;

        for (int i = 3; i <= N - 6; i += 3) {
            for (int j = 3; j <= N - 3 - i; j += 3) {
                count++;
            }
        }
        System.out.println(count);
    }


}



