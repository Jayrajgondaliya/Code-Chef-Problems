//PLMU


/*
Chef has a sequence A1,A2,…,AN. He needs to find the number of pairs (i,j) (1≤i<j≤N) such that Ai+Aj=Ai⋅Aj. However, he is busy, so he asks for your help.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer ― the desired number of pairs.

Constraints
1≤T≤20
1≤N≤40,000
0≤Ai≤109 for each valid i
Subtasks
Subtask #1 (30 points): 1≤N≤500
Subtask #2 (70 points): original constraints

Example Input
2
3
2 4 2
3
0 2 3
Example Output
1
0
Explanation
Example case 1: The only valid pair is (1,3).

Example case 2: We can see that no valid pair exists.
*/


import java.util.*;
public class PLMU{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			int n = sc.nextInt();
            int countOf2 = 0, countOfZero = 0;
            int temp = 0;
            for(int i = 0; i < n; i++){
                temp = sc.nextInt();
                if(temp == 2) countOf2++;
                if(temp == 0) countOfZero++;
            }

            answer.add(((countOf2 * (countOf2 - 1)) / 2) + ((countOfZero * (countOfZero - 1)) / 2));
		}
		answer.forEach(System.out::println);
	}
}
