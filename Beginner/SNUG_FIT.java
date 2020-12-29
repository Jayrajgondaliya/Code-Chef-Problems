/*
Once again, we have a lot of requests from coders for a challenging problem on geometry. Geometry expert Nitin is thinking about a problem with parabolas, icosahedrons, crescents and trapezoids, but for now, to encourage beginners, he chooses to work with circles and rectangles.

You are given two sequences A1,A2,…,AN and B1,B2,…,BN. You should choose a permutation P1,P2,…,PN of the integers 1 through N and construct N rectangles with dimensions A1×BP1,A2×BP2,…,AN×BPN. Then, for each of these rectangles, you should construct an inscribed circle, i.e. a circle with the maximum possible area that is completely contained in that rectangle.

Let S be the sum of diameters of these N circles. Your task is to find the maximum value of S.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
The third line contains N space-separated integers B1,B2,…,BN.
Output
For each test case, print a single line containing one integer ― the maximum value of S. It is guaranteed that this value is always an integer.

Constraints
1≤T≤50
1≤N≤104
1≤Ai,Bi≤109 for each valid i
Subtasks
Subtask #1 (20 points):

A1=A2=…=AN
B1=B2=…=BN
Subtask #2 (80 points): original constraints

Example Input
2
4
8 8 10 12
15 20 3 5
3
20 20 20
10 10 10
Example Output
30
30


Diameter of Biggest circle possible inside ractangle is smallest side of Ractangle and to maximize the size of these circles, we need to minimize the difference between two sides of ractanble 
and for that sort both sequences and then select pair.

> Sort both sequences into lower to Higher and select permutations.

*/


import java.util.*;
import java.io.*;

public class SNUG_FIT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
			int n = sc.nextInt();
			PriorityQueue<Integer> a = new PriorityQueue<Integer>(); // Use of priority Queue to make whole program faster, becuase no need of sorting.
			PriorityQueue<Integer> b = new PriorityQueue<Integer>();
			int i = 0;
			while (i < n){
				a.add(sc.nextInt());
				i++;
			}
			i = 0;
			while (i < n){
				b.add(sc.nextInt());
				i++;
			}
			long s = 0;
			i = 0;
		    while (i < n) {
				s += Math.min(a.poll(), b.poll());
				i++;
		    }
		    answer.add(s);
		}
		
		for(long a : answer){
			System.out.println(a);
		}
	}
} 










