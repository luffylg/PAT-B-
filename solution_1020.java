package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solution_1020 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] split = line.split(" ");
		int n=Integer.valueOf(split[0]);
		int d=Integer.valueOf(split[1]);
		String[] nums=br.readLine().split(" ");
		String[] sales=br.readLine().split(" ");
		br.close();
		mooncake[] cakes=new mooncake[n];
		for (int i = 0; i < cakes.length; i++) {
			cakes[i]=new mooncake(Float.valueOf(nums[i]), Float.valueOf(sales[i]));
		}
		Arrays.sort(cakes);
		float sum=0;
		for (int i = cakes.length-1; i >=0 ; i--) {
			mooncake mooncake = cakes[i];
			if (d<=mooncake.num) {
				sum+=mooncake.price*d;
				break;
			}else {
				sum+=mooncake.sales;
				d-=mooncake.num;
			}
		}
		System.out.println(String.format("%.2f", sum));
		
	}
	public static class mooncake implements Comparable<mooncake>{
		public float num;
		public float sales;
		public float price;
		public mooncake(float num, float sales) {
			this.num = num;
			this.sales = sales;
			this.price=sales/num;
		}
		@Override
		public int compareTo(mooncake o) {
			// TODO Auto-generated method stub
			return this.price>o.price?1:-1;
		}
		
	}

}
