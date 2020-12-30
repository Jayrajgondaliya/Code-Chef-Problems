/*
Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwise print their sum.

Input:
First line will contain the first number (N1)
Second line will contain the second number (N2)
Output:
Output a single line containing the difference of 2 numbers (N1−N2) if the first number is greater than the second number otherwise output their sum (N1+N2).

Constraints
−1000≤N1≤1000
−1000≤N2≤1000
Sample Input:
82
28
Sample Output:
54
*/
import java.util.*;
public class DIFFSUM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1 > n2) System.out.println(n1-n2);
		else System.out.println(n1+n2);
	}
}