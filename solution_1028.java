package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1028 {
	public static int cp(String b1,String b2){
		String[] split1 = b1.split("/");
		String[] split2 = b2.split("/");
		if (Integer.valueOf(split1[0])-Integer.valueOf(split2[0])!=0) {
			return Integer.valueOf(split2[0])-Integer.valueOf(split1[0]);
		}
		if (Integer.valueOf(split1[1])-Integer.valueOf(split2[1])!=0) {
			return Integer.valueOf(split2[1])-Integer.valueOf(split1[1]);
		}
		return Integer.valueOf(split2[2])-Integer.valueOf(split1[2]);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum=Integer.valueOf(reader.readLine());
		int count=0;
		String young="2014/09/06";
		String old="1814/09/06";
		String lao="2014/09/06";
		String nianq="1814/09/06";
		String laoname="";
		String xiaoname="";
		for (int i = 0; i < sum; i++) {
			String[] split=reader.readLine().split(" ");
			String name=split[0];
			String birthday=split[1];
			if (cp(birthday, young)>=0&&cp(birthday, old)<=0) {
				count++;
				if (cp(birthday, lao)>0) {
					lao=birthday;
					laoname=name;
				}
				if (cp(birthday, nianq)<0) {
					nianq=birthday;
					xiaoname=name;
				}
			}
			
		}
		reader.close();
		if (count==0) {
			System.out.println(0);
		}else {
			System.out.println(count+" "+laoname+" "+xiaoname);		
		}
	}
}
