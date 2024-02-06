import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		
		Deque<String> deque = new LinkedList<>();
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if(input.equals("push_front")) {
				deque.offerFirst(st.nextToken());
			} else if (input.equals("push_back")) {
				deque.offerLast(st.nextToken());
			} else if (input.equals("pop_front")) {
				sb.append(!deque.isEmpty() ? deque.pollFirst() : "-1").append('\n');
			} else if (input.equals("pop_back")) {
				sb.append(!deque.isEmpty() ? deque.pollLast() : "-1").append('\n');
			} else if (input.equals("size")) {
				sb.append(deque.size()).append('\n');
			} else if (input.equals("empty")) {
				sb.append(!deque.isEmpty() ? "0" : "1").append('\n');
			} else if (input.equals("front")) {
				sb.append(!deque.isEmpty() ? deque.getFirst() : "-1").append('\n');
			} else if (input.equals("back")){
				sb.append(!deque.isEmpty() ? deque.getLast() : "-1").append('\n');
			}
		}
		
		
		br.close();
		System.out.println(sb.toString());
	}

}
