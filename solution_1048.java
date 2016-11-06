package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1048 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		reader.close();
		String[] split = line.split(" ");
		String A=split[0];
		String B=split[1];
		int count=1;
		String rString="";
		for (int i = A.length()-1,j=B.length()-1; i >=0||j>=0; i--,j--,count++) {
			int a = 0,b=0;
			if (i>=0) {
				a=A.charAt(i)-'0';
			}
			if (j>=0) {
				b=B.charAt(j)-'0';
			}
			String add="";
			if (count%2==1) {
				int val=(a+b)%13;
				if (val<10) {
					add=String.valueOf(val);
				}else{
					if (val==10) add="J";
					else if (val==11) add="Q";
					else add="K";
				}
			}else {
				int brs=b-a;
				if (brs>=0) add=String.valueOf(brs);
				else add=String.valueOf(brs+10);
			}
			rString=add+rString;
		}
		System.out.println(rString);
	}

}
