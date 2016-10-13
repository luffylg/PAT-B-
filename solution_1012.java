package patb_java;

import java.util.Scanner;

public class solution_1012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len=in.nextInt();
		int[] zu=new int[len];
		int a1=0;
		int a2=0;
		int a3=0;
		int a4=0;
		int a5=0;
		int flag=0;
		int count=0;
		int count2=0;
		for (int i = 0; i < len; i++) {
			int num=in.nextInt();
			switch (num%5) {
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
				a5=Math.max(a5, num);
				break;
			}
//			if (num%10==0) {
//				a1+=num;
//			}else if (num%5==1) {
//				if (flag==0) {
//					count=1;
//					a2+=num;
//					flag=1;
//				}else {
//					a2-=num;
//					flag=0;
//				}
//			}else if (num%5==2) {
//				a3++;
//			}else if (num%5==3) {
//				count2++;
//				a4+=num;
//			}else if (num%5==4) {
//				a5=Math.max(a5, num);
//			}
		}
		in.close();
		System.out.print(a1==0?"N":a1);
		System.out.print(" "+String.valueOf(count==0?"N":a2));
		System.out.print(" "+String.valueOf(a3==0?"N":a3));
		System.out.print(" "+String.valueOf(a4==0?"N":String.format("%.1f", (double)(a4)/(double)(count2))));
		System.out.print(" "+String.valueOf(a5==0?"N":a5));
	}

}
