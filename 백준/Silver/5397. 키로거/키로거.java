import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// 테스트 케이스
		int L = Integer.parseInt(br.readLine());

	

		for (int i = 0; i < L; i++) {
			LinkedList<String> pw = new LinkedList<String>();
			
			// LinkiedList -> Iterator
			ListIterator<String> iter = pw.listIterator();
			
			String input = br.readLine();
			for (int j = 0; j < input.length(); j++) {
				char tk = input.charAt(j);
//				System.out.println(tk);

				if (tk == '<') {
					if (iter.hasPrevious()) {
						iter.previous();
					}
				} else if (tk == '>') {
					if (iter.hasNext()) {
						iter.next();
					}
				} else if (tk == '-') {
					if (iter.hasPrevious()) {
						iter.previous();
						iter.remove();
					}
				} else {
					iter.add(String.valueOf(tk));
				}
			}
			
			for (String a : pw) {
				bw.write(a);
			}
			bw.write("\n");
			bw.flush();
		}
	
		br.close();
	}

}
