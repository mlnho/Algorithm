import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            int sum  = 0; // 자연수 n 의 생성자 될 것이다.
            String m = String.valueOf(i); //정수길이만큼 반복문을 하기 위해서 String 타입으로 변환시킨이후 반복문을 돌린다.

            // 자릿수들의 값을 찾기 위한 반복문
            // ex) 198 이라면 1,9,8 뽑아내려고
            for (int j = 0; j < m.length(); j++) {
                // 알게된 것!
                // : charAt(정수)를 온전히 int 타입으로 변환시키고 싶었는데
                // 이를 Character.getNumericValue 를 통해서 깔끔해서 변환이 가능하다!
                sum += Character.getNumericValue(m.charAt(j));

            }
            //1,9,8 (sum) + 198 을 더하는 코드
            sum += i;
            if(sum == n){ // 조건문을 통해서 일치한다면 sum은 n의 생성자!
                System.out.println(i);
                break; // 가장 작은 생성자를 찾으면 완료이기 때문에 break;를 넣어줬다.
            } else if (i==n) {
                System.out.println("0");

            }

        }
    }
}





