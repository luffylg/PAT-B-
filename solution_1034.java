package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1034 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] split = reader.readLine().split("[\\s/]");
		long a1=Integer.parseInt(split[0]);
		long b1=Integer.parseInt(split[1]);
		long a2=Integer.parseInt(split[2]);
		long b2=Integer.parseInt(split[3]);
		add(a1,b1,a2,b2);
		minus(a1,b1,a2,b2);
		multiply(a1,b1,a2,b2);
		divide(a1,b1,a2,b2);
		reader.close();
	}

	private static void divide(long a1, long b1, long a2, long b2) {
		// TODO Auto-generated method stub
		pt(a1, b1);
		System.out.print(" / ");
		pt(a2, b2);
		System.out.print(" = ");	
		pt(a1*b2, b1*a2);
		System.out.println();
	}

	private static void multiply(long a1, long b1, long a2, long b2) {
		// TODO Auto-generated method stub
		pt(a1, b1);
		System.out.print(" * ");
		pt(a2, b2);
		System.out.print(" = ");	
		pt(a1*a2, b1*b2);
		System.out.println();
	}

	private static void minus(long a1, long b1, long a2, long b2) {
		// TODO Auto-generated method stub
		pt(a1, b1);
		System.out.print(" - ");
		pt(a2, b2);
		System.out.print(" = ");	
		pt(a1*b2-b1*a2, b1*b2);
		System.out.println();
	}

	private static void add(long a1, long b1, long a2, long b2) {
		// TODO Auto-generated method stub
		pt(a1, b1);
		System.out.print(" + ");
		pt(a2, b2);
		System.out.print(" = ");	
		pt(a1*b2+b1*a2, b1*b2);
		System.out.println();
	}

	private static void pt(long a1, long b1) {
		// TODO Auto-generated method stub
		if (b1==0) {
			System.out.print("Inf");
		}else if (a1==0) {
			System.out.print(0);
		}else if (!same(a1,b1)) {
			System.out.print("(-");
			simple(Math.abs(a1),Math.abs(b1));
			System.out.print(")");
		}else {
			simple(Math.abs(a1),Math.abs(b1));
		}
	}

	private static boolean same(long a1, long b1) {
		// TODO Auto-generated method stub
		if (a1>0&&b1>0||a1<0&&b1<0) {
			return true;
		}
		return false;
	}

	private static void simple(long l, long m) {
		// TODO Auto-generated method stub
		if (l%m==0) {
			System.out.print(l/m);
		}else {
			if (l>m) {
				System.out.print(l/m);
				System.out.print(" ");
				l=l%m;
			}
			while (l%2==0 && m%2==0) {
				l/=2;
				m/=2;
			}
			long common=3;
			while (l>=common) {
				if (l%common==0 && m%common==0) {
					l/=common;
					m/=common;
					continue;
				}
				common+=2;
				if (common>Math.sqrt(l)&&common<l) {
					common=l;
					continue;
				}
			}
			System.out.print(l);
			System.out.print("/");
			System.out.print(m);
		}
			
	}

}
