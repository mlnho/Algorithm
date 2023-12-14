import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 주사위 3개
        int[] arrray = new int[3];

        int equalArray = 0;
        for (int i = 0; i < arrray.length; i++) {
            arrray[i] = sc.nextInt();
        }

        if (arrray[0] == arrray[1] && arrray[1] == arrray[2]) {
            System.out.println(10000 + arrray[0] * 1000);
        } else if (arrray[0] == arrray[1] || (arrray[0] == arrray[2])) {
            System.out.println(1000 + arrray[0] * 100);
        } else if (arrray[1] == arrray[2]) {
            System.out.println(1000 + arrray[1] * 100);
        } else {
            int max = arrray[0];
            if (arrray[1] > arrray[2] && arrray[1] > max) {
                System.out.println(arrray[1] * 100);
            } else if (arrray[2]>arrray[1] && arrray[2] > max){
                System.out.println(arrray[2] * 100);
            } else {
                System.out.println(arrray[0] * 100);
            }
        }   


    }
}





