//POPGATES

/*
You are Dastan, the great Prince of Persia!

After searching long for the mysterious 'Sands of Time', you have finally arrived at the gates of the city that hosts the ancient temple of the gods. However, the gate is locked and it can only be opened with a secret code, which you need to obtain by solving the following puzzle:

There is a table in front of you, with N coins placed in a row and numbered 1 through N from left to right. For each coin, you know whether it is initially showing heads or tails. You have to perform exactly K operations. In one operation, you should remove the rightmost coin present on the table, and if this coin was showing heads right before it was removed, then you should also flip all the remaining coins. (If a coin was showing heads, then after it is flipped, it is showing tails, and vice versa.)

The code needed to enter the temple is the number of coins which, after these K operations are performed, have not been removed and are showing heads. Can you find this number? The fate of Persia lies in your hands…

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains N space-separated characters. For each valid i, the i-th of these characters is 'H' if the i-th coin is initially showing heads or 'T' if it is showing tails.
Output
For each test case, print a single line containing one integer ― the number of coins that are showing heads after K operations.

Constraints
1≤T≤200
1≤K<N≤100
Subtasks
Subtask #1 (100 points): original constraints

Example Input
3
5 3
H T T H T
7 4
H H T T T H H
6 1
T H T H T T
Example Output
1
2
2

*/


import java.util.*;
public class POPGATES{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine().replaceAll(" ", "");
            int flipCount = 0, ans = 0;
            char checkChar = 'H';
            for(int i = n-1; i > n-k-1; i--){
                if(str.charAt(i) == checkChar) {
                    flipCount++;
                    if(checkChar == 'H') checkChar = 'T';
                    else checkChar = 'H';
                }
            }
            //System.out.println(flipCount);
            if(flipCount % 2 == 0){
                for(int i = 0; i < n-k; i++){
                    if(str.charAt(i) == 'H') ans++;
                }
            }else{
                for(int i = 0; i < n-k; i++){
                    if(str.charAt(i) == 'T') ans++;
                }
            }
            answer.add(ans);
		}
		answer.forEach(System.out::println);
	}
}

