import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int userA = sc.nextInt();
        int userB = sc.nextInt();

        System.out.println( (userA + userB) * (userA-userB) );
    }


}


