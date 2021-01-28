//GOODSET

/*
A set of integers is called good if there does not exist three distinct elements a, b, c in it such that a + b = c.

Your task is simple. Just output any good set of n integers. All the elements in this set should be distinct and should lie between 1 and 500, both inclusive.

Input
The first line of the input contains an integer T denoting number of test cases. The descriptions of T test cases follow.
The only line of each test case contains an integer n, denoting the size of the needed good set.
Output
For each test case, output a single line containing n integers denoting the elements of the good set, in any order. There can be more than one possible good set, and you can output any one of them.

Constraints
1 ≤ T, n ≤ 100
Subtasks
Subtask #1 (50 points): 1 ≤ T, n ≤ 10
Subtask #2 (50 points): original constraints
Example
Input
5
1
2
3
4
5

Output
7
1 2
1 2 4
1 2 4 16
3 2 15 6 10
Explanation
Example 1 and 2. Any set of size less than or equal to 2 is good by definition.

Example 3 onwards. For each pair of elements in the set, you can see that their sum doesn't exist in the set.
*/

import java.util.*;
public class GOODSET{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int j = 1;
            for(int i = 0; i < n; i++){
                for(; j <= 500; j++){
                    if(sumPresent(arr, j)){
                        arr[i] = j;
                        break;
                    }
                }
            }

            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < n; i++){
                sb.append(arr[i]+" ");
            }
            answer.add(sb.toString());
		}
		answer.forEach(System.out::println);
    }
    
    public static boolean sumPresent(int[] arr, int number){
        int n = arr.length;
       for(int i = 0; i < n - 1; i++){
           if(arr[i] != number){
               for(int j = i+1; j < n; j++){
                   if((arr[i] + arr[j]) == number){
                       return false;
                   }
               }
           }else{
               return false;
           }
       }
       return true;
    } 
}