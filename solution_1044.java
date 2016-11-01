package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1044 {
	private static String[] marslow=new String[]{"tret","jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
	private static String[] marshigh=new String[]{"tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(reader.readLine());
		for (int i = 0; i < N; i++) {
			String line = reader.readLine();
			int first=line.charAt(0)-'0';
			if (first>=0&&first<=9) {
				EarthtoMars(line);
			}else {
				MarstoEarth(line);
			}
		}
		reader.close();
	}

	private static void MarstoEarth(String line) {
		String[] split = line.split(" ");
		int earth=0;
		if (split.length==1) {
			if (searcharray(marslow, split[0])==-1) {
				earth=searcharray(marshigh, split[0])*13+13;
			}else {
				earth=searcharray(marslow, split[0]);
			}
		}else {
			earth=searcharray(marshigh, split[0])*13+searcharray(marslow, split[1])+13;
		}
		System.out.println(earth);
	}
	
	private static void EarthtoMars(String line) {
		int earth=Integer.valueOf(line);
		String mars="";
		if (earth<13) {
			mars=marslow[earth];
		}else if (earth%13==0) {
			mars=marshigh[earth/13-1];
		}else {
			mars=" "+marslow[earth%13];
			mars=marshigh[earth/13-1]+mars;
		}
		System.out.println(mars);
	}
	private static int searcharray(String[] arr,String s){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

}
