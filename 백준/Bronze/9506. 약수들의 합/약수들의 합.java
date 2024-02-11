import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        while (n != -1) {
            StringBuilder sb = new StringBuilder();
            n = Integer.parseInt(br.readLine());

            sb.append(n).append(" ");

            int k = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    k += i;
                }
            }

            if (k == n) {
                sb.append("= 1");
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        sb.append(" + ").append(i);
                    }
                }
            } else if (n == -1) {
                break;
            } else {
                sb.append("is NOT perfect.");
            }

            System.out.println(sb);
        }
        br.close();
    }
}

