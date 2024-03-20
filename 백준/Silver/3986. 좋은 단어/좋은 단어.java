import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int count = 0;

        for (int i = 0; i < N; i++) {
            Stack<String> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            for (int j = 0; j < word.length(); j++) {
                String a = String.valueOf(word.charAt(j));
                if (stack.isEmpty()) {
                    stack.push(a);
                } else if (!stack.isEmpty()) {
                    String peek = stack.peek();
                    if (peek.equals(a)) {
                        stack.pop();
                    } else {
                        stack.push(a);
                    }
                }

            }
            if (stack.isEmpty()) {
                count++;
            }
        }

        System.out.println(count);

    }
}

