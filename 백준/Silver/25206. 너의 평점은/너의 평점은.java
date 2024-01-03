import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;


        //학점의 총합
        double sumScore = 0;

        //전공평점
        double avgScore = 0;


        for (int i = 0; i < 20; i++) {
            double gradeScore;
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("A+")) {
                gradeScore = 4.5;
                sumScore += score;
            } else if (grade.equals("A0")) {
                gradeScore = 4.0;
                sumScore += score;
            } else if (grade.equals("B+")) {
                gradeScore = 3.5;
                sumScore += score;
            } else if (grade.equals("B0")) {
                gradeScore = 3.0;
                sumScore += score;
            } else if (grade.equals("C+")) {
                gradeScore = 2.5;
                sumScore += score;
            } else if (grade.equals("C0")) {
                gradeScore = 2.0;
                sumScore += score;
            } else if (grade.equals("D+")) {
                gradeScore = 1.5;
                sumScore += score;
            } else if (grade.equals("D0")) {
                gradeScore = 1.0;
                sumScore += score;
            } else if (grade.equals("F")) {
                gradeScore = 0.0;
                sumScore += score;
            } else {
                continue;
            }
            avgScore += score * gradeScore;
        }

        System.out.println(avgScore / sumScore);


    }

}


