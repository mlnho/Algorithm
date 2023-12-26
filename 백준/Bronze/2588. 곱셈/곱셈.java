import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int n1 = b/10;
        int n2 = n1/10;


        System.out.println(a* (b%10) );
        System.out.println(a* (n1%10) );
        System.out.println(a* n2);
        System.out.println(a*b);

    }
}


