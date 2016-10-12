package patb_java;

import java.util.Scanner;

public class solution_1006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		String out="";
		for (int i = 0; i < num%10; i++) {
			out+=String.valueOf(i+1);
		}
		num/=10;
		for (int i = 0; i < num%10; i++) {
			out="S"+out;
		}
		num/=10;
		for (int i = 0; i < num%10; i++) {
			out="B"+out;
		}
		System.out.println(out);
	}
}
