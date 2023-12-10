import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int answer = A*B*C;

        int [] memory = new int[10];

//        System.out.println(answer);

        while(answer>0){
            memory[answer % 10]++;
            answer = answer/10;
        }

        for (int i = 0; i < memory.length; i++) {
            System.out.println(memory[i]);
        }
    }
}





