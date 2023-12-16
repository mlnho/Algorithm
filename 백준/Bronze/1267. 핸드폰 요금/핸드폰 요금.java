import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 저번 달 통화 횟수
        int N = sc.nextInt();

        // 각 요금제 합계
        int ySum = 0;
        int mSum = 0;

        // 요금제 합계
        for (int i = 0; i < N; i++) {
            int time = sc.nextInt();
            ySum += (time/30+1)*10;
            mSum += (time/60+1)*15;

        }

        // 요금제 비교
        if (mSum > ySum) {
            System.out.println("Y " + ySum);
        } else if (mSum < ySum) {
            System.out.println("M " + mSum);
        } else {
            System.out.println("Y M " + ySum);
        }

    }
}





