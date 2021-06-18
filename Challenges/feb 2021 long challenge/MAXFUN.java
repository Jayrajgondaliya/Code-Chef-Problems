//MAXFUN
/*

You are given a sequence A1,A2,…,AN. Find the maximum value of the expression |Ax−Ay|+|Ay−Az|+|Az−Ax| over all triples of pairwise distinct valid indices (x,y,z).

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer ― the maximum value of |Ax−Ay|+|Ay−Az|+|Az−Ax|.

Constraints
1≤T≤5
3≤N≤105
|Ai|≤109 for each valid i
Subtasks
Subtask #1 (30 points): N≤500
Subtask #2 (70 points): original constraints

Example Input
3
3
2 7 5
3
3 3 3
5
2 2 2 2 5
Example Output
10
0
6
Explanation
Example case 1: The value of the expression is always 10. For example, let x=1, y=2 and z=3, then it is |2−7|+|7−5|+|5−2|=5+2+3=10.

Example case 2: Since all values in the sequence are the same, the value of the expression is always 0.

Example case 3: One optimal solution is x=1, y=2 and z=5, which gives |2−2|+|2−5|+|5−2|=0+3+3=6.

*/
import java.util.*;
import java.util.stream.*;
import java.lang.Math;
public class MAXFUN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
			int n = sc.nextInt();
            //int[] arr = new int[n];
            Set<Long> set = new HashSet<Long>();
            for(int i = 0; i < n; i++){
                set.add(sc.nextLong());
            }
            List<Long> finalList = set.stream().sorted().collect(Collectors.toList());
           if(finalList.size() == 1){
                answer.add(0L);
           }else if(finalList.size() == 2){
                answer.add(2L * (finalList.get(1) - finalList.get(0)));
           }else{
               int mid = 0;
               if(finalList.size() % 2 == 0){
                   mid = finalList.size() / 2;
               }else{
                   mid = 1;
               }
               answer.add(
                   Math.abs(finalList.get(finalList.size() - 1)-finalList.get(0))+
                   Math.abs(finalList.get(finalList.size() - 1)-finalList.get(mid)) + 
                   Math.abs(finalList.get(mid)-finalList.get(0)));
           }
        ///answer.add(Math.abs(arr[n-1]-arr[0])+Math.abs(arr[n-1] - arr[1]) + Math.abs(arr[1] - arr[0]));
		}
		answer.forEach(System.out::println);
	}
}