package patb_java;

import java.util.ArrayList;
import java.util.Scanner;

public class solution_1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] py=new String[]{"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		int sum=0;
		while(n>0){
			sum+=n%10;
			n/=10;
		}
		String s=String.valueOf(sum);
		for (int i = 0; i < s.length()-1; i++) {
			
			System.out.print(py[(s.charAt(i)-'0')]+" ");
		}
		System.out.print(py[(s.charAt(s.length()-1)-'0')]);
	}

}
