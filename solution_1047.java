package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class solution_1047 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(reader.readLine());
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for (int i = 0; i < N; i++) {
			String line=reader.readLine();
			String[] split = line.split(" ");
			String team=split[0].split("-")[0];
			int score=Integer.valueOf(split[1]);
			if (map.containsKey(team)) {
				map.put(team, map.get(team)+score);
			}else{
				map.put(team, score);
			}
		}
		reader.close();
		String winner="";
		int max=0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue()>max) {
				max=entry.getValue();
				winner=entry.getKey();
			}
		}
		System.out.println(winner+" "+max);
	}

}
