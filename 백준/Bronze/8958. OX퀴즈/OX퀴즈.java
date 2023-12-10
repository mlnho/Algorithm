import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.nextLine();
        int N = Integer.parseInt(T);

        // 출력할 합계
        int sum = 0;
        int plus = 1;

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            String[] stArray = s.split("");
            for (int j = 0; j < stArray.length; j++) {
                if (stArray[j].equals("O")) {
                    sum += plus;
                    plus++;
                } else if (stArray[j].equals("X")) {
                    plus = 1;
                }
            }
            System.out.println(sum);
            sum = 0;
            plus = 1;
        }

    }
}





