import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        double[] scores = new double[T];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();

        }

        // 오름 차순 정렬
        // 최댓값은 자동으로 마지막 배열값이 됌
        Arrays.sort(scores);

        //총점이 들어갈 totalScore
        double totalScore = 0;

        for (int i = 0; i < scores.length; i++) {
            double max = scores[scores.length - 1];
            scores[i] = scores[i] / max * 100;
            totalScore += scores[i];
        }


        System.out.println(totalScore / scores.length);

    }

}





