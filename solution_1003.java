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
		int a1=0;
		int n=0;
		int point=0;
		for (int i = 0; i < s.length(); i++) {
			point++;
			char val = s.charAt(i);
			if (val=='P') {
				a1=i;
				break;
			}
			if (val!='A') return false;
			
		}
		for (int j = point; j < s.length(); j++){	
			point++;
			char val = s.charAt(j);
			if (val=='T'){
				n=j-a1-2;
				if (n<0) return false;
				break;
			}
			if (val!='A') return false;
		}
		for (int i = point; i < s.length(); i++) {
			char val = s.charAt(i);
			if (val!='A') return false;
		}
		return s.length()-point==(n+1)*a1;
	}


}
