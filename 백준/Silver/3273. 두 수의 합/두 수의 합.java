import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        //수열의 크기 N
        int N = sc.nextInt();

        // N 대한 배열
        int[] arrayN = new int[N];

        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = sc.nextInt();
        }


        //자연수 X
        int X = sc.nextInt();

        sc.close();
        //쌍의 개수
        int count = 0;

        for (int i = 0; i < arrayN.length - 1; i++) {
            for (int j = i + 1; j < arrayN.length; j++) {
                if (arrayN[i] + arrayN[j] == X) {
//                    System.out.println(arrayN[i] + " " + arrayN[j]);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}


