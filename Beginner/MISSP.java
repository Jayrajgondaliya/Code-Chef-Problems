//MISSP
/*
Chef is fan of pairs and he likes all things that come in pairs. He even has a doll collection in which the dolls come in pairs. One day while going through his collection he found that there are odd number of dolls. Someone had stolen a doll!!!

Help chef find which type of doll is missing..

Input
The first line contains an integer T, the number of test cases.
The first line of each test case contains an integer N, the number of dolls.
The next N lines are the types of dolls that are left.
Output
For each test case, display the type of doll that doesn't have a pair, in a new line.

Constraints
1<=T<=10
1<=N<=100000 (10^5)
0<=type<=100000
Input:
1
3
1 
2
1


Output:
2


Input:
1
5
1
1
2
2
3
Output:
3
*/
import java.util.*;
public class MISSP
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			int n = sc.nextInt();
			Set<Integer> dolls = new HashSet<Integer>();
			int k;
			for(int i = 0; i < n; i++){
				k = sc.nextInt();
				if(dolls.contains(k)){
					dolls.remove(k);
				}else{
					dolls.add(k);
				}
			}
			
			answer.add(dolls.iterator().next());
		}
		answer.forEach(System.out::println);
	}
}

