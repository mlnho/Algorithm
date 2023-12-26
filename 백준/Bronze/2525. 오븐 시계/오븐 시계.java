import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int c = sc.nextInt();


        int finalH = h;
        int finalM = m+c;

        if(finalM>=60){
            finalH += finalM/60;
            finalM = finalM%60;
            if(finalH>=24){
                finalH = finalH%24;
            }
        }

        System.out.println(finalH + " " + finalM);


    }
}


