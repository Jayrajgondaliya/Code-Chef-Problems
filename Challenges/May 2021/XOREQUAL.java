//XOREQUAL

/*
For a given N, find the number of ways to choose an integer x from the range [0,2N−1] such that x⊕(x+1)=(x+2)⊕(x+3), where ⊕ denotes the bitwise XOR operator.

Since the number of valid x can be large, output it modulo 109+7.

Input
The first line contains an integer T, the number of test cases. Then the test cases follow.
The only line of each test case contains a single integer N.
Output
For each test case, output in a single line the answer to the problem modulo 109+7.

Constraints
1≤T≤105
1≤N≤105
Subtasks
Subtask #1 (100 points): Original Constraints

Sample Input
2
1
2
Sample Output
1
2
Explanation
Test Case 1: The possible values of x are {0}.

Test Case 2: The possible values of x are {0,2}.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XOREQUAL {
    
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(bi.readLine());
        while(t-->0){
            int n = Integer.valueOf(bi.readLine());  
            long start = System.currentTimeMillis();
            System.out.println((int)(getMod(n, Double.valueOf(-1.0)) / 2)); 
            long end = System.currentTimeMillis();
           // System.out.println((end - start)+" milliseconds");
        }
    }

    // public static double getMod(int n, Double answer){
    //     if(n == 20) {
    //         if(answer >= 0) return answer;
    //         else {
    //             answer = Math.pow(2, n);
    //             return answer;
    //         }
    //     }else if(n < 20){
    //         return Math.pow(2, n);
    //     }else{
    //         return (Math.pow(getMod(n/10, answer), 10) * getMod(n % 10, answer))% 1000000007;
    //     }
    // }
    public static double getMod(int n, Double answer){
        if(n == 30) {
            if(answer >= 0) return answer;
            else {
                answer = Math.pow(2, 30) % 1000000007;
                return answer;
            }
        }else if(n < 30){
            return Math.pow(2, n) % 1000000007;
        }else{
            int x = n / 30;
            return (Math.pow(getMod(30, answer), x) * getMod((n % 30), answer))% 1000000007;
        }
    }
}