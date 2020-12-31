/*

Today Chef wants to evaluate the dishes of his N students. He asks each one to cook a dish and present it to him.

Chef loves his secret ingredient, and only likes dishes with at least X grams of it. Given N, X and the amount of secret ingredient used by each student Ai, find out whether Chef will like at least one dish.

Input:
First line will contain T, number of testcases. Then the testcases follow.
The first line of each testcase contains two integers N (number of students) and X (minimum amount of secret ingredient that a dish must contain for Chef to like it).
The next line contains N space separated integers, Ai denoting the amount of secret ingredient used by the students in their dishes.
Output:
For each testcase, print a single string "YES" if Chef likes at least one dish. Otherwise, print "NO". (Without quotes).

Constraints:
1≤T≤100
1≤N≤1000
1≤X≤1000000
1≤Ai≤1000000
Sample Input:
    3
    5 100
    11 22 33 44 55
    5 50
    10 20 30 40 50
    5 45
    12 24 36 48 60
Sample Output:
    NO
    YES
    YES


*/
import java.util.*;
public class PCJ18A{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int noOfStudents = sc.nextInt();
			int minAmountOfIngredient = sc.nextInt();
			boolean flag = false;
			for(int i = 0; i < noOfStudents; i++){
				if(sc.nextInt() >= minAmountOfIngredient){
					flag = true;
				}
			}
			if(flag)
				answer.add("YES");
			else
				answer.add("NO");
		}
		answer.forEach(System.out::println);
	}
}