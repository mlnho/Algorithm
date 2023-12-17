import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] card = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        for (int i = 0; i < 10; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            int count = 0;
            for (int j = 0; j < (end - start + 1) / 2; j++) {
                int tmp = card[start + count];
                card[start + count] = card[end - count];
                card[end - count] = tmp;
                count++;
            }
//            System.out.println(Arrays.toString(card));
        }


        for (int i = 0; i < card.length; i++) {
            System.out.print(card[i] + " ");
        }

    }
}


