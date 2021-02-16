//RECNDSTR

/*

Chef has a string S consisting of lowercase English characters. Chef defined functions left shift L(X) and right shift R(X) as follows.

L(X) is defined as shifting all characters of string X one step towards left and moving the first character to the end.
R(X) is defined as shifting all characters of string X one step towards the right and moving the last character to the beginning.
For example, L("abcd") = "bcda" and R("abcd") = "dabc"

Chef wants to find out whether there exists a string V of the same length as S such that both L(V)=S and R(V)=S holds.

Input:
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a string S.
Output:
For each test case, If there exists a valid string V, print "YES", otherwise print "NO" (without the quotes).

Constraints
1≤T≤100
1≤|S|≤106
S contains all lower case English alphabets.
It's guaranteed that the total length of the strings in one test file doesn't exceed 106
Sample Input:
4
a
ab
abcd
aaaaa
Sample Output:
YES
YES
NO
YES
Explanation:
In the first test case, Chef can choose V=S
In the second test case, Chef can choose V = "ba" which satisfies both conditions.
There doesn't exist any valid choice for string V in the third test case.*/


import java.util.*;
public class RECNDSTR{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			String str = sc.nextLine();
            boolean flag = true;
            int n = str.length();
            if(n <= 2){

            }else if(n % 2 != 0){
                char c = str.charAt(0);
                for(int i = 0; i < n; i++){
                    if(c != str.charAt(i)){
                        flag = false;
                        break;
                    }
                }
            }else{
                char c = str.charAt(0), b = str.charAt(1);
                for(int i = 2; i < n; i++){
                    if((i % 2 == 0 && str.charAt(i) != c) || (i % 2 != 0 && str.charAt(i) != b)){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                answer.add("YES");
            }else{
                answer.add("NO");
            }
		}
		answer.forEach(System.out::println);
	}
}
