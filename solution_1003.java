package patb_java;

import java.net.PasswordAuthentication;
import java.util.Scanner;

public class solution_1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		in.nextLine();
		//读取int之后不读取换行符
		for (int i = 0; i < len; i++) {
			String s = in.nextLine();
			System.out.println(pass(s)?"YES":"NO");
		}
		in.close();
	}

	private static Boolean pass(String s) {
		// TODO Auto-generated method stub
		int len=s.length();
		if (len<3) return false;
		int a1=0;
		int n=0;
		int p=0;
		int t=0;
		int ts=0;
		for (int i = 0; i < len; i++) {
			char val = s.charAt(i);
			if (val=='P'){
				p++;
				a1=i;
			}else if (val=='T') {
				t++;
				ts=i;
			}else if (val!='A') return false;
		}
		n=ts-a1-1;
		if (t!=1 || p!=1 || n<0) return false;
		return n*a1==(len-ts-1);
	}
}
