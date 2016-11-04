package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1046 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(reader.readLine());
		int countjia=0;
		int countyi=0;
		for (int i = 0; i < N; i++) {
			String line = reader.readLine();
			String[] split = line.split(" ");
			int jiahua=Integer.valueOf(split[1]);
			int yihua=Integer.valueOf(split[3]);
			int rst=Integer.valueOf(split[0])+Integer.valueOf(split[2]);
			if (jiahua==rst&&yihua!=rst) {
				countyi++;
			}else if (jiahua!=rst&&yihua==rst) {
				countjia++;
			}
		}
		reader.close();
		System.out.println(countjia+" "+countyi);
	}

}
