import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrays = new int[9][9];

        int max = 0;
        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = sc.nextInt();
                if(max <= arrays[i][j]){
                    max = arrays[i][j];
                    n1 = i+1;
                    n2 = j+1;

                }
            }


        }

        System.out.println(max);
        System.out.println(n1 + " " + n2);
        

    }
}

