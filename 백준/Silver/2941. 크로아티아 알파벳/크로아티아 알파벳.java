import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String user = sc.next();

        for (int i = 0; i < croa.length; i++) {
            if (user.contains(croa[i])) {
                user = user.replace(croa[i], "!");

            }
        }
        System.out.println(user.length());
    }

}


