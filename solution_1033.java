package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1033 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String broken=reader.readLine();
		String input=reader.readLine();
		reader.close();
		for (int i = 0; i < broken.length(); i++) {
			char ch=broken.charAt(i);
			if (ch=='+') {
				input=input.replaceAll("[A-Z]", "");
				input=input.replace(String.valueOf(ch), "");
			}else {
				input=input.replace(String.valueOf(ch).toLowerCase(), "");
				input=input.replace(String.valueOf(ch).toUpperCase(), "");
			}			
		}
		System.out.println(input);
	}

}
