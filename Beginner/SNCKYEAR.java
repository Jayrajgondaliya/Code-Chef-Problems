//SNCKYEAR
/*
Chef is interested in the history of SnackDown contests. He needs a program to verify if SnackDown was hosted in a given year.

SnackDown was hosted by CodeChef in the following years: 2010, 2015, 2016, 2017 and 2019.

Input
The first line contain the number of test-cases T.

The first line of each test-case contains a single integer N.

Output
For each test case print a single line containing the string "HOSTED" if SnackDown was hosted in year N or "NOT HOSTED" otherwise (without quotes).

Constraints
1≤T≤10
2010≤N≤2019
Example Input
2
2019
2018
Example Output
HOSTED
NOT HOSTED
*/

import java.util.*;
public class SNCKYEAR

{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			Set<Integer> years = new HashSet<Integer>(Arrays.asList(2010, 2015, 2016, 2017, 2019));
			if(years.contains(sc.nextInt())){
				answer.add("HOSTED");
			}else{
				answer.add("NOT HOSTED");
			}
		}
		answer.forEach(System.out::println);
	}
}
