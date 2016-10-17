package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		br.close();
		int[] num=new int[10];
		for (int i = 0; i < line.length(); i++) {
			char c=line.charAt(i);
			num[c-'0']++;
		}
		for (int j = 0; j < num.length; j++) {
			if (num[j]!=0) {
				System.out.println(j+":"+num[j]);
			}
		}
	}

}
