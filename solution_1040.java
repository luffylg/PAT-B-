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
		int i=0;
		long sum=0;
		while (i<S.length()) {
			int countp=0;
			int counta=0;
			int countt=0;
			char c=S.charAt(i);
			if (c!='P') {			
				i++;
				continue;
			}
			countp=1;
			
			int j=i+1;
			while (j<S.length()) {
				char c2=S.charAt(j);
				if (c2=='A') {
					counta=1;
					break;
				}
				if (c2=='P') {
					countp++;
				}
				j++;
			}			
			int k=j+1;
			while (k<S.length()) {
				char c3=S.charAt(k);
				if (c3=='T') {
					countt=1;
					break;
				}
				if (c3=='A') {
					counta++;
				}
				k++;
			}			
			for (int l = k+1; l < S.length(); l++) {
				char c4=S.charAt(l);
				if (c4=='T') {
					countt++;
				}
			}
			if (countp==0||counta==0||countt==0) {
				break;
			}
			sum+=(countp*counta*countt)%1000000007;
			sum=sum%1000000007;
			i=j+1;
			
		}
		
		System.out.println(sum);
	}
	

}
