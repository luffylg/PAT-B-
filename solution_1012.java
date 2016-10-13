package patb_java;

import java.util.Scanner;

public class solution_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len=in.nextInt();
		int a1=0;
		int a2=0;
		int a3=0;
		double a4=0;
		int a5=0;
		int count=0;
		int count2=0;
		for (int i = 0; i < len; i++) {
			int num=in.nextInt();
			int ca=num%5;
			switch (ca) {
			case 0:
				if (num%2==0) a1+=num;
				break;
			case 1:
				if (count%2==0) a2+=num;
				else a2-=num;
				count++;
				break;
			case 2:
				a3++;
				break;
			case 3:
				count2++;
				a4+=num;
				break;
			case 4:
				if(num>a5) a5=num;
				break;
			}
		}
		in.close();
		System.out.print(a1==0?"N":a1);
		System.out.print(" "+String.valueOf(count==0?"N":a2));
		System.out.print(" "+String.valueOf(a3==0?"N":a3));
		System.out.print(" ");
		System.out.print(a4==0?"N":String.format("%.1f", a4/count2));
		System.out.print(" "+String.valueOf(a5==0?"N":a5));
	}

}
