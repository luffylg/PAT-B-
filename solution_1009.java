package patb_java;

import java.util.Scanner;

public class solution_1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String line=in.nextLine();
		in.close();
		String[] split = line.split(" ");
		//以多个空格分隔line.split("\\s+")
		System.out.print(split[split.length-1]);
		for (int i = split.length-2; i >=0; i--) {
			System.out.print(" "+split[i]);
		}
	}

}
