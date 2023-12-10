import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }

        int sum = 0;
        int answer;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
            sum += array[i];
        }
        answer = sum%10;
        System.out.println(answer);



    }


}


