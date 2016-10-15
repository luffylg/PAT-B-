package patb_java;

import java.util.Scanner;

public class solution_1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum=0;
		for(int t=0;t<2;t++){
			int val=0;
			String A=in.next();
			int DA=in.nextInt();
			for (int i = 0; i < A.length(); i++) {
				char ch=A.charAt(i);
				if (ch-'0'==DA) {
					val=val*10+DA;
				}
			}
			sum+=val;
		}
		in.close();
		System.out.println(sum);
		
	}

}
