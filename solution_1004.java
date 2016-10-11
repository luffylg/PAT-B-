package patb_java;

import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class solution_1004 {
	public static class Student implements Comparable<Student>{
		public Student(String name, String xuehao, int grade) {
			this.name = name;
			this.xuehao = xuehao;
			this.grade = grade;
		}
		String name;
		String xuehao;
		int grade;
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.grade>o.grade?1:-1;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		in.nextLine();
		ArrayList<Student> list = new ArrayList<Student>();
		while(len-->0){
			list.add(new Student(in.next(), in.next(), in.nextInt()));
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1).name+" "+list.get(list.size()-1).xuehao);
		System.out.println(list.get(0).name+" "+list.get(0).xuehao);
	}
}
