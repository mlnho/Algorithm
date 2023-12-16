import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 저번 달 통화 횟수
        int N = sc.nextInt();
        // 영식 요금제
        int[] priceY = new int[N];
        // 민식 요금제
        int[] priceM = new int[N];

        // 입력받는 시간 배열
        int[] time = new int[N];

        // 각 요금제 합계
        int ySum = 0;
        int mSum = 0;

        for (int i = 0; i < N; i++) {
            time[i] = sc.nextInt();
        }


        // 영식 요금제
        for (int i = 0; i < N; i++) {

            int phonePriceY = time[i] / 30;
            if (phonePriceY == 0) {
                priceY[i] = 10;
            } else if (phonePriceY != 0) {
                priceY[i] = phonePriceY * 10 + 10;
            }
            ySum += priceY[i];

        }

        // 민식 요금제
        for (int i = 0; i < N; i++) {
            int phonePriceM = time[i] / 60;
            if (phonePriceM == 0) {
                priceM[i] = 15;
            } else if (phonePriceM != 0) {
                priceM[i] = phonePriceM * 15 + 15;
            }
            mSum += priceM[i];

        }


        // 요금제 비교
        if (mSum > ySum) {
            System.out.println("Y " + ySum);
        } else if (ySum > mSum) {
            System.out.println("M " + mSum);
        } else {
            System.out.println("Y M " + ySum);
        }

    }
}





