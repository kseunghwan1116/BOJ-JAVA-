package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ȭ������_5355 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double num = Double.parseDouble(st.nextToken());
			while(st.hasMoreTokens()) {
				String oper = st.nextToken();
				if(oper.equals("@"))
					num *= 3;
				else if(oper.equals("%"))
					num += 5;
				else if(oper.equals("#"))
					num -= 7;
			}
			System.out.printf("%.2f\n", num);
		}
		br.close();
	}
}
