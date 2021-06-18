//PRIGAME

/*

Chef and Divyam are playing a game with the following rules:

First, an integer X! is written on a board.
Chef and Divyam alternate turns; Chef plays first.
In each move, the current player should choose a positive integer D which is divisible by up to Y distinct primes and does not exceed the integer currently written on the board. Note that 1 is not a prime.
D is then subtracted from the integer on the board, i.e. if the integer written on the board before this move was A, it is erased and replaced by A−D.
When one player writes 0 on the board, the game ends and this player wins.
Given X and Y, determine the winner of the game.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers X and Y.
Output
For each test case, print a single line containing the string "Chef" if Chef wins the game or "Divyam" if Divyam wins (without quotes).

Constraints
1≤T≤106
1≤X,Y≤106
Subtasks
Subtask #1 (5 points): Y=1
Subtask #2 (10 points):

1≤T≤102
1≤X≤6
Subtask #3 (85 points): original constraints

Example Input
3
1 2
3 1
2021 42
Example Output
Chef
Divyam 
Divyam
Explanation
Example case 1: Since D=1 is divisible by 0 primes, Chef will write 0 and win the game in the first move.

Example case 2: Chef must choose D between 1 and 5 inclusive, since D=6 is divisible by more than one prime. Then, Divyam can always choose 6−D, write 0 on the board and win the game.

*/
import java.util.*;
import java.lang.Math;
import java.util.stream.*;
import java.io.*;
public class PRIGAME{

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }


	public static void main(String args[]) throws java.lang.Exception{
        FastReader fsr = new FastReader();
        int t = fsr.nextInt();
        while(t-->0){
            int x = fsr.nextInt();
            int y = fsr.nextInt();
            if(x < 3){
                System.out.println("Chef");
            }else if(y == 1){
                System.out.println("Divyam");
            }else{
                int diff = y - x;
                if(diff < -2) System.out.println("Divyam");
                else System.out.println("Chef");
            }
		}
	}

    // public static boolean isPrime(long n) {
    //     if(n < 2) return false;
    //     if(n == 2 || n == 3) return true;
    //     if(n%2 == 0 || n%3 == 0) return false;
    //     long sqrtN = (long)Math.sqrt(n)+1;
    //     for(long i = 6L; i <= sqrtN; i += 6) {
    //         if(n%(i-1) == 0 || n%(i+1) == 0) return false;
    //     }
    //     return true;
    // }
}
