//MAGICHF

/*
When Chef was visiting a fair in Byteland, he met a magician. The magician had N boxes (numbered 1 through N) and a gold coin. He challenged Chef to play a game with him; if Chef won the game, he could have the coin, but if he lost, the magician would kidnap Chef.

At the beginning of the game, the magician places the gold coin into the X-th box. Then, he performs S swaps. To win, Chef needs to correctly identify the position of the coin after all swaps.

In each swap, the magician chooses two boxes A and B, moves the contents of box A (before the swap) to box B and the contents of box B (before the swap) to box A.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains three space-separated integers N, X and S.
S lines follow. Each of these lines contains two space-separated integers A and B denoting a pair of swapped boxes.
Output
For each test case, print a single line containing one integer — the number of the box containing the gold coin after all swaps are performed.

Constraints
1≤T≤100
2≤N≤105
1≤S≤104
1≤X,A,B≤N
A≠B
the sum of S for all test cases does not exceed 2∗105
Subtasks
Subtask #1 (100 points): original constraints

Example Input
1
5 2 4
4 2
3 4
3 2
1 2
Example Output
1
Explanation
Example case 1:

after the first swap, the coin is in box 4
after the second swap, the coin is in box 3
after the third swap, the coin is in box 2
after the fourth swap, the coin is in box 1

*/

import java.util.*;
public class MAGICHF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();
            int currentPosition = x;
            int s1, s2;
            for(int i = 0; i < s; i++){
                s1 = sc.nextInt();
                s2 = sc.nextInt();
                if(s1 == currentPosition){
                    currentPosition = s2;
                }else if(s2 == currentPosition){
                    currentPosition = s1;
                }
            }
            answer.add(currentPosition);
		}
		answer.forEach(System.out::println);
	}
}

