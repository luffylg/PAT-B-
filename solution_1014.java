package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class solution_1014 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String aString=reader.readLine();
		String bString=reader.readLine();
		String cString=reader.readLine();
		String dString=reader.readLine();
		reader.close();
		String[] weekday=new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
		char s1 ='a';
		char s2='a';
		int count2=0;
		for (int i = 0; i < Math.min(aString.length(), bString.length()); i++) {
			char a=aString.charAt(i);
			char b=bString.charAt(i);
			if (a==b) {
				if (count2==0) {
					if (a-'G'<=0 && a-'A'>=0) {
						count2=1;
						s1=a;
					}
				}else if((a-'0'>=0&&a-'0'<=9)||(a-'A'>=0&&a-'N'<=0)){
					s2=a;
					break;
				}
			}
		}
		System.out.print(weekday[s1-'A']+" ");
		if (s2-'N'<=0 && s2-'A'>=0) {
			System.out.print(s2-'A'+10);
		}else {
			System.out.print(0);
			System.out.print(s2-'0');
		}
		int ps=0;
		for (int i = 0; i < Math.min(cString.length(), dString.length()); i++) {
			char c=cString.charAt(i);
			char d=dString.charAt(i);
			if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				if (c==d) {
					ps=i;
					break;
				}
			}
		}
		if (ps<10) {
			System.out.print(":0"+ps);
		}else {
			System.out.print(":"+ps);
		}
		
	}

}
