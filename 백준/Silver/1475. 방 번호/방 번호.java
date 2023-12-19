import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //예제 입력 받기
        String N = br.readLine();
        br.close();
        //예제 배열
        int[] array = new int[N.length()];

        // 0~9 배열 (1~8의미)
        // 9는 6으로 처리할거임 어차피 이중으로 사용가능해서! 6=9,
        int[] zeroTen = new int[9];

        for (int i = 0; i < array.length; i++) {
            if (N.charAt(i) - '0' == 9) {
                zeroTen[6]++;
            } else {
                zeroTen[N.charAt(i) - '0']++;
            }
        }
//        System.out.println(Arrays.toString(zeroTen));

        int answer = 0;
        for (int i = 0; i < zeroTen.length; i++) {
            if (answer < zeroTen[i]) {
                if (i == 6 && zeroTen[i] % 2 == 0) {
                    zeroTen[i] = zeroTen[i] / 2;
                } else if (i == 6 && zeroTen[i] % 2 != 0) {
                    zeroTen[i] = (zeroTen[i] / 2) + 1;
                } 
                answer = zeroTen[i];
            }
        }

        System.out.println(answer);
    }
}


