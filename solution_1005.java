package patb_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class solution_1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
//		in.nextLine();
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (len-->0) {
			int val=in.nextInt();
			if (set.contains(val)||val<=1) continue;
			set.addAll(nums(val));
			list.add(val);
		}
		in.close();
		for (int i = 0; i < list.size(); i++) {
			if (set.contains(list.get(i))) list.remove(i--);
		}
		for (Integer i : list) if (set.contains(i)) list.remove(i);
		Collections.sort(list,Collections.reverseOrder());
		System.out.print(list.get(0));
		for (int i = 1; i < list.size(); i++) System.out.print(" "+list.get(i));
	}

	private static HashSet<? extends Integer> nums(int val) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		while (val>1) {
			if (val%2==0) {
				val/=2;
				if (val!=1) set.add(val);
			}else {
				val=(3*val+1)/2;
				if (val!=1) set.add(val);
			}
		}
		return set;
	}

}
