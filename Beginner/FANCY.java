//FANCY

/*

"I don't have any fancy quotes." - vijju123

Chef was reading some quotes by great people. Now, he is interested in classifying all the fancy quotes he knows. He thinks that all fancy quotes which contain the word "not" are Real Fancy; quotes that do not contain it are regularly fancy.

You are given some quotes. For each quote, you need to tell Chef if it is Real Fancy or just regularly fancy.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single string S denoting a quote.
Output
For each test case, print a single line containing the string "Real Fancy" or "regularly fancy" (without quotes).

Constraints
1≤T≤50
1≤|S|≤100
each character of S is either a lowercase English letter or a space
Subtasks
Subtask #1 (100 points): original constraints

Example Input
2
i do not have any fancy quotes
when nothing goes right go left
Example Output
Real Fancy
regularly fancy
Explanation
Example case 1: "i do not have any fancy quotes"

Example case 2: The word "not" does not appear in the given quote.
*/


import java.util.*;
public class FANCY{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        ArrayList<String> answer = new ArrayList<String>();
        sc.nextLine();
        Set<String> setOfKeywords = new HashSet<String>(Arrays.asList(" not ", "don't"));
		while(t-->0){
            String quote = sc.nextLine();
            quote = " "+quote+" ";
            boolean flag = true;
            for(String str : setOfKeywords){
                if(quote.indexOf(str) >= 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer.add("regularly fancy");
            }else{
                answer.add("Real Fancy");
            }
		}
		answer.forEach(System.out::println);
	}
}


