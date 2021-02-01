//LCOLLIS

/*
Once N boys and M girls attended a party. You are given a matrix A of N rows and M columns where Aij is 1 if the i-th boy likes the j-th girl, otherwise it will be 0. Note that it is not necessary that if a boy x likes girl y, then girl y should like boy x.

You know that if there are two different boys x and y, who both like girl z, then there will be a collision. Can you calculate the number of different collisions at this party? Note that order of boys in the collision doesn't matter.

Input
The first line contains a single integer T denoting the number of test cases. Then T test cases follow.

The first line of each test case contains two space separated integers N, M denoting the number of boys and girls, respectively.

Each of the following N lines contain M characters, each of them is either '0' or '1'.

Output
For each test case output a single line containing an integer corresponding to the number of collisions at the party.

Constraints
1 ≤ T ≤ 100
1 ≤ N, M ≤ 10
Example
Input:
2
4 3
111
100
110
000
2 2
10
01

Output:
4
0
Explanation
Example Case 1. All three boys like the first girl, so there are (1, 2, 1), (1, 3, 1), (2, 3, 1) collisions with her. Boys 1 and 3 both like the second girl so this is one more collision. Only one boy likes the third girl, so there are no collisions with her and thus we have 4 collisions total.

Example Case 2. For each girl there is only one boy who likes her, so there are no collisions at all.
*/

import java.util.*;
public class LCOLLIS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int count=0;
            char[][] main = new char[n][m];
            char[] temp = new char[m];
            for(int i = 0; i < n; i++){
                 temp = sc.nextLine().toCharArray();
                 for(int j = 0; j < m; j++){
                    main[i][j] = temp[j];
                 }
            }
            int tempInt = 0;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(main[j][i] == '1'){
                        tempInt++;
                    }
                }
                if(tempInt > 0){
                    count += (tempInt * (tempInt - 1)/2);
                }
                tempInt=0;
            }
            answer.add(count);
		}
		answer.forEach(System.out::println);
	}
}
