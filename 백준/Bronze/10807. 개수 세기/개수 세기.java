import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열의 길이 = N
        int N = sc.nextInt();
        int[] arrays = new int[N];


        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextInt();
        }

        // 찾으려는 수
        int v = sc.nextInt();
        int vCount = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == v) {
                vCount++;
            }
        }
        System.out.println(vCount);
    }
}

