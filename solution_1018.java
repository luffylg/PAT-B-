package patb_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution_1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		HashMap<String, Integer> mapjia = new HashMap<>();
		mapjia.put("C", 0);
		mapjia.put("J", 0);
		mapjia.put("B", 0);
		HashMap<String, Integer> mapyi = new HashMap<>();
		mapyi.put("C", 0);
		mapyi.put("J", 0);
		mapyi.put("B", 0);
		int win=0;
		int ping=0;
		for (int i = 0; i < num; i++) {
			String jia = in.next();
			String yi = in.next();
			if (jia.equals(yi)) ping++;
			else if ((jia.equals("C")&&yi.equals("J"))||(jia.equals("J")&&yi.equals("B"))||(jia.equals("B")&&yi.equals("C"))) {
				win++;
				mapjia.put(jia, mapjia.get(jia)+1);
			}else {
				mapyi.put(yi, mapyi.get(yi)+1);
			}
		}
		System.out.println(win+" "+ping+" "+String.valueOf(num-win-ping));
		System.out.println(String.valueOf(num-win-ping)+" "+ping+" "+win);
		int max=0;
		String zhi="B";
		for (Map.Entry<String, Integer> entry : mapjia.entrySet()) {
			if (entry.getValue()>max) {
				max=entry.getValue();
				zhi=entry.getKey();
			}else if (entry.getValue()==max) {
				zhi=zhi.charAt(0)-entry.getKey().charAt(0)<=0?zhi:entry.getKey();
			}
		}
		System.out.print(zhi+" ");
		max=0;
		for (Map.Entry<String, Integer> entry : mapyi.entrySet()) {
			if (entry.getValue()>max) {
				max=entry.getValue();
				zhi=entry.getKey();
			}else if (entry.getValue()==max) {
				zhi=zhi.charAt(0)-entry.getKey().charAt(0)<=0?zhi:entry.getKey();
			}
		}
		System.out.print(zhi);
	}
}
