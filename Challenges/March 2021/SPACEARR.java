//SPACEARR

/*
Finally, progress reached the Madoka family and she decided to play with her little sister in the sensational game Space Arrays.

The rules of the game are as follows:

Initially, a sequence a1,a2,…,aN is given.
The players alternate turns.
In each turn, the current player must choose an index i and increment ai, i.e. change ai to ai+1.
Afterwards, if there is no permutation p1,p2,…,pN of the integers 1 through N such that ai≤pi holds for each valid i, the current player loses.
Otherwise, the game continues with the next turn.
Madoka is asking you to help her ― tell her if the first player (the player that plays in the first turn) or second player wins this game if both play optimally.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers a1,a2,…,aN.
Output
For each test case, print a single line containing the string "First" if the first player wins or "Second" if the second player wins (without quotes).

Constraints
1≤T≤2⋅104
1≤N≤2⋅105
The sum of N over all test cases doesn't exceed 2⋅105
1≤ai≤N for each valid i
Subtasks
Subtask #1 (100 points): Original constraints

Example Input
4
4
1 2 3 3
4
1 1 3 3
5
1 2 2 1 5
3
2 2 3
Example Output
First
Second
Second
Second
Explanation
Example case 1:

If the first player increases the fourth element, the resulting sequence is (1,2,3,4). The second player loses after increasing any of the elements.
If the first player increases the second element, the resulting sequence is (1,3,3,3), and he loses because there is no valid permutation. For example if p=(2,1,4,3), the second element of a is greater than the second element of p.

*/

import java.util.*;
public class SPACEARR{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int count = 0, temp = 0;
            boolean flag = false;
            //if(a[n-1] <= n){
                for(int i = 1; i <= n; i++){
                    temp = i - a[i-1];
                    if(temp > 0) count += temp;
                    else if(temp < 0){
                        flag = true;
                        break;
                    }
                }
            //}else{
                
            //}

            if(flag || count % 2 == 0){
                answer.add("Second");
            }else{
                answer.add("First");
            }
 		}
		answer.forEach(System.out::println);
	}
}

