package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1023 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] split = line.split(" ");
		for (int i = 1; i < 10; i++) {
			if (!split[i].equals("0")) {
				split[i]=String.valueOf(Integer.valueOf(split[i])-1);
				System.out.print(i);
				break;
			}			
		}
		for (int i = 0; i < 10; i++) {
			int num=Integer.valueOf(split[i]);
			while (num>0) {
				System.out.print(i);
				num--;
			}
			
		}
	}

}
