import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];

        }
        System.out.println(sum / array.length);

        Arrays.sort(array);
        System.out.println(array[array.length / 2]);


    }
}





