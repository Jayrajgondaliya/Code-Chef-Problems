//PRGIFT
/*
Today is chef's friend's birthday. He wants to give a gift to his friend. So he was desperately searching for some gift here and there.
Fortunately, he found an array a of size n lying around. The array contains positive integers. Chef's friend likes even numbers very much. So for the gift, chef will choose a consecutive non-empty segment of the array. The segment should contain exactly k even integers. Though it can have any number of odd integers. He will then pick that segment and gift it to his friend.
But there is a problem. It might not be always possible for the chef to choose such a segment. Please tell whether it is possible for chef to select some gift or not?

Input
First line of the input contains a single integer T denoting number of test cases.
For each test case, first line contains two space separated integers n, k.
Next line contains n space separated integers denoting content of array a.
It is also guaranteed that all the numbers in the array a are distinct.
Output
For each test case, print a single line containing "YES" or "NO" (without quotes) corresponding to the situation.

Constraints
1 ≤ T ≤ 10
1 ≤ n ≤ 50
0 ≤ k ≤ n
1 ≤ a i ≤ 100
Example
Input:
4
2 1
1 2
3 2
2 6 5
3 3
2 4 5
4 2
1 2 4 5

Output:
YES
YES
NO
YES


Explanation


For  first  test case, we can select a[2, 2] = {2}. 

For second  test case, we can select a[1, 2] = {2, 6}. 

For third  test case, we can not select any consecutive segment having exactly 3 even numbers. 

For fourth  test case, we can select a[2, 3] = {2, 4}. 




 Note 



A consecutive non empty segment of array a is a segment a[l], a[l + 1] , , a[r] such that 1 ≤ l ≤ r ≤ n. 
*/
import java.util.*;
public class PRGIFT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int even = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0){
                    even++;
                }
            }
            if(k == 0 && even == n){
                answer.add("NO");
            }else if(even >= k){
                answer.add("YES");
            }else{
                answer.add("NO");
            }
		}
		answer.forEach(System.out::println);
	}
}