package patb_java;

import java.util.Scanner;

public class solution_1014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String aString=in.nextLine();
		String bString=in.nextLine();
		String cString=in.nextLine();
		String dString=in.nextLine();
		in.close();
		String[] weekday=new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
		char s1 ='a';
		char s2='a';
		int start1=0;
		int start2=0;
		for (int i = 0; i < aString.length(); i++) {
			char a=aString.charAt(i);
			
			if (a-'A'>26 || a-'A'<0) {
				continue;
			}
			for (int j = 0; j < bString.length(); j++) {
				char b=bString.charAt(j);
				if (a==b) {
					s1 = a;
					start2=j+1;
					break;
				}
			}
			if (start2!=0) {
				start1=i+1;
				break;
			}
		}
		System.out.print(weekday[s1-'A']+" ");
		for (int i = start1; i < aString.length(); i++) {
			char a=aString.charAt(i);
			if (a-'A'>26 || a-'A'<0) {
				continue;
			}
			for (int j = start2; j < bString.length(); j++) {
				char b=bString.charAt(j);
				if (a==b) {
					s2=a;
					break;
				}
			}
			if (s2!='a') {
				break;
			}
		}
		System.out.print(s2-'A'+10);
		
	}

}
