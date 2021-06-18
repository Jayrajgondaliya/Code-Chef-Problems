import java.io.*;
import java.util.*;

//TCTCTOE

/*

Tic-tac-toe is a game played between two players on a 3×3 grid. In a turn, a player chooses an empty cell and places their symbol on the cell. The players take alternating turns, where the player with the first turn uses the symbol X and the other player uses the symbol O. The game continues until there is a row, column, or diagonal containing three of the same symbol (X or O), and the player with that token is declared the winner. Otherwise if every cell of the grid contains a symbol and nobody won, then the game ends and it is considered a draw.

You are given a tic-tac-toe board A after a certain number of moves, consisting of symbols O, X, and underscore(_). Underscore signifies an empty cell.

Print

1: if the position is reachable, and the game has drawn or one of the players won.
2: if the position is reachable, and the game will continue for at least one more move.
3: if the position is not reachable.
Note:

Starting from an empty board, reachable position means that the grid is possible after a finite number of moves in the game where the players may or may not be playing optimally.
The answer for each testcase should be with respect to the present position and independent of the results in the further successive moves.
Input
The first line contains an integer T, the number of test cases. Then the test cases follow.
Each test case contains 3 lines of input where each line contains a string describing the state of the game in ith row.
Output
For each test case, output in a single line 1, 2 or 3 as described in the problem.

Constraints
1≤T≤39
Aij∈{X,O,_}
Subtasks
Subtask #1 (100 points): Original Constraints

Sample Input
3
XOX
XXO
O_O
XXX
OOO
___
XOX
OX_
XO_
Sample Output
2
3
1
Explanation
Test Case 1: The board is reachable, and although no player can win from this position, still the game continues.

Test Case 2: There can't be multiple winners in the game.

Test Case 3: The first player is clearly a winner with one of the diagonals.


*/

public class TCTCTOE {
    public static void main(String args[]) throws IOException{
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bi.readLine());
        while(t-->0){
            char[][] ticTacToe = new char[3][3];
            ticTacToe[0] = bi.readLine().toCharArray(); 
            ticTacToe[1] = bi.readLine().toCharArray(); 
            ticTacToe[2] = bi.readLine().toCharArray(); 
            int emptySpace = 0;
            int winners = 0;

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(ticTacToe[i][j] == '_'){
                        emptySpace++;
                    }
                }
            }

            for(int i = 0; i < 3; i++){
                char x = ' ';
                boolean flag = true;
                for(int j = 0; j < 3; j++){
                    if(x == ' '){
                        x = ticTacToe[i][j];
                    }else if(x != ticTacToe[i][j] || ticTacToe[i][j] =='_'){
                        flag  = false;
                        break;
                    }
                }
                if(flag) winners++;
            }

            for(int j = 0; j < 3; j++){
                char x = ' ';
                boolean flag = true;
                for(int i = 0; i < 3; i++){
                    if(x == ' '){
                        x = ticTacToe[i][j];
                    }else if(x != ticTacToe[i][j] || ticTacToe[i][j] =='_'){
                        flag  = false;
                        break;
                    }
                }
                if(flag) winners++;
            }

            if((ticTacToe[0][0] == ticTacToe[1][1]) && (ticTacToe[0][0] == ticTacToe[2][2])) winners++;
            if((ticTacToe[0][2] == ticTacToe[1][1]) && (ticTacToe[0][0] == ticTacToe[2][0])) winners++;

            //System.out.println("WINNER :: "+winners);
            //System.out.println("EMPTY :: "+emptySpace);
            if(winners > 1) System.out.println(3);
            else if(winners == 1) System.out.println(1); // 1 winner or draw (emptyspace == 0 and winner = 0)
            else System.out.println(2); // No winner but emptyspace > 0
        }
    }
}

// if winner == 1 or winner == 0 print 1
// if winner == 0 and emptyspace > 1 >> print 2
// if winner > 1 >> print 3