package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class solution_1019 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String  num= reader.readLine();
//		Scanner in = new Scanner(System.in);
//		String num=in.next();
//		in.close();
		reader.close();
		if (Integer.valueOf(num)%1111==0) {
			System.out.println(num+" - "+num+" = 0000");
		}else {
			 do{	
				char[] array = num.toCharArray();				
				Arrays.sort(array);
				StringBuilder sBuilder = new StringBuilder();
				sBuilder.append(array);
				String min=sBuilder.toString();
				String max = sBuilder.reverse().toString();
				num=String.valueOf(Integer.valueOf(max)-Integer.valueOf(min));
				System.out.println(max+" - "+min+" = "+num);
			}while (!num.equals("6174"));
		}
	}

}
