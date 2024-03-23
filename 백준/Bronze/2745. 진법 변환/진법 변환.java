import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        //B진법 수 N
        //N : ZZZZZ
        //B : 36
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int tmp = 1; //자릿수
        int sum = 0; //결과값

        //A는 아스키코드로 65

        for (int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(i);
            if ('A' <= C && C <= 'Z') {
                sum += (C - 'A' + 10) * tmp; //10을 더한 이유는 문자를 10진수로
            } else {
                sum += (C - '0') * tmp;
            }
            tmp *= B;
        }

        System.out.println(sum);
        br.close();


    }
}

