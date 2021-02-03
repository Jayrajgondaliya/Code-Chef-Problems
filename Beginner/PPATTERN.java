//PPATTERN

/*

Consider the following 4×4 pattern:

 1  2  4  7
 3  5  8 11
 6  9 12 14
10 13 15 16
You are given an integer N. Print the N×N pattern of the same kind (containing integers 1 through N2).

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.
Output
For each test case, print N lines; each of them should contain N space-separated integers.

Constraints
1≤T≤10
1≤N≤100
Subtasks
Subtask #1 (100 points): Original constraints

Example Input
1
4
Example Output
1 2 4 7
3 5 8 11
6 9 12 14
10 13 15 16

*/


import java.util.*;
public class PPATTERN{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
            int n = sc.nextInt();
            int temp = 1;
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int a = 0, b = i; (a <= i && b >= 0); a++, b--){
                    arr[a][b] = temp++;
                }
            }
            temp = n * n;
            for(int i = n-1; i > 0; i--){
                for(int a = n-1, b = i; (a >= i && b >= 1); a--, b++){
                    arr[a][b] = temp--;
                }
            }	
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.print("\n");
            }
		}
	}
}