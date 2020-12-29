// If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.
//
// Input
// The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.
//
// Output
// For each test case, display the sum of first and last digits of N in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ N ≤ 1000000
// Example
// Input
// 3
// 1234
// 124894
// 242323
//
// Output
// 5
// 5
// 5



import java.util.*;

public class FLOW004{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			String input = sc.nextLine();
			char[] charArr = input.toCharArray();
			answer.add(Character.getNumericValue(charArr[0]) + Character.getNumericValue(charArr[charArr.length - 1]));
		}
		for(int i : answer){
			System.out.println(i);
		}
	}
}