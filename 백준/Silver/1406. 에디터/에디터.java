import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문자열 입력
        String s = br.readLine();
        String[] stArr = s.split("");
        LinkedList<String> list = new LinkedList<String>();

        for (int i = 0; i < stArr.length; i++) {
            list.add(stArr[i]);
        }

        // LinkedList -> ListIterator로 변환

        ListIterator<String> iter = list.listIterator();

        //입력 명령어
        int N = Integer.parseInt(br.readLine());


        // 커서 시작을 가장 오른쪽으로 옮기기 위해서 while문을 사용
        // add할시 iterator는 가장 앞쪽에 add하는 것을 막기 위한 것
        while (iter.hasNext()) {
            iter.next();
        }


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String tk = st.nextToken();
            if (tk.equals("L")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                }
            } else if (tk.equals("D")) {
                if (iter.hasNext()) {
                    iter.next();
                }
            } else if (tk.equals("B")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }

            } else if (tk.equals("P")) {
                iter.add(st.nextToken());
            }

        }
        for (String string : list) {
            bw.write(string);
        }

        bw.flush();
        bw.close();
    }
}

