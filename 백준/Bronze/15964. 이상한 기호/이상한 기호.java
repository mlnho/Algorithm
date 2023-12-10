import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long userA = sc.nextInt();
        long userB = sc.nextInt();

        System.out.println( (userA + userB) * (userA-userB) );
    }


}


