package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class solution_1058 {
	public static class question{
		public int score;
		public int nums;
		public int right;
		public String[] select;
		public question(int score, int nums, int right, String[] select) {
			super();
			this.score = score;
			this.nums = nums;
			this.right = right;
			this.select = select;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] split = reader.readLine().split("\\s");
		int N=Integer.parseInt(split[0]);
		int M=Integer.parseInt(split[1]);
		question[] ques=new question[M];
		for (int i = 0; i < M; i++) {
			String[] split2 = reader.readLine().split("\\s");
			String[] sl=new String[Integer.parseInt(split2[2])];
			for (int j = 0; j < sl.length; j++) {
				sl[j]=split2[3+j];
			}
			ques[i]=new question(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]), Integer.parseInt(split2[2]), sl);
		}
		int[] wrong_count=new int[M];
		for (int i = 0; i < N; i++) {
			String line = reader.readLine();
			String pattern="\\((.*?)\\)";
			Pattern rPattern=Pattern.compile(pattern);
			Matcher matcher=rPattern.matcher(line);
			int position=0;
			int finalscore=0;
			while (matcher.find()) {
				String[] split3 = matcher.group(1).split("\\s");
				if (is_right(split3,ques[position])) {
					finalscore+=ques[position].score;
				}else {
					wrong_count[position]++;
				}
				position++;
			}
			System.out.println(finalscore);
		}
		reader.close();
		int max=0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = wrong_count.length-1; i >=0; i--) {
			int count=wrong_count[i];
			if (count>max) {
				max=count;
				stack.clear();
				stack.push(i+1);
			}else if (count!=0&&count==max) {
				stack.push(i+1);
			}
		}
		if (max==0) {
			System.out.println("Too simple");
		}else{
			int first=stack.pop();
			System.out.print(wrong_count[first-1]+" "+first);
			while (!stack.isEmpty()) {
				System.out.print(" "+stack.pop());
			}
		}
	}

	private static boolean is_right(String[] split3, question question) {
		// TODO Auto-generated method stub
		if (Integer.parseInt(split3[0])!=question.select.length) {
			return false;
		}else{
			for (int j = 1; j < split3.length; j++) {
				if (!split3[j].equals(question.select[j-1])) {
					return false;
				}
			}
		}
		return true;
	}

}
