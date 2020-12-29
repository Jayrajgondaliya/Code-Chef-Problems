// Given an Integer N, write a program to reverse it.
//
// Input
// The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.
//
// Output
// For each test case, display the reverse of the given number N, in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ N ≤ 1000000
// Example
// Input
// 4
// 12345
// 31203
// 2123
// 2300
// Output
// 54321
// 30213
// 3212
// 32


import java.util.*;

public class FLOW007{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> inputs = new ArrayList<Integer>();
 		while(t-->0){
			inputs.add(sc.nextInt());
		}

		for(int i: inputs){
			int newNum = 0;
			while(i > 0){
				newNum = 10 * newNum + i % 10;
				i = i / 10; 
			}
			System.out.println(newNum);
		}
	}
}