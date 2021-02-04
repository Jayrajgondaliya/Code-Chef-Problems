//MAXREM

/*
Chef and Dhyey have become friends recently. Chef wants to test Dhyey's intelligence by giving him a puzzle to solve.

The puzzle contains an integer sequence A1,A2,…,AN. The answer to the puzzle is the maximum of Ai%Aj, taken over all valid i, j.

Help Dhyey solve this puzzle.

Input
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer — the answer to the puzzle.

Constraints
2≤N≤105
1≤Ai≤109 for each valid i
Subtasks
Subtask #1 (30 points): 2≤N≤1,000
Subtask #2 (70 points): 2≤N≤105
Example Input 1
5  
1 2 3 4 5  
Example Output 1
4  
Example Input 2
6  
5 5 5 2 3 8
Example Output 2
5
*/

import java.util.*;
import java.util.stream.*;
public class MAXREM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> list = IntStream.range(0,n).mapToObj(e -> arr[e]).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if(list.size() == 1){
            System.out.println(0);
        }else{
            System.out.println(list.get(1) % list.get(0));
        }
	}
}