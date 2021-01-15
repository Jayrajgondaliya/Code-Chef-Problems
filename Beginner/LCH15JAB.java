//LCH15JAB
/*
This is a very easy warm-up problem.

You are given a string. Your task is to determine whether number of occurrences of some character in the string is equal to the sum of the numbers of occurrences of other characters in the string. 

Input
The first line of the input contains an integer T denoting the number of test cases. Each of the next T lines contains one string S consisting of lowercase latin letters.

Output
For each test case, output a single line containing "YES" if the string satisfies the condition given above or "NO" otherwise.

Constraints
1 ≤ T ≤ 1000
1 ≤ length of S ≤ 50
Subtasks
Subtask #1[28 points]: S contains no more than 2 different letters.
Subtask #2[72 points]: No additional conditions

Example
Input:
4
acab
zzqzqq
abc
kklkwwww
Output:
YES
YES
NO
YES

*/
import java.util.*;
public class LCH15JAB

{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			Map<Character, Integer> maps = new HashMap<Character, Integer>();
			String str = sc.nextLine();
			
			if(str.length() % 2 != 0){
				answer.add("NO");
			}else{	
			for(char c : str.toCharArray()){
				if(maps.containsKey(c)){
					maps.put(c, maps.get(c)+1);
				}else{
					maps.put(c, 1);
				}
			}
			int max = 0;
			for(Map.Entry<Character, Integer> e : maps.entrySet()){
				if(e.getValue() > max){
					max = e.getValue();
				}
			}
			
			if(max == (str.length() / 2)){
				answer.add("YES");
			}else{
				answer.add("NO");
			}
			}
		}
		answer.forEach(System.out::println);
	}
}