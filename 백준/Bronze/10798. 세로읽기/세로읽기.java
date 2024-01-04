import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][15];

        for (int i = 0; i < arr.length; i++) {
            String input = sc.next();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = String.valueOf(input.charAt(j));
            }

        }

        String answer = "";

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    answer += arr[j][i];
                }


                }
            }
        System.out.println(answer);

    }

}


