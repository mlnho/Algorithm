import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열의 길이 = N
        int N = sc.nextInt();
        int[] arrays = new int[N];

        // X보다 작은 수 출력
        int X = sc.nextInt();


        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextInt();
            }

        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] < X) {
                System.out.print(arrays[i] + " ");
            }
        }

    }
}

