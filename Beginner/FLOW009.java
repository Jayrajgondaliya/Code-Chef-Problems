/*
While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
If the quantity and price per item are input, write a program to calculate the total expenses.

Input
The first line contains an integer T, total number of test cases. Then follow T lines, each line contains integers quantity and price.

Output
For each test case, output the total expenses while purchasing items, in a new line.

Constraints
1 ≤ T ≤ 1000
1 ≤ quantity,price ≤ 100000
Example
Input

3 
100 120
10 20
1200 20

Output

12000.000000
200.000000
21600.000000
*/

import java.util.*;
public class FLOW009{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Double> answer = new ArrayList<Double>();
		long quantity = 0;
		double price = 0.0f;
		while(t-->0){
			quantity = sc.nextLong();
			price = sc.nextDouble();
			if(quantity > 1000){
				answer.add(quantity * price * 0.9d);
			}else{
				answer.add(quantity * price);
			}
		}
		answer.forEach(e -> {
			System.out.println(String.format("%.6f", e));
		});
	}
}