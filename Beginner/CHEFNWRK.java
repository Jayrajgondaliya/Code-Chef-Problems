//CHEFNWRK

/*
Chef has N small boxes arranged on a line from 1 to N. For each valid i, the weight of the i-th box is Wi. Chef wants to bring them to his home, which is at the position 0. He can hold any number of boxes at the same time; however, the total weight of the boxes he's holding must not exceed K at any time, and he can only pick the ith box if all the boxes between Chef's home and the ith box have been either moved or picked up in this trip.

Therefore, Chef will pick up boxes and carry them home in one or more round trips. Find the smallest number of round trips he needs or determine that he cannot bring all boxes home.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and K.
The second line contains N space-separated integers W1,W2,…,WN.
Output
For each test case, print a single line containing one integer ― the smallest number of round trips or −1 if it is impossible for Chef to bring all boxes home.

Constraints
1≤T≤100
1≤N,K≤103
1≤Wi≤103 for each valid i
Example Input
4
1 1 
2
2 4
1 1
3 6
3 4 2
3 6
3 4 3
Example Output
-1
1
2
3
Explanation
Example case 1: Since the weight of the box higher than K, Chef can not carry that box home in any number of the round trip.

Example case 2: Since the sum of weights of both boxes is less than K, Chef can carry them home in one round trip.

Example case 3: In the first round trip, Chef can only pick up the box at position 1. In the second round trip, he can pick up both remaining boxes at positions 2 and 3.

Example case 4: Chef can only carry one box at a time, so three round trips are required.
*/
import java.util.*;
public class CHEFNWRK{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int total = 0;
            int temp = 0;
            for(int i = 0; i < n;){
                if(temp == 0 && arr[i] > k){
                    total = -1;
                    break;
                }else{
                    temp += arr[i];
                }  
                if(temp < k){
                    i++;
                }else{
                    total++;
                    if(temp == k) i++;
                    //i--;
                    temp = 0;
                }
            }
            if(temp > 0) total++;
            answer.add(total);
		}
		answer.forEach(System.out::println);
	}
}
