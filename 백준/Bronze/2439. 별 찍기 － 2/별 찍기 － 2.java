import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //5

        for (int i = 0; i < T; i++) {
            //공백
            for (int j = T - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


