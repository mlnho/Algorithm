import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt(); //배열의 길이
       int m = sc.nextInt(); //반복

        int [] bakset = new int[n];
        for (int i = 0; i < n; i++) {
            bakset[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            for (int j = 0; j < (b-a+1)/2; j++) {
                int tmp = bakset[a+j];
                bakset[a+j] = bakset[b-j];
                bakset[b-j] = tmp;
            }
        }

        for(int c : bakset){
            System.out.print(c + " ");
        }
    }
}


