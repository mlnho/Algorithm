import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int needRoom = 0;

        int[][] array = new int[2][6];

//        System.out.println(Arrays.toString(array));

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken()) - 1;

            array[S][Y]++;
        }
        br.close();
//        System.out.println/**/(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    continue;
                } else if (1 <= array[i][j] && array[i][j] <= K) {
                    needRoom++;
                } else if (array[i][j] > K) {
                    needRoom += array[i][j] / 2 + 1;
                }
            }
        }
        System.out.println(needRoom);
    }
}


