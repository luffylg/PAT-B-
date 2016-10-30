package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1040 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String S=bufferedReader.readLine();
		bufferedReader.close();
		long sum=0;
		int mod=1000000007;
		int t=0;
		int p=0;
		for (int i = 0; i < S.length(); i++) {
			char ch=S.charAt(i);
			if (ch=='T') {
				t++;
			}
		}
		for (int i = 0; i < S.length(); i++) {
			char ch=S.charAt(i);
			if (ch=='P') {
				p++;
			}
			if (ch=='T') {
				t--;
			}
			if (ch=='A') {
				sum=(sum+p*t%mod)%mod;
			}
		}
		
		System.out.println(sum);
	}
	

}
