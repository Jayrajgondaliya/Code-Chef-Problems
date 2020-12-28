// Write a program to find the remainder when an integer A is divided by an integer B.
//
// Input
// The first line contains an integer T, the total number of test cases. Then T lines follow, each line contains two Integers A and B.
//
// Output
// For each test case, find the remainder when A is divided by B, and display it in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ A,B ≤ 10000
//
// Example
//
// Input
// 3
// 1 2
// 100 200
// 40 15
//
// Output
// 1
// 100
// 10
		
import java.util.*;
import java.lang.*;

public class FLOW002{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b;
		List<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			a = sc.nextInt();
			b = sc.nextInt();
			if(b != 0) {
				answer.add(a % b);
			}else{
				answer.add(0);
			}
		}
		
		for(int i: answer){
			System.out.println(i);
		}
		
	}
}