package patb_java;

import java.util.Scanner;

public class solution_1056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum=0;
		for (int i = 0; i < N; i++) {
			sum+=scanner.nextInt();
		}
		scanner.close();
		System.out.println(11*sum*(N-1));
	}

}
