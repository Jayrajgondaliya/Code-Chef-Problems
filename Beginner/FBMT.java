//FBMT

/*

You are given a score log of a football match between two teams. Every time when one of the teams scored a goal, the name of that team was written in the score log on a separate line.

At the end of the match, the team that scored strictly more goals than the other team wins the match. If both teams scored an equal number of goals, the match ends in a tie. Determine the name of the winning team or that the match ended in a tie.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer n denoting the number of records in the score log (the total number of goals scored during the match).
Each of the following n lines contains a string s denoting the name of the team that scored a goal.
Output
For each test case, print a single line containing one string — the name of the winning team or "Draw" (without quotes) in case of a tie.

Constraints
1 ≤ T ≤ 105
0 ≤ n ≤ 105
1 ≤ |s| ≤ 20
s consists only of lowercase English letters
sum of n over all test cases ≤ 105
for each test case, there are at most two different team names
Example
Input:

2
4
ab
bc
bc
ab
3
xxx
yyy
yyy

Output:

Draw
yyy

*/

import java.util.*;
public class FBMT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            Map<String, Integer> scoreCard = new HashMap<String, Integer>();
            String temp = "Draw";
            for(int i =0; i < n; i++){
                temp = sc.nextLine();
                if(scoreCard.containsKey(temp)){
                    scoreCard.put(temp, scoreCard.get(temp)+1);
                }else{
                    scoreCard.put(temp,1);
                }
            }
            int a = 0;
            for(Map.Entry<String, Integer> entry : scoreCard.entrySet()){
                if(entry.getValue() > a){
                    a = entry.getValue();
                    temp = entry.getKey();
                }else if(entry.getValue() == a){
                    temp = "Draw";
                }
            }
            answer.add(temp);
		}
		answer.forEach(System.out::println);
	}
}
