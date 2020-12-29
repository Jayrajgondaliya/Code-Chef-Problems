// Write a program to find the factorial value of any number entered by the user.
//
// Input
// The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains an integer N.
//
// Output
// For each test case, display the factorial of the given number N in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// 0 ≤ N ≤ 20
// Example
// Input
// 3
// 3
// 4
// 5
//
// Output
//
// 6
// 24
// 120


//Solution - Biggest Number allowed is 20, factorial of 20 is huge number.
import java.util.*;
import java.math.*;

public class FLOW018{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b;
		List<Integer> inputs = new ArrayList<Integer>();
		while(t-->0){
			inputs.add(sc.nextInt());
		}
		
		for(int i: inputs){
			System.out.println(calculateFacorial(i).toString());
		}
	}
	
	public static BigInteger calculateFacorial(int n){
		BigInteger bI = new BigInteger("1");
		for(int i = 2; i <= n; i++){
			bI = bI.multiply(BigInteger.valueOf(i));
		}
		return bI;
	}
}