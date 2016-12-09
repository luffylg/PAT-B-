package patb;

import java.util.Arrays;
import java.util.Scanner;

public class solution_1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] origin=new int[length];
		int[] target=new int[length];
		for (int i = 0; i < length; i++) {
			origin[i]=scanner.nextInt();
		}
		for (int i = 0; i < length; i++) {
			target[i]=scanner.nextInt();
		}
		scanner.close();
		int index=0;
		String type="Insertion Sort";
		for (int i = 0; i < length-1; i++) {
			if (target[i]>target[i+1]) {
				index=i+1;
				break;
			}
		}
		for (int i = index; i < length; i++) {
			if (origin[i]!=target[i]) {
				type="Merge Sort";
				break;
			}
		}
		if (type.equals("Insertion Sort")) {
			int tmp=target[index];
			for (int i = index; i >0; i--) {
				if (target[i]<target[i-1]) {
					target[i]=target[i-1];
					target[i-1]=tmp;
				}
			}
		}else {
			index=index*2;
			for (int i = 0; i < length; i+=index) {
				Arrays.sort(target, i, Math.min(length, i+index));
			}
		}
		System.out.println(type);
		for (int i = 0; i < length-1; i++) {
			System.out.print(target[i]+" ");
		}
		System.out.println(target[length-1]);
	}

}
