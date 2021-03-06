//ATTENDU
/*A semester in Chef's University has 120 working days. The University's requirement is that a student should be present for at least 75% of the working days in the semester. If not, the student is failed.

Chef has been taking a lot of holidays, and is now concerned whether he can pass the attendance requirement or not. N working days have already passed, and you are given N bits - B1, B2, …, BN. Bi = 0 denotes that Chef was absent on the ith day, and Bi = 1 denotes that Chef was present on that day.

Can Chef hope to pass the requirement by the end of the semester?

Input:
First line will contain T, the number of testcases. Then the testcases follow.
Each testcase contains two lines of input.
The first line of each testcase contains a single integer, N, the number of days till now.
The second line of each testcase contains a string B of length N where Bi represents the status of the ith day.
Output:
For each testcase, output the answer in a single line - "YES" if Chef can pass the attendance requirement and "NO" if not.

Constraints
1≤T≤10
1≤N≤120
0≤Bi≤1
Sample Input:
3
50
00000000000000000000000000000000000000000000000000
50
01010101010101010101010101010101010101010101010101
2
01
Sample Output:
NO
YES
YES
Explanation:
For Case 1, even if Chef attends all the remaining 70 days, he'll only have an attendance percentage of 70/120 = 58.33% which is less than 75%.

For Case 2, maximum attendance possible is 79.167% which is more than 75%.

For Case 3, maximum attendance possible is 99.167% which is more than 75%.


*/

import java.util.*;
public class ATTENDU{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
			int count = 0;
			sc.nextLine();
			for(char i : sc.nextLine().toCharArray()){
				if(Character.getNumericValue(i) == 0)count++;
			}
			if(count <= 30) answer.add("YES");
			else answer.add("NO");
		}
		answer.forEach(System.out::println);
	}
}
