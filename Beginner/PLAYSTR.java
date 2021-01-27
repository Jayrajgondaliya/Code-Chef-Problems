//PLAYSTR
/*
Chef usually likes to play cricket, but now, he is bored of playing it too much, so he is trying new games with strings. Chef's friend Dustin gave him binary strings S and R, each with length N, and told him to make them identical. However, unlike Dustin, Chef does not have any superpower and Dustin lets Chef perform only operations of one type: choose any pair of integers (i,j) such that 1≤i,j≤N and swap the i-th and j-th character of S. He may perform any number of operations (including zero).

For Chef, this is much harder than cricket and he is asking for your help. Tell him whether it is possible to change the string S to the target string R only using operations of the given type.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains a binary string S.
The third line contains a binary string R.
Output
For each test case, print a single line containing the string "YES" if it is possible to change S to R or "NO" if it is impossible (without quotes).

Constraints
1≤T≤400
1≤N≤100
|S|=|R|=N
S and R will consist of only '1' and '0'
Example Input
2
5
11000
01001
3
110
001
Example Output
YES
NO
Explanation
Example case 1: Chef can perform one operation with (i,j)=(1,5). Then, S will be "01001", which is equal to R.

Example case 2: There is no sequence of operations which would make S equal to R.


*/


import java.util.*;
public class PLAYSTR{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String r = sc.nextLine();
            int sZeros = 0, sOnes = 0, rZeros = 0, rOnes = 0;
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    sOnes++;
                }else if(s.charAt(i) == '0'){
                    sZeros++;
                }
                if(r.charAt(i) == '1'){
                    rOnes++;
                }else if(r.charAt(i) == '0'){
                    rZeros++;
                }
            }
            if(sZeros == rZeros && sOnes == rOnes){
                answer.add("YES");
            }else{
                answer.add("NO");
            }
		}
		answer.forEach(System.out::println);
	}
}