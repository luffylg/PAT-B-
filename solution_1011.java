package patb_java;

import java.util.Scanner;

public class solution_1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count=in.nextInt();
		int[][] val=new int[count][3];
		for(int i=1;i<=count;i++){
			val[i-1][0]=in.nextInt();
			val[i-1][1]=in.nextInt();
			val[i-1][2]=in.nextInt();
		}
		in.close();
		for(int j=0;j<count;j++) System.out.println("Case #"+String.valueOf(j+1)+": "+String.valueOf(val[j][0]+val[j][1]>val[j][2]));
		
	}

}
