import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int answerH = H;
        int answerM = M-45;

        if(answerM<0){
            answerM += 60;
            answerH = H-1;
            if(answerH<0){
                answerH += 24;
            }
        }

        System.out.println(answerH + " " + Math.abs(answerM) );
    }
}





