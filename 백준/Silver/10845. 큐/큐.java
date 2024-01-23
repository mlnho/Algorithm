import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> que = new LinkedList<Integer>();

		int num = 0; //back 처리를 위해,,, 마지막 으로 넣은값 뭔지 알려고!

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			if (input.equals("push")) {
				num = Integer.parseInt(st.nextToken());
				que.offer(num);
//				sb.append(num).append("\n");
			} else if (input.equals("pop")) {
				sb.append(que.isEmpty() ? "-1" : que.poll()).append("\n");
			} else if (input.equals("size")) {
				sb.append(que.size()).append("\n");
			} else if (input.equals("empty")) {
				sb.append(que.isEmpty() ? "1" : "0").append("\n");
			} else if (input.equals("front")) {
				sb.append(que.isEmpty() ? "-1" : que.peek()).append("\n");
			} else if (input.equals("back")) {
				sb.append(que.isEmpty() ? "-1" : num).append("\n");
			}
		}

//		System.out.println(que);
		System.out.println(sb);

		br.close();
	}

}
