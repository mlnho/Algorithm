import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =  Integer.parseInt(br.readLine());

        int [] x = new int[N];
        int [] y = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());

        }


        Arrays.sort(x);
        Arrays.sort(y);


        int xMax = x[N-1];
        int xMin = x[0];

        int yMax = y[N-1];
        int yMin = y[0];

        System.out.println( (xMax-xMin) * (yMax-yMin) );
    }
}

