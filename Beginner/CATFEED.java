// /CATFEED

/*
Chef owns N cats (numbered 1 through N) and he wants to feed them. There are M identical cans of cat food; each can must be used to feed exactly one cat and Chef can only feed one cat at a time. Chef wrote down the order in which he wants to feed the cats: a sequence A1,A2,…,AM.

An order of feeding cats is fair if there is no moment where Chef feeds a cat that has already been fed strictly more times than some other cat. Help Chef — tell him if the order in which he wants to feed the cats is fair.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and M.
The second line contains M space-separated integers A1,A2,…,AM.
Output
For each test case, print a single line containing the string "YES" if the order is fair or "NO" if it is unfair.

Constraints
1≤T≤100
2≤N≤100
1≤M≤103
Subtasks
Subtask #1 (100 points): original constraints

Example Input
7
3 9
1 2 3 1 2 3 1 2 3
3 9
1 2 3 3 2 1 1 2 3
3 5
2 3 1 1 2
3 6
2 1 1 3 2 3
2 8
1 2 1 2 1 2 1 1
5 3
5 3 1
4 5
1 2 3 1 4
Example Output
YES
YES
YES
NO
NO
YES
NO
Explanation
Example case 4: Cat 1 will eat twice before cat 3 eats even once, so the order is unfair.

Example case 5: The order is unfair because cat 1 will eat its fifth can before cat 2 eats its fourth can.

Example case 7: The order is unfair because cat 1 will eat twice before cat 4 eats even once.
*/

import java.util.*;
public class CATFEED{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
            int m = sc.nextInt();
            int round = 0;
            int arr[] = new int[n];
            int feedOrder[] = new int[m];
            for(int i = 0; i < m; i++){
                feedOrder[i] = sc.nextInt();
            }

            boolean flag = true;
            for(int i = 0; i < m; i++){
                if((arr[feedOrder[i] - 1] + 1) == round){
                    arr[feedOrder[i] - 1] = arr[feedOrder[i] - 1] + 1;
                }else{
                    if(checkForNextRound(arr)){
                        round++;
                        arr[feedOrder[i] - 1] = arr[feedOrder[i] - 1] + 1;
                    }else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                answer.add("YES");
            }else{
                answer.add("NO");
            }
		}
		answer.forEach(System.out::println);
	}

    private static boolean checkForNextRound(int[] arr){
        int i = arr[0];
        boolean flag = true;
        for(int j = 0; j < arr.length; j++){
            if(i != arr[j]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
