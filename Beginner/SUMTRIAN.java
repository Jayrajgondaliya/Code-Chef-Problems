/*

Let's consider a triangle of numbers in which a number appears in the first line, two numbers appear in the second line, three in the third line, etc. Develop a program which will compute the largest of the sums of numbers that appear on the paths starting from the top towards the base, so that:

on each path the next number is located on the row below, more precisely either directly below or below and one place to the right;
the number of rows is strictly positive, but less than 100
all numbers are positive integers between 0 and 99.
Input
In the first line integer n - the number of test cases (equal to about 1000). Then n test cases follow. Each test case starts with the number of lines which is followed by their content.

Output
For each test case write the determined value in a separate line.

Example
Input:
2
3
1
2 1
1 2 3
4 
1 
1 2 
4 1 2
2 3 1 1 

Output:
5
9


*/

import java.util.*;
public class SUMTRIAN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int n;
		while(t-->0){
			n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j <= i; j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			for(int i = n - 1; i > 0; i--){
				for(int j = n - 1; j > 0; j--){
					if(a[i][j] > a[i][j-1]){
						a[i-1][j-1] = a[i-1][j-1] + a[i][j];
					}else{
						a[i-1][j-1] = a[i-1][j-1] + a[i][j-1];
					}
				}
			}

			answer.add(a[0][0]);
		}
		answer.forEach(System.out::println);
	}
}