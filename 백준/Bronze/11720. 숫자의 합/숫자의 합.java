import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        String[] array = s.split("");


        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }

        System.out.println(answer);
    }
}


