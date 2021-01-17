//CHEFSQ
/*
Chef has a sequence of N integers, A1,A2,...,AN. He likes this sequence if it contains a subsequence of M integers, B1,B2,...,BM within it. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

You will be given a sequence of N integers, A1,A2,...,AN followed by another sequence of M integers, B1,B2,...,BM. Given these, you have to tell whether Chef likes the sequence of N integers(A1,A2,...,AN) or not.

Formally, output "Yes" if

∃idx1,idx2,...,idxM|1≤idx1<idx2<...<idxM≤N and Aidxi=Bi∀i,1≤i≤M
Otherwise output "No". Note that the quotes are for clarity.

Input
The first line contains a single integer, T.

T test cases follow where each test case contains four lines:

The first line of a test case contains a single integer N
The second line of the test case contains N space separated integers, A1,A2,...,AN
The third line of the test case contains a single integer M.
The fourth line contains M space separated integers, B1,B2,...,BM
Symbols have usual meanings as described in the statement.

Output
For each test case, output a single line containing the output. Output is "Yes" if Chef likes the sequence A. Output is "No" if Chef dislikes the sequence A.

Constraints
1≤T≤100
1≤N≤103
1≤M≤103
1≤Ai,Bi≤109
Sample Input
3
6
1 2 3 4 5 6
3
2 3 4
6
22 5 6 33 1 4
2
4 15
4
1 3 4 2
2
1 2
Sample Output
Yes
No
Yes
Explanation:
In sample test case 1, the sequence 1,2,3,4,5,6 contains the subsequence 2,3,4. The subsequence is present at indices 1,2,3 of the original sequence. Hence, 1,2,3,4,5,6 is a sequence which Chef likes it. Therefore, we output "Yes".

In sample test case 2, the subsequence 4,15 is not present in sequence 22,5,6,33,1,4. Hence, we output "No".

In sample test case 3, the sequence 1,3,4,2 contains the subsequence 1,2. The subsequence is present at indices 0,3. Therefore, we output "Yes".
*/

import java.util.*;
public class CHEFSQ
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String a[] = sc.nextLine().split(" ");
            int m = sc.nextInt();
            sc.nextLine();
            String b[] = sc.nextLine().split(" ");
            boolean flag = false;
            int j = 0;
            for(int i = 0; i < n; i++){
                if(a[i].equals(b[j])){
                    if(m == (j+1)) {
                    	flag = true;
                    	break;
                    }
                    j++;
                }
            }

            if(flag){
                answer.add("Yes");
            }else{
                answer.add("No");
            }
		}
		answer.forEach(System.out::println);
	}
}
