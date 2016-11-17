package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution_1053 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line=reader.readLine().split("\\s");
		int N=Integer.parseInt(line[0]);
		float e=Float.parseFloat(line[1]);
		float D=Float.parseFloat(line[2]);
		int countkong=0;
		int countmay=0;
		for (int i = 0; i < N; i++) {
			String[] split = reader.readLine().split("\\s");
			int K=Integer.parseInt(split[0]);
			int tag=0;
			for (int j = 1; j < K; j++) {
				float use=Float.parseFloat(split[j]);
				if (use<e) tag++;
				if (tag>K/2) {
					if (K>D) {
						countkong++;
					}else {
						countmay++;
					}
					break;
				}
			}
		}
		reader.close();
		float may=(float)countmay/N*100;
		float kong=(float)countkong/N*100;
		System.out.print(String.format("%.1f",may));
		System.out.print("% ");
		System.out.print(String.format("%.1f",kong));
		System.out.println("%");
	}

}
