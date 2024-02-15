import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int min = 10001;
        for (int i = M; i <= N; i++) {
            boolean b = true;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }

        }


        if (sum == 0) {
            sb.append("-1");
        } else {
            sb.append(sum + "\n").append(min);
        }
        System.out.println(sb.toString());

        br.close();
    }
}

