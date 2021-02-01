//SWPDGT

/*
Chef has two positive integers A and B. He can tamper with them by choosing a digit in the decimal representation of A and a digit in the decimal representation of B and swapping these digits. This operation may be performed at most once.

Find the maximum possible sum of the resulting numbers which Chef can obtain.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers A and B.
Output
For each test case, print a single line containing one integer ― the maximum sum.

Constraints
1≤T≤1,000
1≤A,B≤99
Example Input
3
13 82
9 24
20 30
Example Output
104
96
50
Explanation
Example case 1: Swapping the digits 1 (from 13) and 2 (from 82) gives us 23 and 81. Their sum 23+81=104 is the maximum possible sum.

Example case 3: Swapping is not needed as the original numbers have the maximum possible sum.



*/

import java.util.*;
public class SWPDGT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = a + b;
            int a1 = a / 10;
            int a0 = a % 10;
            int b1 = b / 10;
            int b0 = b % 10;
            if(a1 != 0 || b1 != 0){
                if(a1 == 0){
                    int t2 = 10*b1 + a0 + b0;
                    int t1 = 10*a0 + b0 + b1;
                    if(t2 > max) max = t2;
                    if(t1 > max) max = t1; 
                }else if(b1 == 0){
                    int t2 = 10*a1 + b0 + a0;
                    int t1 = 10*b0 + a0 + a1;
                    if(t2 > max) max = t2;
                    if(t1 > max) max = t1; 
                }else{
                    int t1 = 10*a1 + b0 + 10*b1 + a0;
                    int t2 = 10*a1 + b1 + 10*a0 + b0;
                    int t3 = 10*b1 + a0 + 10*a1 + b0;
                    int t4 = 10*b0 + a0 + 10*b1 + a1;
                    if(t1 > max) max = t1;
                    if(t2 > max) max = t2;
                    if(t3 > max) max = t3;
                    if(t4 > max) max = t4;
                }
            }
            answer.add(max);
		}
		answer.forEach(System.out::println);
	}
}
