/*

Given an array A of size N , check if there exist any pair of index i,j such that Ai=Aj and i≠j
Input
The first line of the input contains a single integer T denoting the number of test cases.
The first line of each test case contains integer N.
The second line of each test case contains N space separated integers Ai.
Output
For each test case, print a single line containing answer "Yes" or "No" (without quotes).

Constraints
1≤T≤100
2≤N≤105
1≤Ai≤109
Sum of N over all test cases doesn't exceed 106
Subtasks
Subtask #1 (30 points):

2≤N≤100
Subtask #2 (70 points): original constraints

Example Input
2
4
1 2 1 3
5
5 4 1 2 3
Example Output
Yes
No
Explanation
Example case 1: A1 and A3 both have value 1.

Example case 2: All values are pairwise distinct.


*/

import java.util.*;
public class CEQUAL{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			TreeSet<Integer> element = new TreeSet<Integer>();
			int n = sc.nextInt();
			int elem;
			boolean flag = false;
			while(n-->0){
				elem = sc.nextInt();
				if(element.contains(elem)){
					flag = true;
				}else{
					element.add(elem);
				}
			}
			if(flag)
				answer.add("Yes");
			else
				answer.add("No");
		}
		answer.forEach(System.out::println);
	}
}