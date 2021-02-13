//VALIDSTK

/*
You have a stack which is initially empty. You receive instructions of the form 1 or 0. 1 denotes that you have to push in an element, and 0 denotes that you have to pop out an element. But of course you can pop something out only if it exists in the stack. So your job is to look at the instructions and see if they are valid (ie. you never have to pop from an empty stack), or not.

Input
The first line of the input contains a single integers T, which denotes the number of testcases.
The first line of each testcase contains a single integer n, which denotes the number of instructions.
The second line contains n space separated integers, which are all 0 or 1.
Output
For each testcase output either "Valid" or "Invalid", in a new line.
Constraints
1≤T≤10
1≤n≤105
All instructions are either 0 or 1.
Sample Input
2
5
1 1 0 0 1
5
1 0 0 1 1
Sample Output
Valid
Invalid
Explanation
Testcase 2: You first push something, and then pop it out. So now you have an empty stack, but the next operation is a Pop, and hence this is Invalid.
*/

import java.util.*;
public class VALIDSTK
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            int count = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] == 1){
                    count++;
                }else{
                    if(count > 0) count--;
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer.add("Valid");
            else answer.add("Invalid");
		}
		answer.forEach(System.out::println);
	}
}
