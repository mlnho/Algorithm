import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> lk = new LinkedList<>();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                lk.add(i);
            }
        }

        if (count < K) {
            sb.append("0");
        } else {
            sb.append(lk.get(K-1));
        }

        System.out.println(sb.toString());
        br.close();
    }
}

