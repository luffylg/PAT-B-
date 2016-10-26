package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1038 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String N=bufferedReader.readLine();
		String readLine = bufferedReader.readLine();
		String[] target = readLine.split(" ");
		String readLine2 = bufferedReader.readLine();
		String[] fenshu=readLine2.split(" ");
		int[] out=new int[Integer.valueOf(fenshu[0])];
		bufferedReader.close();
		for (int i = 0; i < target.length; i++) {
			for (int j = 1; j < fenshu.length; j++) {
				if (target[i].equals(fenshu[j])) {
					out[j-1]++;
				}
			}
		}
		System.out.print(out[0]);
		for (int i = 1; i < out.length; i++) {
			System.out.print(" "+out[i]);
		}
	}

}
