import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D+","D0","D-","F"};
        double [] gradeScore = {4.3,4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0.7,0.0};

        String C = scanner.next();

        for (int i = 0; i < grade.length; i++) {
            if(C.equals(grade[i])){
                System.out.println(gradeScore[i]);
            }
        }
    }
}

