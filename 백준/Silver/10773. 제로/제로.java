import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Stack<Integer> st = new Stack();

        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                st.push(num);
            } else {
                st.pop();
            }
        }

        int sum = 0;
        for (int o : st) {
            sum += o;
        }
        System.out.println(sum);

    }
}

