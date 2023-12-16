import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];

        int sum = 0; //전체 난쟁이 키 합

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        sc.close();

        //키 작은 순서대로 
        Arrays.sort(array);

        int a = 0;
        int b = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sum - array[i] - array[j] == 100) {
                    a = array[i];
                    b = array[j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != a && array[i] != b) {
                System.out.println(array[i]);
            }
        }

    }

}






