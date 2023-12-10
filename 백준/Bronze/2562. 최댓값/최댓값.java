import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];

        //최댓값
        int max = 0;
        // 몇번째 수인지
        int maxL = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxL = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxL);

    }


}


