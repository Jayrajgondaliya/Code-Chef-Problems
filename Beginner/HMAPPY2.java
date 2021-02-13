//HMAPPY2

/*

Appy and Chef are participating in a contest. There are N problems in this contest; each problem has a unique problem code between 1 and N inclusive. Appy and Chef decided to split the problems to solve between them ― Appy should solve the problems whose problem codes are divisible by A but not divisible by B, and Chef should solve the problems whose problem codes are divisible by B but not divisible by A (they decided to not solve the problems whose codes are divisible by both A and B).

To win, it is necessary to solve at least K problems. You have to tell Appy whether they are going to win or lose.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains four space-separated integers N, A, B and K.
Output
For each test case, print a single line containing the string "Win" if they can solve at least K problems or "Lose" otherwise (without quotes).

Constraints
1≤T≤15
1≤K≤N≤1018
1≤A,B≤109
Subtasks
Subtask #1 (15 points):

1≤T≤15
1≤K≤N≤106
1≤A,B≤103
Subtask #2 (85 points): original constraints

Example Input
1
6 2 3 3
Example Output
Win
Explanation
Example case 1: Appy is solving the problems with codes 2 and 4, Chef is solving the problem with code 3. Nobody is solving problem 6, since 6 is divisible by both 2 and 3. Therefore, they can solve 3 problems and win.*/





import java.util.*;
import java.util.stream.*;
public class HMAPPY2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            long n = sc.nextLong();
            int a = sc.nextInt();
            int b = sc.nextInt();
            long k = sc.nextLong();
            long LCM = lcm(a, b);
            //long count = IntStream.range(1, n+1).filter(e -> ((e % a == 0 || e % b == 0) && (e % LCM != 0))).count();
            //long count = LongStream.range(1, n+1).filter(e -> ((e % a == 0 && e % b != 0) || (e % a != 0 && e % b == 0))).count();
            long count = n / a + n / b - 2 * n / LCM;
            if(count >= k){
                answer.add("Win");
            }else{
                answer.add("Lose");
            }
		}
		answer.forEach(System.out::println);
    }
    
    private static long lcm(int a, int b){
        return (a * b * 1L) / gcd(a, b);
    }

    private static int gcd(int a, int b){
        if(a == 0){
            return b;
        }else{
            return gcd(b % a, a);
        }
    }

}

