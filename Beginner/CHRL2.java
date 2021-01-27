//CHRL2
/*
Chef likes playing with strings. The most interesting game are named "CHEF in string". The move of the game consists of the following: Chef takes a subsequence of string's letters that form the word "CHEF" and then he removes that symbols. The goal of the game is to make the maximal number of moves. Please, help Chef and tell him the maximal possible number of moves that he is able to make for the given string S.

Input
The first line of each test case contains a given string. This string consists of uppercase letters from the set {"C", "H", "E", "F"}.

Output
Output a single line containing the maximal possible number of moves.

Constraints
1 ≤ |S| ≤ 100000
Example
Input:
CHEFCHEFFFF

Output:
2

Input:
CHHHEEEFFCC

Output:
1

Scoring
Subtask 1 (25 points): |S| ≤ 2000
Subtask 2 (75 points): See the constraints.
*/
import java.util.*;
import java.util.stream.*;
import java.lang.Math;
public class CHRL2{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int arr[] = new int[4];
        for(char c : chars){
            if(c == 'C'){
                arr[0]++;
            }else if(c == 'H' && arr[0] > arr[1]){
                arr[1]++;
            }else if(c == 'E' && arr[1] > arr[2]){
                arr[2]++;
            }else if(c == 'F' && arr[2] > arr[3]){
                arr[3]++;
            }
        }
        System.out.println(arr[3]);
	}
}


//char[] charArray = sc.nextLine().toCharArray();
        //long cCount = IntStream.range(0, charArray.length).mapToObj(e -> charArray[e]).filter(e -> e.equals('C')).count();
        //long hCount = IntStream.range(0, charArray.length).mapToObj(e -> charArray[e]).filter(e -> e.equals('H')).count();
        //long eCount = IntStream.range(0, charArray.length).mapToObj(e -> charArray[e]).filter(e -> e.equals('E')).count();
        //long fCount = IntStream.range(0, charArray.length).mapToObj(e -> charArray[e]).filter(e -> e.equals('F')).count();
       //System.out.println(Math.min(cCount, Math.min(hCount, Math.min(eCount, fCount))));