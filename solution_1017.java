package patb_java;

import java.util.Scanner;

public class solution_1017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int va=in.nextInt();
		in.close();
		String shang=""+(s.charAt(0)-'0'<va?"":"1");
		int yu=(s.charAt(0)-'0')%va;;
		for (int i = 1; i < s.length(); i++) {
			int num=(s.charAt(i)-'0')+10*yu;
			shang+=String.valueOf(num/va);
			yu=num%va;
		}
		System.out.print((shang.equals("")?"0":shang)+" "+String.valueOf(yu));
	}

}
