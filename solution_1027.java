package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1027 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		String[] split = readLine.split(" ");
		String out=split[1];
		int sum=Integer.valueOf(split[0]);
		int n= (int) Math.floor(Math.sqrt((sum+1)/2.0));
		for (int i = n; i > 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(out);
			}
			System.out.println();
		}
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(out);
			}
			System.out.println();
		}
		System.out.println(sum-2*n*n+1);
	}

}
