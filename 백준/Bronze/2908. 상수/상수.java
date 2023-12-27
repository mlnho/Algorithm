import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        StringBuffer s1 = new StringBuffer(n1);
        StringBuffer s2 = new StringBuffer(n2);


        int a = Integer.parseInt((s1.reverse().toString()));
        int b = Integer.parseInt((s2.reverse().toString()));

        if(a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}


