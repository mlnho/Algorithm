import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String tk = st.nextToken();

            if (tk.equals("push")){
                stack.push(Integer.valueOf(st.nextToken()));
            } else if(tk.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            } else if(tk.equals("size")){
                System.out.println(stack.size());
            } else if(tk.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if(tk.equals("top")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            }
        }



    }
}

