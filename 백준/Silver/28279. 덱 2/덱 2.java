import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

//        1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
//        2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
//        3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//        4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//        5: 덱에 들어있는 정수의 개수를 출력한다.
//        6: 덱이 비어있으면 1, 아니면 0을 출력한다.
//        7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
//        8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.


        Deque<Integer> deque = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            if(first.equals("1")){
                deque.offerFirst(Integer.parseInt(st.nextToken()));
            } else if(first.equals("2")){
                deque.offerLast(Integer.parseInt(st.nextToken()));
            } else if(first.equals("3")){
                sb.append(!deque.isEmpty() ? deque.pollFirst() : "-1").append('\n');
            } else if(first.equals("4")){
                sb.append(!deque.isEmpty() ? deque.pollLast() : "-1").append('\n');
            } else if(first.equals("5")){
                sb.append(deque.size()).append('\n');
            } else if(first.equals("6")){
                sb.append(!deque.isEmpty() ? "0" : "1").append('\n');
            } else if(first.equals("7")){
                sb.append(!deque.isEmpty() ? deque.getFirst() : "-1").append('\n');
            } else if(first.equals("8")){
                sb.append(!deque.isEmpty() ? deque.getLast() : "-1").append('\n');
            }
        }

        br.close();
        System.out.println(sb.toString());



    }
}

