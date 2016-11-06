package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class solution_1049 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		float[] fl=new float[N];
		for (int i = 0; i < N; i++) {
			fl[i]=scanner.nextFloat();
		}
		scanner.close();
		Arrays.sort(fl);
		float sum=0;
		for (int i = 0; i < fl.length; i++) {
			sum+=fl[i]*(i+1)*(fl.length-i);
		}
		System.out.println(String.format("%.2f", sum));
	}

}
