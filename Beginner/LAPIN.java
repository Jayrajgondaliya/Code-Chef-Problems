/*
Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.

Input:
First line of input contains a single integer T, the number of test cases.
Each test is a single line containing a string S composed of only lowercase English alphabet.
Output:
For each test case, output on a separate line: "YES" if the string is a lapindrome and "NO" if it is not.
Constraints:
1 ≤ T ≤ 100
2 ≤ |S| ≤ 1000, where |S| denotes the length of S
*/


import java.util.*;
public class LAPIN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		Map<Character, Integer> leftHalf = new HashMap<Character, Integer>();
		Map<Character, Integer> rightHalf = new HashMap<Character, Integer>();
		while(t-->0){
			String str = sc.nextLine();
			int firstEnd = str.length() / 2 - 1, secondStart;
			if(str.length() % 2 == 0){
				secondStart = firstEnd+1;
			}else{
				secondStart = firstEnd+2;
			}
			
			for(int i = 0; i <= firstEnd; i++){
				if(leftHalf.containsKey(str.charAt(i))){
					leftHalf.put(str.charAt(i), leftHalf.get(str.charAt(i)).intValue()+1);
				}else{
					leftHalf.put(str.charAt(i), 1);
				}
			}
			
			for(int i = secondStart; i < str.length(); i++){
				if(rightHalf.containsKey(str.charAt(i))){
					rightHalf.put(str.charAt(i), rightHalf.get(str.charAt(i)).intValue()+1);
				}else{
					rightHalf.put(str.charAt(i), 1);
				}
			}
			if(leftHalf.equals(rightHalf)) answer.add("YES");
			else answer.add("NO");
			leftHalf.clear();
			rightHalf.clear();
		}
		answer.forEach(System.out::println);
	}
}