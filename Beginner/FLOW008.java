// Write a program, which takes an integer N and if the number is less than 10 then display "Thanks for helping Chef!" otherwise print "-1".
//
// Input
// The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
//
// Output
// For each test case, output the given string or -1 depending on conditions, in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// -20 ≤ N ≤ 20
// Example
// Input
// 3
// 1
// 12
// -5
// Output
// Thanks for helping Chef!
// -1
// Thanks for helping Chef!


import java.util.*;

public class FLOW008{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b;
		List<Integer> inputs = new ArrayList<Integer>();
		while(t-->0){
			inputs.add(sc.nextInt());
		}
		
		for(int i: inputs){
			if(i < 10) System.out.println("Thanks for helping Chef!");
			else System.out.println(-1);
		}
	}
}