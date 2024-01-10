import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0; // 색종이가 붙은 검은 영역이 될것

        int n = sc.nextInt(); // 처음받는 색종이 갯수

        boolean[][] colorP = new boolean[100][100]; //도화지

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) { //+10인이유는 색종이의 가로 세로 길이가 10
                for (int k = y; k < y + 10; k++) {
                    if (!colorP[j][k]) {
                        colorP[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);


    }

}


