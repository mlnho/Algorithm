import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        //문자를 배열로 split
        String[] sArray = s.split("");
        //alphabet 배열 지정
        int[] alphabet = new int[26];

        //알파벳 배열전부에 -1 넣기
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }


        //문자열 s 만큼 반복문
        //아스키코드 사용
        //문자열 각 하나에 대한 아스키코드 값을 -> 배열의 위치로 설정
        //그리고 그 위치에 반복문 i 값을 넣는다. (알파벳 위치 == i) ex)baekjoon 에서 b의 위치는 0 (==i)
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int sLocation = (int) ch - 97;
            if(alphabet[sLocation] == -1){
                alphabet[sLocation] = i;
            }
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }


    }
}





