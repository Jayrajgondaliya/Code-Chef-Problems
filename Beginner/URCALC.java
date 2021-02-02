//URCALC
/*
Write a program to obtain 2 numbers ( A and B ) and an arithmetic operator (C) and then design a calculator depending upon the operator entered by the user.

So for example if C="+", you have to sum the two numbers.

If C="-", you have to subtract the two numbers.

If C=" * ", you have to print the product.

If C=" / ", you have to divide the two numbers.

Input:
First line will contain the first number A.
Second line will contain the second number B.
Third line will contain the operator C, that is to be performed on A and B.
Output:
Output a single line containing the answer, obtained by, performing the operator on the numbers. Your output will be considered to be correct if the difference between your output and the actual answer is not more than 10−6.

Constraints
−1000≤A≤1000
−1000≤B≤1000 and B≠0
C can only be one of these 4 operators {" + ", " - ", " * ", " / "}
Sample Input:
8
2
/
Sample Output:
4.0
Sample Input:
5
3
+
Sample Output:
8

*/
import java.util.*;
public class URCALC{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        char cc = sc.nextLine().charAt(0);
        if(cc == '+'){
            System.out.println(a + b);
        }else if(cc == '-'){
            System.out.println(a - b);
        }else  if(cc == '*'){
            System.out.println(a * b);
        }else  if(cc == '/'){
            System.out.println((a*1.0d) / b);
        }
	}
}

