import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        StringBuffer s1 = new StringBuffer(n1);
        StringBuffer s2 = new StringBuffer(n2);

        s1.reverse().toString();
        s2.reverse().toString();

        int a = Integer.parseInt(String.valueOf(s1));
        int b = Integer.parseInt(String.valueOf(s2));
        
        if(a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}


