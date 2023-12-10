import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            String [] stringArray = s.split("");
            System.out.println(stringArray[0]+stringArray[stringArray.length-1]);
        }


    }
}


