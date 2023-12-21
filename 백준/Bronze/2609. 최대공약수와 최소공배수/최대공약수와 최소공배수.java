import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int bigN = Math.max(n1, n2);
        int smallN = Math.min(n1, n2);

        //[유클리드 호제법] 사용해보기
        //n1,n2두 수중 큰수를 bigN 으로 가정, 작은 수는 smallN
        //만약 bigN % smallN == 0 이라면
        //최대공약수는 -> smallN
        //but, 0이 아닐 시엔?
        //그렇다면 bigN에 기존 smallN이 들어가고
        //       smallN에는 0이 아닌 결과값을 넣고 다시 반복한다.
        //따라서 while문 사용

        while (bigN % smallN != 0) {
            int r = bigN % smallN;
            bigN = smallN;
            smallN = r;
        }

        System.out.println(smallN);
        //최소공배수는 주어진 두 수(n1,n2)/최대공약수 -> 최소공배수
        System.out.println(n1 * n2 / smallN);
    }
}


