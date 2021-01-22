//SUBINC
/*Given an array A1,A2,...,AN, count the number of subarrays of array A which are non-decreasing.
A subarray A[i,j], where 1≤i≤j≤N is a sequence of integers Ai,Ai+1,...,Aj.

A subarray A[i,j] is non-decreasing if Ai≤Ai+1≤Ai+2≤...≤Aj. You have to count the total number of such subarrays.

Input
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains a single integer N denoting the size of array.

The second line contains N space-separated integers A1, A2, …, AN denoting the elements of the array.

Output
For each test case, output in a single line the required answer.

Constraints
1≤T≤5
1≤N≤105
1≤Ai≤109
Subtasks
Subtask 1 (20 points) : 1≤N≤100
Subtask 2 (30 points) : 1≤N≤1000
Subtask 3 (50 points) : Original constraints
Sample Input:
2
4
1 4 2 3
1
5
Sample Output:
6
1
Explanation
Example case 1.
All valid subarrays are A[1,1],A[1,2],A[2,2],A[3,3],A[3,4],A[4,4].
Note that singleton subarrays are identically non-decreasing.

Example case 2.
Only single subarray A[1,1] is non-decreasing.
*/


/*
1
7
1 3 4 5 6 2 3

1
3
4
5
6
2
3

1 3
1 3 4
1 3 4 5
1 3 4 5 6

3 4
3 4 5
3 4 5 6

4 5
4 5 6

5 6

2 3



1 2 3 4

1
2
3
4
1 2
1 2 3
1 2 3 4

2 3 
2 3 4

3 4



*/

import java.util.*;
public class SUBINC
{	
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    ArrayList<Long> answer = new ArrayList<Long>();
    while(t-->0){
        long n = sc.nextLong();
        long count = n;
        sc.nextLine();
        String str[] = sc.nextLine().split(" ");
        long temp = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(Long.parseLong(str[j-1]) <  Long.parseLong(str[j])){
                    temp++;
                    //count++;
                }else{
                    count+= (temp * (temp + 1) / 2);
                    i = j;
                    temp = 0;
                    break;
                }
            }
            if(temp > 0){
                count += (temp * (temp + 1) / 2);
            }

        }
        answer.add(count);
    }
    answer.forEach(System.out::println);
	}
}