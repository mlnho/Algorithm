import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if('a' <= tmp && tmp <= 'z') {
                System.out.print(Character.toUpperCase(tmp));
            } else {
                System.out.print(Character.toLowerCase(tmp));
            }
        }


    }
}

