import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 체스 총 피수
        int [] chess = {1,1,2,2,2,8};

        int [] userN = new int[6];
        for (int i = 0; i < userN.length; i++) {
            userN[i] = sc.nextInt();
        }

        for (int i = 0; i < userN.length; i++) {
            System.out.print(chess[i] - userN[i] + " ");
        }
    }


}





