package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class solution_1030 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		long p=scanner.nextLong();
		long[] res=new long[N];
		for (int i = 0; i < N; i++) {
			res[i]=scanner.nextLong();
		}
		scanner.close();
		Arrays.sort(res);
		int max=0;
		int flag=0;
		for (int i = 0; i < N; i++) {
			if (N-i==max) {
				break;
			}
			int j=flag;
			for (; j < N-1; j++) {
				long rs=res[i]*p;
				if (res[j+1]>rs) {					
					break;
				}
			}
			flag=j+1;
			max=Math.max(max, flag-i);
		}
		System.out.println(max);
	}

}
