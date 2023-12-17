import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            String[] s1Array = new String[s1.length()];
            String[] s2Array = new String[s2.length()];


            for (int j = 0; j < s1.length(); j++) {
                s1Array[j] = String.valueOf(s1.charAt(j));
            }
            for (int j = 0; j < s2.length(); j++) {
                s2Array[j] = String.valueOf(s2.charAt(j));
            }

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            boolean answer = true;
            for (int k = 0; k < s1.length(); k++) {
                if (s1Array[k].equals(s2Array[k])) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
            if (answer) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }


    }
}


