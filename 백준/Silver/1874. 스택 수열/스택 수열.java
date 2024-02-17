import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); //8

        Stack<Integer> stack = new Stack<>();


        boolean err = false;
        int lastStack = 0;


        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > lastStack) {
                for (int j = lastStack + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append("+" + "\n");
                }
                lastStack = input;

            }
            if (stack.peek() == input) {
                stack.pop();
                sb.append("-" + "\n");

            } else {
                err = true;

            }

        }
        if(err){
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }

    }
}

