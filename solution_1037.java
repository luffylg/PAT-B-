package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1037 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line=reader.readLine();
		String[] split = line.split(" ");
		String[] P=split[0].split("\\.");
		String[] A=split[1].split("\\.");
		long val=toKnut(A)-toKnut(P);
		if (val<0) {
			System.out.print("-");
			long[] array = toArray(-val);
			System.out.print(array[0]+"."+array[1]+"."+array[2]);
		}else {
			long[] array = toArray(val);
			System.out.print(array[0]+"."+array[1]+"."+array[2]);
		}
	}
	public static long toKnut(String[] p){
		long knut=0;
		knut+=Integer.valueOf(p[0])*17;
		knut+=Integer.valueOf(p[1]);
		knut*=29;
		knut+=Integer.valueOf(p[2]);
		return knut;
	}
	public static long[] toArray(long knut){
		long[] O=new long[3];
		O[2]=knut%29;
		knut/=29;
		O[1]=knut%17;
		O[0]=knut/17;
		return O;
	}
}
