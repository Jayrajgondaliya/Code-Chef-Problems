//MAX2

/*

Given a binary number (of N bits) X. Find the highest power of 2 that divides this number.

Note: If the binary number is "100" then the highest power of 2 that divides it is 2 (as 22 = 4)
Input:
The first line contains N the number of bits in the number
The next line contains a binary number of N bits
Output:
The first and only line contains the max power of 2 that divides the given number
Constraints:
1≤N≤105
1≤X
Sample Input:
5
10100
Sample Output:
2*/




import java.util.*;
public class MAX2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seq = sc.next();
        int temp = 0;
        for(int i = n-1; i >= 0; i--){
            if(seq.charAt(i) == '1'){
                temp = n - i - 1;
                break;
            }
        }
        System.out.println(temp);
	}
}

