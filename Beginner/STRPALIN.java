//STRPALIN
/*

Chef likes strings a lot but he likes palindromic strings more. Today, Chef has two strings A and B, each consisting of lower case alphabets.

Chef is eager to know whether it is possible to choose some non empty strings s1 and s2 where s1 is a substring of A, s2 is a substring of B such that s1 + s2 is a palindromic string. Here '+' denotes the concatenation between the strings.

Note:

A string is a palindromic string if it can be read same both forward as well as backward. To know more about palindromes click here.

Input
First line of input contains a single integer T denoting the number of test cases.
For each test case:
First line contains the string A
Second line contains the string B.
Output
For each test case, Print "Yes" (without quotes) if it possible to choose such strings s1 & s2. Print "No" (without quotes) otherwise.

Constraints
1 ≤ T ≤ 10
1 ≤ |A|, |B| ≤ 1000
Subtasks
Subtask 1: 1 ≤ |A|, |B| ≤ 10 : ( 40 pts )
Subtask 2: 1 ≤ |A|, |B| ≤ 1000 : ( 60 pts )
Example
Input
3
abc
abc
a
b
abba
baab

Output
Yes
No
Yes
Explanation
Test 1: One possible way of choosing s1 & s2 is s1 = "ab", s2 = "a" such that s1 + s2 i.e "aba" is a palindrome.
Test 2: There is no possible way to choose s1 & s2 such that s1 + s2 is a palindrome.
Test 3: You can figure it out yourself.



*/
import java.util.*;
public class STRPALIN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            boolean flag = false;
            for(char c : a.toCharArray()){
                if(b.indexOf(c) >= 0 ){
                    flag = true;
                    break;
                }
            }
            if(flag){
                answer.add("Yes");
            }else{
                answer.add("No");
            }
		}
		answer.forEach(System.out::println);
	}
}
