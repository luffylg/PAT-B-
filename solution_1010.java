package patb_java;

import java.util.ArrayList;
import java.util.Scanner;

public class solution_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		String line=in.nextLine();
		in.close();
		String[] st = line.split("\\s+");
		for (int i = 0; i < st.length; i+=2) {
			int x = Integer.valueOf(st[i]);
			int n = Integer.valueOf(st[i+1]);
			int val=n*x;
			if (val!=0) {
				list.add(new Integer[]{val,n-1});
			}
		}
		if (list.isEmpty()) {
			System.out.println(0+" "+0);
			return;
		}
		System.out.print(list.get(0)[0]+" "+list.get(0)[1]);
		for (int i = 1; i < list.size(); i++) {
			Integer[] integers = list.get(i);
			System.out.print(" "+integers[0]+" "+integers[1]);
		}
	}

}
