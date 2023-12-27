import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt(); //배열의 길이
       int m = sc.nextInt(); //반복

        int [] basket = new int [n];
        for (int i = 0; i < m; i++) {
            int z = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int l = z-1; l < j; l++) {
                basket[l] = k;
            }
        }

        for(int c : basket){
            System.out.print(c + " ");
        }
    }
}


