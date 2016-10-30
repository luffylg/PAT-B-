package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1042 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input=reader.readLine().toLowerCase();
		reader.close();
		int[] count=new int[26];
		for (char c : input.toCharArray()) {
			if (c<'a'||c>'z') {
				continue;
			}else {
				count[c-'a']++;
			}
		}
		int max=0;
		int zimu=0;
		for (int i = 0; i < count.length; i++) {
			if (count[i]>max) {
				max=count[i];
				zimu=i;
			}
		}
		System.out.println((char) ('a'+zimu)+" "+max);
	}

}
