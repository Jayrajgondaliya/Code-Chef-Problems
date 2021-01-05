/*

Tweedle-Dee and Tweedle-Dum are in a fierce battle playing even-odd nim. This novel game is played on N heaps. Heap i contains ai stones.

Like normal nim, Tweedle-Dee and Tweedle-Dum alternate taking a positive number of stones from any single one of the heaps, and the player that can't remove stones loses. However Tweedle-Dee can only take an even number of stones, and Tweedle-Dum can only take an odd number of stones.

Alice doesn't want to wait until the end of the game, so she asks you to determine the winner of the game. Remember that Tweedle-Dee and Tweedle-Dum are legendary grandmasters of combinatorial games, so they always play optimally.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each case consists of an integer N the number of heaps, and a string P the player that starts the game. String P is equal to "Dee" if Tweedle-Dee goes first, or "Dum" if Tweedle-Dum goes first.

The second line of each case contains N space separated integers ai the number of stones of the i-th heap.

Output
For each test case, output a single line containing either "Dee" if Twedle-Dee winns the game or "Dum" otherwise.

Constraints
1 ≤ T ≤ 50
1 ≤ N ≤ 50
1 ≤ ai ≤ 50
Example
Input:
1
2 Dee
2 2

Output:
Dum
Explanation
Tweedle-Dee takes two stones from any of the heaps leaving just one non empty heap, next Tweedle-Dum takes one stone and the game finishes.


*/

import java.util.*;
import java.util.stream.*;
public class TWEED{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			ArrayList<String> answer = new ArrayList<String>();
			while(t-->0){
				int n = sc.nextInt();
				String player = sc.next();
				int[] a = new int[n];
				for (int i = 0; i < a.length; i++) {
					a[i] = sc.nextInt();
				}
				if(player.equals("Dee") && a.length == 1 && a[0] % 2 == 0){
					answer.add("Dee");
				}else{
					answer.add("Dum");
				}
			}
			answer.forEach(System.out::println);
	}
}