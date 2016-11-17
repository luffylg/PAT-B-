package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1054 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(reader.readLine());
		double sum=0;
		int count=0;
		String[] split = reader.readLine().split("\\s");
		reader.close();
		for (int i = 0; i < N; i++) {
			try {
				double num=Double.parseDouble(split[i]);
				if (num<-1000||num>1000) {
					System.out.println("ERROR: "+split[i]+" is not a legal number");
					continue;
				}
				int index=-1;
				for (int j = 1; j < split[i].length()-1; j++) {
					char ch=split[i].charAt(j);
					if (ch=='.') {
						index=j;
					}
				}
				if (index>0&&split[i].length()-index>3) {
					System.out.println("ERROR: "+split[i]+" is not a legal number");
					continue;
				}
				sum+=num;
				count++;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR: "+split[i]+" is not a legal number");
			}
		}
		if (count==0) {
			System.out.println("The average of 0 numbers is Undefined");
		}else if (count==1) {
			System.out.println("The average of 1 number is "+String.format("%.2f", sum));
		}else {
			System.out.println("The average of "+String.valueOf(count)+" numbers is "+String.format("%.2f", sum/count));
		}
		
	}

}
