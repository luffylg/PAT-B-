package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1024 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		reader.close();
		char zhengfu=line.charAt(0);
		System.out.print(zhengfu=='-'?zhengfu:"");
		char zhengshu=line.charAt(1);
		String xiaoshu="";
		for (int i = 3; i < line.length(); i++) {
			char c=line.charAt(i);
			if (c=='E') {
				break;
			}
			xiaoshu+=c;
		}
		int xiaoshul=xiaoshu.length();
		char chengchu=line.charAt(xiaoshul+4);
		String mici="";
		for (int i = xiaoshul+5; i < line.length(); i++) {
			char c=line.charAt(i);
			mici+=c;
		}
		int mi=Integer.valueOf(mici);
		if (mi==0) {
			System.out.println(zhengshu+'.'+xiaoshu);
		}else if (chengchu=='+') {
			System.out.print(zhengshu);
			if (mi>=xiaoshul) {
				System.out.print(xiaoshu);
				for (int i = 0; i < mi-xiaoshul; i++) {
					System.out.print('0');
				}
			}else {
				for (int i = 0; i < xiaoshul; i++) {
					char c=xiaoshu.charAt(i);
					System.out.print(c);
					if (i==mi-1) {
						System.out.print('.');
					}
				}
			}
		}else {
			System.out.print("0.");
			for (int i = 0; i < mi-1; i++) {
				System.out.print('0');
			}
			System.out.print(zhengshu+xiaoshu);
		}
	}
}
