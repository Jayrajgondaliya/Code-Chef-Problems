//C00K0FF

/*
Chef wants to prepare a Cook-Off contest with 5 problems chosen from a set of N problems. He has marked the difficulty of each problem within a range identified by one of the following strings: "cakewalk", "simple", "easy", "easy-medium", "medium", "medium-hard", "hard". According to this page, a Cook-Off contest must have problems of the following difficulties:

exactly one "cakewalk";
exactly one "simple";
exactly one "easy";
one "easy-medium" or one "medium";
one "medium-hard" or one "hard".
Given the information about the N problems, can you advise Chef if it's possible to pick 5 problems and form a valid Cook-Off contest?

Input
The first line of input contains one integer T denoting the number of test cases.
T test cases follow.
The first line of each test case contains a single integer N.
Then N lines follow; the i-th line contains a single string si, denoting the difficulty of the i-th problem.
Output
For each test case, output "Yes" if it's possible to pick 5 problems and form a valid Cook-Off contest; otherwise, output "No".

Constraints
1 ≤ T ≤ 100000
5 ≤ N ≤ 100000
sum of N in all test cases ≤ 600000
si can only be one of the following strings:
"cakewalk"
"simple"
"easy"
"easy-medium"
"medium"
"medium-hard"
"hard"
Subtask #1 (11 points):

N = 5
Subtask #2 (27 points):

5 ≤ N ≤ 15
T ≤ 100
Subtask #3 (62 points):

original constraints
Example
Input:
3
5
easy
medium
medium-hard
simple
cakewalk
7
simple
simple
medium
medium
easy-medium
cakewalk
easy
7
cakewalk
simple
easy
easy-medium
medium
medium-hard
hard

Output:
Yes
No
Yes

Explanation
Example case 2: There are neither problems of "medium-hard" level nor "hard" level, so it's impossible to form a Cook-Off contest.
*/
import java.util.*;
public class C00K0FF{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            Set<String> set = new HashSet<String>();
            int n = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < n; i++){
                set.add(sc.nextLine());
            }
            if(set.contains("cakewalk") && 
            set.contains("simple") &&
            set.contains("easy") &&
            (set.contains("easy-medium") || set.contains("medium")) &&
            (set.contains("medium-hard") || set.contains("hard"))){
                answer.add("Yes");
            }else{
                answer.add("No");
            }
		}
		answer.forEach(System.out::println);
	}
}