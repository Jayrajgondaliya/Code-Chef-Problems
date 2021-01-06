/*
Chef has a sequence A1,A2,…,AN. This sequence has exactly 2N subsequences. Chef considers a subsequence of A interesting if its size is exactly K and the sum of all its elements is minimum possible, i.e. there is no subsequence with size K which has a smaller sum.

Help Chef find the number of interesting subsequences of the sequence A.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer ― the number of interesting subsequences.

Constraints
1≤T≤10
1≤K≤N≤50
1≤Ai≤100 for each valid i
Subtasks
Subtask #1 (30 points): 1≤N≤20
Subtask #2 (70 points): original constraints

Example Input
1
4 2
1 2 3 4
Example Output
1
Explanation
Example case 1: There are six subsequences with length 2: (1,2), (1,3), (1,4), (2,3), (2,4) and (3,4). The minimum sum is 3 and the only subsequence with this sum is (1,2).


*/
import java.util.*;
public class CHEFINSQ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			int countOfMaxelem = 0, countInSubStr = 0;
			int maxElem = list.get(k - 1);

			for (int i = 0; i < n; i++) {
				if (list.get(i) == maxElem) {
					if(i < k) countInSubStr++;
					countOfMaxelem++;
				}else if(list.get(i) > maxElem){
					break;
				}
			}
			answer.add(nCr(countOfMaxelem, countInSubStr));
		}
		answer.forEach(System.out::println);
	}

	static long nCr(int n, int r) {
		long result = 1;
		for (int i = 0; i < r; i++) {
			result = result * (n - i) / (i + 1);
		}
		return result;
	}
	
}