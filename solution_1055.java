package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class solution_1055 {
	public static class Person implements Comparable<Person>{
		private String name;
		private int height;
		public Person(String name, int height) {
			this.name = name;
			this.height = height;
		}
		public int compareTo(Person p) {
			// TODO Auto-generated method stub
			if (p.height!=this.height) {
				return p.height-this.height;
			}
			return this.name.compareTo(p.name);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] split = reader.readLine().split("\\s");
		int N=Integer.parseInt(split[0]);
		int K=Integer.parseInt(split[1]);
		Queue<List<Person>> stack = new LinkedList<List<Person>>();
		ArrayList<Person> list = new ArrayList<Person>();
		for (int i = 0; i < N; i++) {
			String[] split2 = reader.readLine().split("\\s");
			list.add(new Person(split2[0], Integer.parseInt(split2[1])));
			Collections.sort(list);
		}
		int start=0,end=0;
		for (int j = 0; j < K; j++) {
			start=end;
			int length=N/K;
			if (j==0) {
				length=N-(length)*(K-1);
			}
			end=start+length;
			List<Person> list2 = list.subList(start, end);
			stack.offer(list2);
		}
		reader.close();
		while (!stack.isEmpty()) {
			out(stack.poll());
		}
		
	}

	private static void out(List<Person> list) {
		// TODO Auto-generated method stub
		Person[] persons=new Person[list.size()];
		int middle=list.size()/2;
		persons[middle]=list.get(0);
		try {
			int i=1;
			while (true) {
				persons[middle-i]=list.get(i*2-1);
				persons[middle+i]=list.get(i*2);
				i++;
			}
		} catch (Exception e) {
			for (int i = 0; i < persons.length; i++) {
				if (i==0) {
					System.out.print(persons[i].name);
				}else{
					System.out.print(" "+persons[i].name);
				}
			}
			System.out.println();
		}
	}

	

}
