//CHNGIT

/*
You are given a sequence A1,A2,…,AN. You want all the elements of the sequence to be equal. In order to achieve that, you may perform zero or more moves. In each move, you must choose an index i (1≤i≤N), then choose j=i−1 or j=i+1 (it is not allowed to choose j=0 or j=N+1) and change the value of Ai to Aj — in other words, you should replace the value of one element of the sequence by one of its adjacent elements.

What is the minimum number of moves you need to make in order to make all the elements of the sequence equal?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing one integer — the minimum required number of moves.

Constraints
1≤T≤100
1≤N≤100
1≤Ai≤100 for each valid i
Example Input
3
5
1 1 1 1 1
4
9 8 1 8
2
1 9
Example Output
0
2
1
Explanation
Example case 1: No moves are needed since all the elements are already equal.

Example case 3: We can perform one move on either A1 or A2.


*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class CHNGIT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String[] strs = sc.nextLine().split(" ");
            Map<String, Long> maps = Arrays.stream(strs).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            long max = 0;
            for(Map.Entry<String, Long> entry: maps.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                }
            }
            answer.add(n - max);
		}
		answer.forEach(System.out::println);
	}
}
