//MATCHES
/*

Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.

The first thing Chefu wanted to do was to calculate the result of his homework — the sum of A and B, and write it using matches. Help Chefu and tell him the number of matches needed to write the result.

Digits are formed using matches in the following way: 

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers A and B.
Output
For each test case, print a single line containing one integer — the number of matches needed to write the result (A+B).

Constraints
1≤T≤1,000
1≤A,B≤106
Example Input
3
123 234
10101 1010
4 4
Example Output
13
10
7
Explanation
Example case 1: The result is 357. We need 5 matches to write the digit 3, 5 matches to write the digit 5 and 3 matches to write the digit 7.

Example case 2: The result is 11111. We need 2 matches to write each digit 1, which is 2⋅5=10 matches in total.
*/


import java.util.*;
public class MATCHES
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Map<Integer, Integer> data = new HashMap<Integer, Integer>(){{
			put(0, 6);
			put(1, 2);
			put(2, 5);
			put(3, 5);
			put(4, 4);
			put(5, 5);
			put(6, 6);
			put(7, 3);
			put(8, 7);
			put(9, 6);
		}};
		while(t-->0){
			int count = sc.nextInt() + sc.nextInt();
			int noOfMatches = 0;
			while(count != 0){
				noOfMatches += data.get(count % 10);
				count = count / 10; 
			}
			answer.add(noOfMatches);
		}
		answer.forEach(System.out::println);
	}
}