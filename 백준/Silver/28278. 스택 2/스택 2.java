import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String tk = st.nextToken();
            if (tk.equals("1")){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(tk.equals("2")){
                sb.append(stack.isEmpty() ? "-1" : stack.pop()).append('\n');
            } else if(tk.equals("3")){
                sb.append(stack.size()).append('\n');
            } else if(tk.equals("4")){
                sb.append(stack.isEmpty() ? "1" : "0").append('\n');
            } else if(tk.equals("5")){
                sb.append(stack.isEmpty() ? "-1" : stack.peek()).append('\n');
            }
        }
        System.out.println(sb.toString());

        br.close();
    }
}

