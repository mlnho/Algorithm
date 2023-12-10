import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 행렬의 크기
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] firstArrays = new int[N][M];
        int[][] secondArrays = new int[N][M];
        int[][] answerArrays = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                firstArrays[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                secondArrays[i][j] = scanner.nextInt();
                answerArrays[i][j] = firstArrays[i][j] + secondArrays[i][j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(answerArrays[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

