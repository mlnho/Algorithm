import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            for (int k = 0; k < s.length(); k++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(s.charAt(k));
                }
            }
            System.out.println("");
        }


    }
}


