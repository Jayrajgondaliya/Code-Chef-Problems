Y// ou're given an integer N. Write a program to calculate the sum of all the digits of N.
//
// Input
// The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.
//
// Output
// For each test case, calculate the sum of digits of N, and display it in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ N ≤ 1000000
// Example
// Input
// 3
// 12345
// 31203
// 2123
// Output
// 15
// 9
// 8


import java.util.*;

public class FLOW006{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		List<Integer> answer = new ArrayList<Integer>();
		String str;
		while(t-->0){
			str = sc.nextLine();
			int sum = 0;
			for(char i : str.toCharArray()){
				sum += Character.getNumericValue(i);
			}
			answer.add(sum);
		}
		
		for(int i: answer){
			System.out.println(i);
		}
	}
}