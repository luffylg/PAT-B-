package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class solution_1059 {
	public static class Student{
		public int rank;
		public boolean ischecked;
		public Student(int rank, boolean ischecked) {
			super();
			this.rank = rank;
			this.ischecked = ischecked;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(reader.readLine());
		HashMap<String, Student> map = new HashMap<String,Student>();
		for (int i = 1; i <= N; i++) {
			map.put(reader.readLine(), new Student(i, false));
		}
		int M=Integer.parseInt(reader.readLine());
		for (int i = 0; i < M; i++) {
			String key=reader.readLine();
			if (!map.containsKey(key)) {
				System.out.println(key+": Are you kidding?");
			}else if (map.get(key).ischecked) {
				System.out.println(key+": Checked");
			}else {
				Student student=map.get(key);
				student.ischecked=true;
				if (student.rank==1) {
					System.out.println(key+": Mystery Award");
				}else if (issu(student.rank)) {
					System.out.println(key+": Minion");
				}else {
					System.out.println(key+": Chocolate");
				}
			}
		}
		reader.close();
	}

	private static boolean issu(int rank) {
		// TODO Auto-generated method stub
		if (rank==2) return true;
		if (rank%2==0) return false;
		int sqrt = (int)Math.floor(Math.sqrt(rank));
		for (int i = 3; i <= sqrt; i+=2) {
			if (rank%i==0) return false;
		}
		return true;
	}

}
