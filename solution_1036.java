package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1036 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		reader.close();
		String[] split = line.split(" ");
		double sum=Integer.valueOf(split[0]);
		String aString=split[1];
		for (int i = 0; i < Math.round(sum/2.0); i++) {
			if (i==0||i==Math.round(sum/2.0)-1) {
				for (int j = 0; j < sum; j++) {
					System.out.print(aString);
				}
				System.out.println();
			}else {
				System.out.print(aString);
				for (int j = 1; j < sum-1; j++) {
					System.out.print(" ");
				}
				System.out.println(aString);
			}
		}
	}

}
