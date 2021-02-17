//ZCO14003

/*
Zonal Computing Olympiad 2014, 30 Nov 2013

You are developing a smartphone app. You have a list of potential customers for your app. Each customer has a budget and will buy the app at your declared price if and only if the price is less than or equal to the customer's budget.


You want to fix a price so that the revenue you earn from the app is maximized. Find this maximum possible revenue.


For instance, suppose you have 4 potential customers and their budgets are 30, 20, 53 and 14. In this case, the maximum revenue you can get is 60 .


Input format
Line 1 : N, the total number of potential customers.

Lines 2 to N+1: Each line has the budget of a potential customer.


Output format
The output consists of a single integer, the maximum possible revenue you can earn from selling your app.


Sample Input 1
4
30
20
53
14

Sample Output 1
60

Sample Input 2
5
40
3
65
33
21

Sample Output 2
99

Test data
Each customers' budget is between 1 and 108, inclusive.


Subtask 1 (30 marks) : 1 ≤ N ≤ 5000.

Subtask 2 (70 marks) : 1 ≤ N ≤ 5×105.


Live evaluation data
There are 15 test inputs on the server during the exam. The grouping into subtasks is as follows.

• Subtask 1: Test inputs 0,…,5

• Subtask 2: Test inputs 6,…,14
*/


import java.util.*;
public class ZCO14003{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long max = 0;
        for(int i = n-1; i >= 0; i--){
            max = Math.max(max, arr[i] * (n - i));
        }
        System.out.println(max);
	}
}
