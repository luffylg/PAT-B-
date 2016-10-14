package patb_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class solution_1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		int H=in.nextInt();
		ArrayList<person> list = new ArrayList<person>();
		while (N>0) {
			N--;
			int num=in.nextInt();
			int de=in.nextInt();
			int cai=in.nextInt();
			int dengji=0;
			if (de<L||cai<L) continue;
			if (de>=H&&cai>=H) {
				dengji=4;
			}else if(cai<H&&de>=H){
				dengji=3;
			}else if (de>=cai&&de<H) {
				dengji=2;
			}else {
				dengji=1;
			}
			list.add(new person(num, de, cai, dengji));
		}
		in.close();
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list.size());
		if (list.size()!=0) {
			for (person person : list) {
				System.out.println(String.valueOf(person.num)+" "+String.valueOf(person.de)+" "+String.valueOf(person.cai));
			}
		}
	}
	public static class person implements Comparable<person>{
		public person(int num, int de, int cai,int dengji) {
			this.num = num;
			this.de = de;
			this.cai = cai;
			this.dengji=dengji;
		}
		int num;
		int de;
		int cai;
		int dengji;
		@Override
		public int compareTo(person o) {
			// TODO Auto-generated method stub
			if (this.dengji==o.dengji) {
				if (this.cai+this.de!=o.cai+o.de) {
					return this.cai+this.de-o.cai-o.de;
				}else {
					if (this.de==o.de) {
						return o.num-this.num;
					}else {
						return this.de-o.de;
					}
				}
			}else {
				return this.dengji-o.dengji;
			}
			
		}
		
	}

}
