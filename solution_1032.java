package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class solution_1032 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int row=Integer.valueOf(reader.readLine());
		String r="";
		int max=0;
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < row; i++) {
			String read=reader.readLine();
			String[] split=read.split(" ");
			String key=split[0];
			int value=Integer.valueOf(split[1]);
			if (hashMap.containsKey(key)) {
				hashMap.put(key, hashMap.get(key)+value);
			}else {
				hashMap.put(key, value);
			}
		}
		reader.close();
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue()>max) {
				max=entry.getValue();
				r=entry.getKey();
			}
		}
		System.out.println(r+" "+max);
	}

}
