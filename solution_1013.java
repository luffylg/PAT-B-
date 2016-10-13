package patb_java;

import java.util.Scanner;

public class solution_1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		in.close();
		if (n==1) {
			System.out.print(2);
		}
		int num=3;
		int count=1;
		while (count<m) {
			if (issu(num)) {
				if(++count<n) {
					num+=2;
					continue;
				}
				int ca=(count-n)%10;
				if (ca==0) {
					System.out.print(num);
				}else if (ca==9) {
					System.out.println(" "+num);
				}else {
					System.out.print(" "+num);
				}
			}
			num+=2;
		}
	}

	private static boolean issu(int num) {
		int len=(int) Math.sqrt(num);
		for (int i = 3; i <= len; i+=2) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

}
