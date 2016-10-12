package patb_java;

import java.util.Scanner;

public class solution_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] ar=new int[n];
		for (int i = 0; i < n; i++) {
			ar[(i+m)%n]=in.nextInt();
		}
		in.close();
		System.out.print(ar[0]);
		for(int i = 1;i<n;i++) System.out.print(" "+ar[i]);
	}

}
