//KAVGMAT

/*
Chef found a matrix A with N rows (numbered 1 through N) and M columns (numbered 1 through M), where for each row r and column c, the cell in row r and column c (denoted by (r,c)) contains an integer Ar,c.

This matrix has two interesting properties:

The integers in each row form a non-decreasing sequence, i.e. for each valid i, Ai,1≤Ai,2≤…≤Ai,M.
The integers in each column also form a non-decreasing sequence, i.e. for each valid j, A1,j≤A2,j≤…≤AN,j.
A K-worthy submatrix is a square submatrix of A, i.e. a submatrix with l rows and l columns, for any integer l, such that the average of all the integers in this submatrix is ≥K.

Chef wants you to find the number of K-worthy submatrices of A.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains three space-separated integers N, M and K.
N lines follow. For each valid i, the i-th of these lines contains M space-separated integers Ai,1,Ai,2,Ai,3,…,Ai,M.
Output
For each test case, print a single line containing one integer ― the number of K-worthy submatrices of A.

Constraints
1≤T≤10
1≤N⋅M≤106
N≤M
0≤K≤109
0≤Ar,c≤109 for each valid r,c
the sum of N⋅M over all test cases does not exceed 106
Subtasks
Subtask #1 (15 points): the sum of N⋅M over all test cases does not exceed 103
Subtask #2 (25 points): the sum of N⋅M over all test cases does not exceed 4⋅105
Subtask #3 (60 points): original constraints

Example Input
1
3 3 4
2 2 3
3 4 5
4 5 5
Example Output
7
Explanation
Example case 1: The following are the seven 4-worthy submatrices:

[3445] with average 4; this matrix occurs only once
[4555] with average 4.75; this matrix also occurs only once
[4] with average 4; we find this matrix twice in A
[5] with average 5; we find this matrix 3 times in A

*/

import java.util.*;
public class KAVGMAT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            int count = 0, l = 1, tagx = -1, tagy = -1;
            while(l <= Math.min(m, n)){
                for(int i = n-1; i > tagx; i--){
                    for(int j = m-1; j > tagy; j--){
                        long tempCount = 0;
                        int x=0, y=0;
                        for(x = i ; (x > i - l && x >= 0) ; x--){
                            for(y = j; (y > j - l && y >= 0) ; y--){
                               //System.out.println(" L : "+l+" : "+tagx+" : "+i+" : "+x+" : "+tagy+" : "+j+" : "+y+"    ");
                                tempCount += matrix[x][y];
                            }
                        }
                        //System.out.println(i);
                        //System.out.println(" >> :"+ i +" "+j+" TOTAL :"+tempCount+" : "+count+"\n");
                        if(tempCount / (l * l) >= k){
                            count++;
                        }else{
                            tagx = x+1;
                            tagy = y+1;
                            break;
                        }
                    }
                }
                l++;
            }
            answer.add(count);
		}
		answer.forEach(System.out::println);
	}
}
