package patb_java;

import java.util.Scanner;

public class solution_1001 {

	public static int solve(int n){
        int count=0;
        while(n!=1){
          if (n%2==0){
            n/=2;
          }
          else {
            n=(3*n+1)/2;
          }
          count++;
        }
        return count;
      }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    in.close();
    System.out.println(solve(number));
  }

}
