import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int count = 0;
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            //0과 1은 제외시켰다 -> 소수를 구할 목적으로 
            for (int j = 2; j <= n; j++) {
                //j가 n과 같아졌다는 건 소수를 의미!
                if (n == j) {
                    count ++;
                } else if (n % j == 0) {
                    break;
                }
            }

        }
        System.out.println(count);
    }

}





