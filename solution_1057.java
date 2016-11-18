package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1057 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		reader.close();
		int sum=0;
		for (char ch : line.toCharArray()) {
			if (ch>='A'&&ch<='Z') {
				sum+=(ch-'A'+1);
			}else if (ch>='a'&&ch<='z') {
				sum+=(ch-'a'+1);
			}
		}
		int count0=0;
		int count1=0;
		while (sum!=0) {
			if (sum%2==0) {
				count0++;
			}else {
				count1++;
			}
			sum/=2;
		}
		System.out.println(String.valueOf(count0)+" "+String.valueOf(count1));
	}

}
