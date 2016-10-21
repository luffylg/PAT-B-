package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class solution_1029 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine().toUpperCase();
		String output=reader.readLine().toUpperCase();
		reader.close();
		int i=0;
		int j=0;
		HashSet<Character> set = new LinkedHashSet<Character>();
		while (j<output.length()) {
			while (input.charAt(i)-output.charAt(j)!=0) {		
				set.add(input.charAt(i));						
				i++;
			}
			i++;
			j++;
		}
		for (int k = i; k < input.length(); k++) {
			set.add(input.charAt(k));
		}
		for (Character character : set) {
			System.out.print(character);
		}
	}

}
