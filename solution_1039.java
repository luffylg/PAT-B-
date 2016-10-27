package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class solution_1039 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String judge = bufferedReader.readLine();
		String standard = bufferedReader.readLine();
		bufferedReader.close();
		ArrayList<Character> arrayList = new ArrayList<Character>();
		for (char ch : standard.toCharArray()) {
			arrayList.add(ch);
		}
		boolean flag=true;
		for (char ch : judge.toCharArray()) {
			if (arrayList.contains(ch)) {
				arrayList.remove((Character)ch);
			}
			if (arrayList.isEmpty()) {
				System.out.println("Yes "+String.valueOf(judge.length()-standard.length()));
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println("No "+arrayList.size());
		}
		
	}

}
