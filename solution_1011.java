package patb_java;

import java.util.Scanner;

public class solution_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count=in.nextInt();
		long[]a=new long[count];
		long[]b=new long[count];
		long[]c=new long[count];
		for(int i=1;i<=count;i++){
			a[i-1]=in.nextLong();
			b[i-1]=in.nextLong();
			c[i-1]=in.nextLong();
		}
		in.close();
		for(int j=0;j<count;j++) {
			if (a[j]+b[j]>c[j]) {
				System.out.println("Case #"+String.valueOf(j+1)+": true");
			}else {
				System.out.println("Case #"+String.valueOf(j+1)+": false");
			}
		}
		
	}

}
