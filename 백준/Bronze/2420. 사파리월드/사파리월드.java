import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Long N = scanner.nextLong();
        Long M = scanner.nextLong();

        System.out.println(Math.abs(N - M));

    }
}

