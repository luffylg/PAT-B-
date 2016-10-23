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
		int count=row;
		for (int i = 0; i < row; i++) {
			String read=reader.readLine();
			String[] split=read.split(" ");
			rs[Integer.valueOf(split[0])-1]+=Integer.valueOf(split[1]);
		}
		int max=0;
		int r=0;
		for (int i = 0; i < rs.length; i++) {
			if (rs[i]>max) {
				max=rs[i];
				r=i+1;
			}
		}
		reader.close();
		System.out.println(r+" "+max);
	}

}
