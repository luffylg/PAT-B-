package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1051 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] strings=reader.readLine().split(" ");
		reader.close();
		float R1=Float.parseFloat(strings[0]);
		float P1=Float.parseFloat(strings[1]);
		float R2=Float.parseFloat(strings[2]);
		float P2=Float.parseFloat(strings[3]);
		double A=R1*R2*Math.cos(P1+P2);
		double B=R1*R2*Math.sin(P1+P2);
		if (A>-0.005&&A<0) {
			System.out.print("0.00");
		}else {
			System.out.print(String.format("%.2f", A));
		}
		if (B>-0.005&&B<0) {
			System.out.print("+0.00");		
		}else if (B<=-0.005) {
			System.out.print(String.format("%.2f", B));
		}else {
			System.out.print(String.format("%+.2f", B));
		}
		
		System.out.println("i");
	}

}
