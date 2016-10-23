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
		if (broken.indexOf('+')!=-1) {
			for (int i = 0; i < input.length(); i++) {
				char ch=input.charAt(i);
				if ((ch<'A'||ch>'Z')&&broken.toLowerCase().indexOf(ch)==-1) {
					System.out.print(ch);
				}
			}
		}else {
			for (int i = 0; i < input.length(); i++) {
				char ch=input.charAt(i);
				if (broken.toLowerCase().indexOf(String.valueOf(ch).toLowerCase())==-1) {
					System.out.print(ch);
				}
			}
		}
		
	}

}
