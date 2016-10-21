package patb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class solution_1028 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum=Integer.valueOf(reader.readLine());
		ArrayList<person> list = new ArrayList<person>();
		person young=new person("", "2014/09/06");
		person old=new person("", "1814/09/06");
		for (int i = 0; i < sum; i++) {
			String[] split=reader.readLine().split(" ");
			person p=new person(split[0], split[1]);
			if (p.compareTo(young)>=0&&p.compareTo(old)<=0) {
				list.add(p);
			}
			
		}
		reader.close();
		Collections.sort(list);
		System.out.println(list.size()+" "+list.get(list.size()-1).name+" "+list.get(0).name);
	}
	private static class person implements Comparable<person>{
		String name;
		String birthday;
		public person(String name, String birthday) {
			this.name = name;
			this.birthday = birthday;
		}
		@Override
		public int compareTo(person o) {
			// TODO Auto-generated method stub
			String[] split1 = this.birthday.split("/");
			String[] split2 = o.birthday.split("/");
			if (Integer.valueOf(split1[0])-Integer.valueOf(split2[0])!=0) {
				return Integer.valueOf(split2[0])-Integer.valueOf(split1[0]);
			}
			if (Integer.valueOf(split1[1])-Integer.valueOf(split2[1])!=0) {
				return Integer.valueOf(split2[1])-Integer.valueOf(split1[1]);
			}
			return Integer.valueOf(split2[2])-Integer.valueOf(split1[2]);
		}
		
		
	}

}
