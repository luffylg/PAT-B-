package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class solution_1059 {
	public static class Student{
		public int rank;
		public boolean ischecked;
		public boolean issu;
		public Student(int rank, boolean ischecked, boolean issu) {
			this.rank = rank;
			this.ischecked = ischecked;
			this.issu = issu;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(reader.readLine());
		HashMap<String, Student> map = new HashMap<String,Student>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			boolean su=issushu(i,list);
			if (su) {
				list.add(i);
			}
			map.put(reader.readLine(), new Student(i, false,su));
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
				}else if (student.issu) {
					System.out.println(key+": Minion");
				}else {
					System.out.println(key+": Chocolate");
				}
			}
		}
		reader.close();
	}
	private static boolean issushu(int rank, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		if (rank==1) return false;
		int sqrt = (int)Math.floor(Math.sqrt(rank));
		for (int i:list) {
			if (i>sqrt) {
				break;
			}
		    if (rank%i==0) return false;
		}
		return true;
	}

}
