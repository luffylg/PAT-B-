package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class solution_1043 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		reader.close();
		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();
		linkedHashMap.put('P', 0);
		linkedHashMap.put('A', 0);
		linkedHashMap.put('T', 0);
		linkedHashMap.put('e', 0);
		linkedHashMap.put('s', 0);
		linkedHashMap.put('t', 0);
		int[] count=new int[6];
//		for (char ch : line.toCharArray()) {
//			if (ch=='P') {
//				count[0]++;
//			}else if (ch=='A') {
//				count[1]++;
//			}else if (ch=='T') {
//				count[2]++;
//			}else if (ch=='e') {
//				count[3]++;
//			}else if (ch=='s') {
//				count[4]++;
//			}else if (ch=='t') {
//				count[5]++;
//			}
//		}
		for (char ch : line.toCharArray()) {
			if (linkedHashMap.containsKey(ch)) {
				linkedHashMap.put(ch, linkedHashMap.get(ch)+1);
			}
		}
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		while (!linkedHashMap.isEmpty()) {
			
			hashMap.putAll(linkedHashMap);
//			hashMap=linkedHashMap;
			for (Entry<Character, Integer> i : hashMap.entrySet()) {
				if (i.getValue()>0) {
					System.out.print(i.getKey());
					linkedHashMap.put(i.getKey(), i.getValue()-1);
//					i.setValue(i.getValue()-1);
				}else {
					linkedHashMap.remove(i.getKey());
				}
			}
			hashMap.clear();
		}
	}

}
