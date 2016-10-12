package patb_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class solution_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		while (in.hasNextInt()) {
			int x = in.nextInt();
			int n = in.nextInt();
			int val=n*x;
			if (val!=0) {
				list.add(new Integer[]{val,x-1});
			}
		}
		in.close();
		System.out.println(list.get(0)[0]+" "+list.get(0)[1]);
		for (int i = 1; i < list.size(); i++) {
			Integer[] integers = list.get(i);
			System.out.println(" "+integers[0]+" "+integers[1]);
		}
	}

}
