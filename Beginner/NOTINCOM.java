//NOTINCOM

/* 
Alice has quarreled with Berta recently. Now she doesn't want to have anything in common with her!

Recently, they've received two collections of positive integers. The Alice's integers were A1, A2, ..., AN, while Berta's were B1, B2, ..., BM.

Now Alice wants to throw away the minimal amount of number from her collection so that their collections would have no common numbers, i.e. there won't be any number which is present in both collections. Please help Alice to find the minimal amount of numbers she would need to throw away.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains two space-separated integer numbers N and M denoting the amount of numbers in Alice's and Berta's collections respectively.

The second line contains N space-separated integers A1, A2, ..., AN denoting the numbers of Alice.

The third line contains M space-separated integers B1, B2, ..., BM denoting the numbers of Berta.

Output
For each test case, output a single line containing the minimal amount of numbers Alice needs to throw away from her collection so that she wouldn't have any numbers in common with Berta.

Constraints
1 ≤ Ai, Bi ≤ 106
All numbers are distinct within a single girl's collection.
Subtasks
Subtask #1 (47 points): T = 25, 1 ≤ N, M ≤ 1000
Subtask #2 (53 points): T = 5, 1 ≤ N, M ≤ 100000
Example
Input:
2
3 4
1 2 3
3 4 5 6
3 3
1 2 3
4 5 6

Output:
1
0
Explanation
Example case 1. If Alice throws away the number 3 from her collection, she would obtain {1, 2} which is disjoint with {3, 4, 5, 6}.

Example case 2. Girls don't have any number in common initially. So there is no need to throw away any number.
*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.lang.Math;
public class NOTINCOM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String[] str1 = sc.nextLine().split(" ");
            String[] str2 = sc.nextLine().split(" ");
            Map<String, Long> mapA = Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            Map<String, Long> mapB = Arrays.stream(str2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            long count = 0;
            for(Map.Entry<String, Long> entry: mapA.entrySet()){
                if(mapB.containsKey(entry.getKey())){
                    count += Math.min(entry.getValue(), mapB.get(entry.getKey()));
                }
            }
            answer.add(count);
		}
		answer.forEach(System.out::println);
	}
}
