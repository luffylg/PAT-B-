package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1060 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(reader.readLine());
		String[] split = reader.readLine().split("\\s");
		reader.close();
		int[] target=new int[N];
		for (int i = 0; i < split.length; i++) {
			target[i]=Integer.parseInt(split[i]);
		}
		Arrays.sort(target);
		int E=0;
		for (int i = target.length-Math.min(target.length, target[target.length-1]-1); i < target.length; i++) {
			if (target[i]>target.length-i) {
				E=target.length-i;
				break;
			}
		}
		System.out.println(E);
	}

}
