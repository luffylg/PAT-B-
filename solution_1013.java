package patb_java;

import java.util.ArrayList;
import java.util.Scanner;

public class solution_1013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		in.close();
		if (n==1) {
			System.out.printf("%d",2);
		}
		int num=3;
		int count=1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		while (count<m) {
			if (issu(num,list)) {
				list.add(num);
				if(++count<n) {
					num+=2;
					continue;
				}
				int ca=(count-n)%10;
				if (ca==0) {
					System.out.printf("%d",num);
				}else if (ca==9) {
					System.out.println(" "+num);
				}else {
					System.out.printf(" %d",num);
				}
			}
			num+=2;
		}
	}

	private static boolean issu(int num, ArrayList<Integer> list) {
		for (int i:list) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

}
