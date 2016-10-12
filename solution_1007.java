package patb_java;

import java.util.Scanner;

public class solution_1007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		int count=0;
		int flag=0;
		for (int i = 3; i <= val; i+=2) {
			if (!isSu(i)) {
				flag=0;
			}else {
				if (flag==1) count++;
				flag=1;
			}
		}
		System.out.println(count);
	}

	private static boolean isSu(int i) {
		// TODO Auto-generated method stub
		int ceil = (int) Math.ceil(Math.sqrt(i));
		for (int j = 3; j <= ceil; j+=2) {
			if (i%j==0) return false;
		}
		return true;
	}

}
