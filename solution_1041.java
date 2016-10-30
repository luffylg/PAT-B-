package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class solution_1041 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.valueOf(reader.readLine());
		ArrayList<String[]> list = new ArrayList<String[]>();
		for (int i = 0; i < N; i++) {
			int[] ints=new int[3];
			String line = reader.readLine();
			String[] split = line.split(" ");
			list.add(split);
		}
		int M=Integer.valueOf(reader.readLine());
		String string = reader.readLine();
		String[] split = string.split(" ");
		for (int i = 0; i < split.length; i++) {
			String sj=split[i];
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j)[1].equals(sj)) {
					System.out.println(list.get(j)[0]+" "+list.get(j)[2]);
					break;
				}
			}
		}
		
		reader.close();
	}

}
