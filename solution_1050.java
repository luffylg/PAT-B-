package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1050 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(reader.readLine());
		String[] split=reader.readLine().split(" ");
		reader.close();
		int[] ints=new int[N];
		for (int i = 0; i < ints.length; i++) {
			ints[i]=Integer.valueOf(split[i]);
		}
		Arrays.sort(ints);
		int n=(int) Math.floor(Math.sqrt(N));
		while (n>0) {
			if (N%n==0) break;
			n--;
		}
		int m=N/n;
		int [][] rst=new int[m][n];
		int count=N-1;
		for (int i = 0; i < (n+1)/2; i++) {
			for (int j = i; j < n-i; j++) {
				rst[i][j]=ints[count--];
			}
			for (int j = i+1; j < m-i-1; j++) {
				rst[j][n-1-i]=ints[count--];
			}
			for (int j = n-1-i; j >=i; j--) {
				if (m==2*i+1) break;
				rst[m-1-i][j]=ints[count--];
			}
			for (int j = m-i-2; j >i; j--) {
				if (n==2*i+1) break;
				rst[j][i]=ints[count--];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rst[i][j]);
				if (j+1!=n) {
					System.out.print(" ");
				}else {
					System.out.println();
				}
			}
		}
	}

}
