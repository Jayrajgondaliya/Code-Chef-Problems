//ADACRA
/*
Ada has an array of N crayons, some crayons are pointing upwards and some downwards. Ada thinks that an array of crayons is beautiful if all the crayons are pointing in the same direction.

In one step you can flip any segment of consecutive crayons. After flipping a segment, all crayons pointing downwards will point upwards and visceversa

What is the minimum number of steps to make the array of crayons beautiful?

Input
The first line of the input contains T the number of test cases. Each test case is described in one line containing a string S of N characters, the i-th character is 'U' if the i-th crayon is pointing upwards and 'D' if it is pointing downwards.

Output
For each test case, output a single line containing the minimum number of flips needed to make all crayons point to the same direction.

Constraints
1 ≤ T ≤ 3000
1 ≤ N ≤ 50
Example
Input:
1
UUDDDUUU

Output:
1
Explanation
Example case 1. In one step we can flip all the crayons pointing downwards


*/
import java.util.*;
public class ADACRA{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        sc.nextLine();
		while(t-->0){
            char[] chr = sc.nextLine().toCharArray();
            int u = 0, d = 0;
            char pre = chr[0];
            if(chr[0] == 'U') u++;
            else d++; 
            for(int i = 0; i < chr.length; i++){
                if(chr[i] != pre){
                    if(chr[i] == 'U') u++;
                    else d++;
                }
                pre = chr[i];
            }
            int ans = u > d ? d : u;
            answer.add(ans);
		}
		answer.forEach(System.out::println);
	}
}