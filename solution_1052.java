package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution_1052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Pattern pattern=Pattern.compile("\\[(.*?)\\]");
		String hands=reader.readLine();
		String eyes=reader.readLine();
		String mouths=reader.readLine();
		Matcher h = pattern.matcher(hands);
		Matcher e = pattern.matcher(eyes);
		Matcher m = pattern.matcher(mouths);
		ArrayList hand = new ArrayList<String>();
		ArrayList eye = new ArrayList<String>();
		ArrayList mouth = new ArrayList<String>();
		while (h.find()) {
			hand.add(h.group(1));
		}
		while (e.find()) {
			eye.add(e.group(1));
		}
		while (m.find()) {
			mouth.add(m.group(1));
		}
		int N=Integer.valueOf(reader.readLine());
		for (int i = 0; i < N; i++) {
			String rs="";
			String line = reader.readLine();
			String[] split = line.split("\\s");
			try {
				for (int j = 0; j < 5; j++) {
					if (j==0||j==4) {
						rs+=hand.get(Integer.parseInt(split[j])-1);
						if (j==0) {
							rs+="(";
						}
					}
					else if (j==1||j==3) {
						rs+=eye.get(Integer.parseInt(split[j])-1);
						if (j==3) {
							rs+=")";
						}
					}else {
						rs+=mouth.get(Integer.parseInt(split[j])-1);
					}
				}
				System.out.println(rs);
			} catch (Exception e2) {
				System.out.println("Are you kidding me? @\\/@");
			}
		}
		reader.close();
	}
}
