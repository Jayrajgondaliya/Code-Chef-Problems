//CHEALG
/*

One day, Saeed was teaching a string compression algorithm. This algorithm finds all maximal substrings which contains only one character repeated one or more times (a substring is maximal if it we cannot add one character to its left or right without breaking this property) and replaces each such substring by the string "cK", where K is the length of the substring and c is the only character it contains. For example, "aabaaa" is compressed to "a2b1a3".

Saeed wanted to check if the students understood the algorithm, so he wrote a string S on the board and asked the students if the algorithm is effective on S, i.e. if the string created by compressing S is strictly shorter than S. Help them answer this question.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single string S.
Output
For each test case, print a single line containing the string "YES" if the algorithm is effective on S or "NO" if it is not.

Constraints
1≤T≤100
1≤|S|≤103
S may consist of only lowercase English letters.
Subtasks
Subtask #1 (100 points): original constraints

Example Input
3
bbbbbbbbbbaa
c
aaaaaaaaaabcdefgh
Example Output
YES
NO
NO
Explanation
Example case 1:

The compressed string of "bbbbbbbbbbaa" is "b10a2", which is shorter.
The compressed string of "c" is "c1", which is not shorter than "c".
The compressed string of "aaaaaaaaaabcdefgh" is "a10b1c1d1e1f1g1h1", which is not shorter than "aaaaaaaaaabcdefgh" (both strings have length 17).

*/

import java.util.*;
public class CHEALG{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int count = 0;
            char temp = s.charAt(0), c;
            for(int i = 0; i < s.length(); i++){
                c = s.charAt(i);
                if(temp == c){
                    count++;
                }else{
                    sb.append(temp);
                    sb.append(String.valueOf(count));
                    count = 0;
                    i--;
                    temp = c;
                }
            }
            if(count > 0){
                sb.append(temp);
                sb.append(String.valueOf(count));
            }
            if(sb.length() < s.length()){
                //System.out.println(sb.toString());
                answer.add("YES");
            }else{
                answer.add("NO");
            }
		}
		answer.forEach(System.out::println);
	}
}
