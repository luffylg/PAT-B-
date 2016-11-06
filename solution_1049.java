package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1049 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(reader.readLine());
		String[] split=reader.readLine().split(" ");
		reader.close();
		float[] fl=new float[N];
		for (int i = 0; i < split.length; i++) {
			fl[i]=Float.valueOf(split[i]);
		}
		Arrays.sort(fl);
		float sum=0;
		for (int i = 0; i < fl.length; i++) {
			sum+=fl[i]*(i+1)*(fl.length-i);
		}
		System.out.println(String.format("%.2f", sum));
	}

}
