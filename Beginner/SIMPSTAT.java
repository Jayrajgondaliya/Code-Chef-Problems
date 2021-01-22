//SIMPSTAT
/*
Sergey has made N measurements. Now, he wants to know the average value of the measurements made.

In order to make the average value a better representative of the measurements, before calculating the average, he wants first to remove the highest K and the lowest K measurements. After that, he will calculate the average value among the remaining N - 2K measurements.

Could you help Sergey to find the average value he will get after these manipulations?

Input
The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains two space-separated integers N and K denoting the number of measurements and the number of the greatest and the lowest values that will be removed.

The second line contains N space-separated integers A1, A2, ..., AN denoting the measurements.

Output
For each test case, output a single line containing the average value after removing K lowest and K greatest measurements.

Your answer will be considered correct, in case it has absolute or relative error, not exceeding 10-6.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 104
0 ≤ 2K < N
-106 ≤ Ai ≤ 106
Subtasks
Subtask #1 (50 points): K = 0
Subtask #2 (50 points): no additional constraints
Example
Input:
3
5 1
2 9 -10 25 1
5 0
2 9 -10 25 1
3 1
1 1 1

Output:
4.000000
5.400000
1.000000
Explanation
Example case 1. After removing 1 greatest and 1 lowest measurement, we get the set {2, 9, 1}. The average value in this set is (2+9+1)/3=4.

Example case 2. The average value in the set {2, 9, -10, 25, 1} is (2+9-10+25+1)/5=5.4.

Example case 3. After removing the 1 largest and smallest measurements, Sergey will be left with only one measurement, i.e. 1. Average of this is 1 itself.


*/

import java.util.*;
import java.util.stream.*;
public class SIMPSTAT
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Double> answer = new ArrayList<Double>();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			sc.nextLine();
			String[] arr = sc.nextLine().split(" ");
			List<Integer> list = IntStream.range(0, arr.length).mapToObj(i -> Integer.valueOf(arr[i]))
					.sorted().collect(Collectors.toList());
			List<Integer> finalList = new ArrayList<Integer>();
			for (int i = k; i <= (n - k - 1); i++) {
				finalList.add(list.get(i));
			}
			double sum = 0;
			for (Integer ii : finalList) {
				sum += ii;
			}
			//System.out.println(sum + " ::: " + finalList.size());
			answer.add(sum / finalList.size());
		}
		answer.forEach(System.out::println);
	}
}