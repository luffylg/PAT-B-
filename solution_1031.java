package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1031 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.valueOf(reader.readLine());
		char[] check=new char[]{'1','0','X','9','8','7','6','5','4','3','2'};
		int[] quan =new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		int count=0;
		for (int i = 0; i < rows; i++) {
			String id=reader.readLine();
			int sum=0;
			boolean flag=false;
			for (int j = 0; j < 17; j++) {
				if (id.charAt(j)<'0'||id.charAt(j)>'9') {
					flag=true;
					break;
				}else {
					sum+=(id.charAt(j)-'0')*quan[j];
				}
				
			}
			if (check[sum%11]!=id.charAt(17)||flag) {
				System.out.println(id);
				count++;
			}
		}
		reader.close();
		if (count==0) {
			System.out.println("All passed");
		}
	}

}
