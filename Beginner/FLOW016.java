/*
Two integers A and B are the inputs. Write a program to find GCD and LCM of A and B.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer A and B.

Output
Display the GCD and LCM of A and B separated by space respectively. The answer for each test case must be displayed in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ A,B ≤ 1000000
Example
Input
3 
120 140
10213 312
10 30

Output

20 840
1 3186456
10 30

*/


import java.util.*;
public class FLOW016{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> GCD = new ArrayList<Long>();
		ArrayList<Long> LCM = new ArrayList<Long>();
		long a = 0, b = 0, gcd, lcm;
		while(t-->0){
			a = sc.nextLong();
			b = sc.nextLong();
			
			// Need to divide big number with small number.
			if(a < b){
				gcd = gcdOf(a, b);
			}else{
				gcd = gcdOf(b, a);
			}
			
			lcm = (a * b) / gcd;
			GCD.add(gcd);
			LCM.add(lcm);
		}
		for(int i = 0; i < GCD.size(); i++){
			System.out.println(GCD.get(i)+" "+LCM.get(i));
		}
	}
	
	// Finding GCD reccurcively.
	private static long gcdOf(long small, long big){
		long remainder = big % small;
		if(remainder == 0)
			return small;
		else
			return gcdOf(remainder,small);
	}
}
