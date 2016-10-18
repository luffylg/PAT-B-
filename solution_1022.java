package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		reader.close();
		String[] split = line.split(" ");
		int sum=Integer.valueOf(split[0])+Integer.valueOf(split[1]);
		int D=Integer.valueOf(split[2]);
		String rs="";
		do{
			rs=String.valueOf(sum%D)+rs;
			sum/=D;
		}while (sum>0);
		System.out.println(rs);
	}

}
