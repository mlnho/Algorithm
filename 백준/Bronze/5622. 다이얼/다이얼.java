import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        String [] alpha = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int answer = 0;
        for (int i = 0; i < n.length(); i++) {
            char n1 = n.charAt(i);
            for (int j = 0; j < alpha.length; j++) {
                for (int k = 0; k < alpha[j].length(); k++) {
                    if(n1==alpha[j].charAt(k)){
                        answer += j+1;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}


