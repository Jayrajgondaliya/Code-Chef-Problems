//EXUNA

/*

You are given an array A of N positive and pairwise distinct integers. You can permute the elements in any way you want.

The cost of an ordering (A1,A2,…,AN) is defined as (((A1modA2)modA3)......)modAN where XmodY means the remainder when X is divided by Y. You need to find the maximum cost which can be attained through any possible ordering of the elements.

Input:
The first line contains T denoting the number of test cases.
The first line of each testcase contains a single integer N.
The second line of each testcase contains N space-separated integers, the elements of A.
Output:
For each testcase, output the maximum possible cost in a new line.
Constraints
1≤T≤5∗105
2≤N≤5∗105
1≤Ai≤109
Sum of N over all testcases is less than or equal to 106
All elements in a single testcase are distinct.
Subtasks
100 points : Original constraints.
Sample Input:
1
2
7 12
Sample Output:
7
Explanation:
The two possible ways to order the elements are [7, 12] and [12, 7]. In the first case, the cost is 7mod12=7 and in the second case the cost is 12mod7=5. Clearly the answer is 7.


*/

import java.util.*;
public class EXUNA{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int temp = 0;
            for(int i = 0; i < n; i++){
                temp = sc.nextInt();
                if(temp < min){
                    min = temp;
                }
            }
            answer.add(min);
		}
		answer.forEach(System.out::println);
	}
}
