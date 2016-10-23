package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.valueOf(reader.readLine());
		int[] rs=new int[row];
		int r=0;
		int max=0;
		for (int i = 0; i < row; i++) {
			String read=reader.readLine();
			String[] split=read.split(" ");
			rs[Integer.valueOf(split[0])-1]+=Integer.valueOf(split[1]);
			if (max<rs[Integer.valueOf(split[0])-1]) {
				max=rs[Integer.valueOf(split[0])-1];
				r=Integer.valueOf(split[0]);
			}
		}
		reader.close();
		System.out.println(r+" "+max);
	}

}
