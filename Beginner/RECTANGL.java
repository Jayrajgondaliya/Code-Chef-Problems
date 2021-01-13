//RECTANGL
/*
You are given four integers a, b, c and d. Determine if there's a rectangle such that the lengths of its sides are a, b, c and d (in any order).

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains four space-separated integers a, b, c and d.
Output
For each test case, print a single line containing one string "YES" or "NO".

Constraints
1 ≤ T ≤ 1,000
1 ≤ a, b, c, d ≤ 10,000
Subtasks
Subtask #1 (100 points): original constraints

Example
Input:

3
1 1 2 2
3 2 2 3
1 2 2 2

Output:

YES
YES
NO
*/

import java.util.*;
public class RECTANGL{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			Map<Integer, Integer> sides = new HashMap<Integer, Integer>();
			int side = 0;
			for(int i=0; i<4;i++){
				side = sc.nextInt();
				if(sides.containsKey(side)){
					sides.put(side, sides.get(side)+1);
				}else{
					sides.put(side, 1);
				}
			}
			String ans = null;
			ans = "NO";
			if(sides.size() <= 2){
				for(Map.Entry<Integer, Integer> entry : sides.entrySet()){
					if(entry.getValue() == 2 || entry.getValue() == 4){
						ans = "YES";
						break;
					}
				}
			}
			answer.add(ans);
		}
		answer.forEach(System.out::println);
	}
}

