package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1045 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine());
		String line=reader.readLine();
		reader.close();
		String[] split = line.split(" ");
		int[] cmp=new int[N];
		for (int i = 0; i < N; i++) {
			cmp[i]=Integer.valueOf(split[i]);
		}
		int[] origin=cmp.clone();
		Arrays.sort(cmp);
		int count=0;
		int max=0;
		String out="";
		for (int i=0;i<N ;i++) {
			int item=origin[i];
			max=Math.max(max, item);
			if (max!=item || cmp[i]!=item) {
				continue;
			}else {
				if (count!=0) {
					out+=(" "+String.valueOf(item));
				}else {
					out+=String.valueOf(item);
				}
				count++;
			}
		}
		System.out.println(count);
		System.out.println(out);
	}


}
