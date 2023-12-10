import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrays = new int[30];

        for (int i = 0; i < 28; i++) {
            int N = scanner.nextInt();
            arrays[N-1] = 1;
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != 1) {
                System.out.println(i+1);
            }
        }

    }
}

