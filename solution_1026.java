package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1026 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		reader.close();
		String[] split = readLine.split(" ");
		int num=Integer.valueOf(split[1])-Integer.valueOf(split[0]);
		int rs=(int)Math.rint((double)num/100.0);
		int s=rs%60;
		int m=(rs/60)%60;
		int h=rs/3600;
		System.out.println((h<10?("0"+h):h)+":"+(m<10?("0"+m):m)+":"+(s<10?("0"+s):s));
	}

}
