import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] answer = new int[numbers.length];
        ArrayList<Integer> myAnswer = new ArrayList<>();

        // 값 넣기
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i] % 42;
            if (!myAnswer.contains(answer[i])) {
                myAnswer.add(answer[i]);
                count++;
            }
        }


        System.out.println(count);

    }
}





