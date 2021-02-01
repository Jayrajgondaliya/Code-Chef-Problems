//EID

/*
During Eid, it's a tradition that each father gives his kids money which they can spend on entertainment.

Chef has N coins; let's denote the value of coin i by vi. Since today is Eid, Chef is going to give one coin to each of his two children. He wants the absolute value of the difference between the values of coins given to the two children to be as small as possible, so that he would be as fair as possible.

Help Chef by telling him the minimum possible difference between the values of the coins given to the two children. Of course, Chef cannot give the same coin to both children.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers v1,v2,…,vN.
Output
For each test case, print a single line containing one integer — the minimum possible difference.

Constraints
1≤T≤100
2≤N≤105
the sum of N in all test cases does not exceed 5⋅105
1≤vi≤106 for each valid i
Subtasks
Subtask #1 (30 points): the sum of N in all test cases does not exceed 2,000
Subtask #2 (70 points): original constraints

Example Input
2
3
1 4 2
3
1 3 3
Example Output
1
0
Explanation
Example case 1: Chef gives the coin with value 1 to his first child and the coin with value 2 to the second child, so the answer is 2−1=1.

Example case 2: Chef gives each of his children a coin with value 3, so the difference is 0.
*/


import java.util.*;
import java.util.stream.*;
import java.lang.Math;
public class EID{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i< n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int diff = Integer.MAX_VALUE;
            for(int i = 0; i< n-1; i++){
                diff = Math.min(diff, arr[i+1]-arr[i]);
            }
            answer.add(diff);
		}
		answer.forEach(System.out::println);
	}
}



// sc.nextLine();
            // String[] str = sc.nextLine().split(" ");
            // List<Integer> list = Arrays.stream(str).map(e -> Integer.parseInt(e)).sorted().collect(Collectors.toList());
            // int diff = Integer.MAX_VALUE, temp = Integer.MAX_VALUE;
            // for(int i = 0; i < n-1; i++){
            //     for(int j = i+1; j < n; j++){
            //         temp = Math.abs(list.get(i) - list.get(j));
            //         if(temp < diff){
            //             diff = temp;
            //             if(diff == 0) break;
            //         }
            //     }
            // }