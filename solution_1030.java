package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1030 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line1 = reader.readLine();
		String[] split1 = line1.split(" ");
		String line2 = reader.readLine();
		String[] split2 = line2.split(" ");
		reader.close();
		int N=Integer.valueOf(split1[0]);
		long p=Integer.valueOf(split1[1]);
		long[] res=new long[N];
		for (int i = 0; i < N; i++) {
			res[i]=Integer.parseInt(split2[i]);
		}
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
