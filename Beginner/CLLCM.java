//CLLCM


/*

Chef got into a fight with the evil Dr Doof. Dr Doof has decided to destroy all even numbers from the universe using his Evil-Destroy-inator. Chef has N integers with him. To stop Doof, Chef has to find an odd number which is an integer multiple of all N numbers that he has with him. Find if it is possible for Chef to prevent Dr Doof from destroying the even numbers.

Formally, given N positive integers, find if there exists an odd number which is an integer multiple of all the given N numbers. If yes, print "YES", otherwise "NO". You can print any letter in any case.

Input
First line contains T, number of testcases. Each testcase consists of 2 lines.
The first line of each test case consists of a positive integer N, denoting the number of positive integers Chef has.
The second line of each test case contains N space separated integers Ai each denoting an integer that Chef has with him.
Output
For every test case, if there exists such an odd number, print "YES" on a separate line, otherwise "NO". The judge is case insensitive. That means, your code can print any letter in any case ( "Yes", "yes" or "YES" are all accepted).

Constraints
1≤T≤103
1≤N≤103
1≤Ai≤103
Sample Input
2
5
1 2 5 4 3
1
7
Sample Output
NO
YES
Explanation
For test 1: There exists no odd number.

For test 2: The possible odd numbers can be 7, 21, 49, 315, …

*/


import java.util.*;
public class CLLCM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 == 0 ){
                    flag = false;
                    break;
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
}
