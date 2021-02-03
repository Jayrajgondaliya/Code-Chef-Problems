//LOSTMAX
/*
The Chef had a box with N numbers arranged inside it: A1, A2, ..., AN. He also had the number N at the front, so that he knows how many numbers are in it. That is, the box actually contains N+1 numbers. But in his excitement due the ongoing IOI, he started dancing with the box in his pocket, and the N+1 numbers got jumbled up. So now, he no longer knows which of the N+1 numbers is N, and which the actual numbers are.

He wants to find the largest of the N numbers. Help him find this.

Input
The first line of the input contains an integer T, denoting the number of test cases. The description of each testcase follows.
Each of the next T lines will contain N and N numbers, but it is not guaranteed that N is the first number.
Output
For each test case, output a single line containing the maximum value of the N numbers in that testcase.

Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 50
1 ≤ Ai ≤ 109
Example
Input:
3
1 2 1
3 1 2 8
1 5 1 4 3 2

Output:
1
8
4
Explanation
Test case 1:

N = 2 and the numbers are {1, 1}. The maximum among these 2 numbers is 1, and hence the output is 1.

Test case 2:

N = 3 and the numbers are {1, 2, 8}. The maximum among these 3 numbers is 8, and hence the output is 8.

Test case 3:

N = 5 and the numbers are {1, 1, 4, 3, 2}. The maximum among these 5 numbers is 4, and hence the output is 4.



*/
import java.util.*;
import java.util.stream.*;
public class LOSTMAX
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            String arr[] = sc.nextLine().split(" ");
            int n = arr.length - 1;
            //List<Integer> list = IntStream.range(1, arr.length).mapToObj(s -> Integer.valueOf(arr[s])).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<String> list2 = Arrays.stream(arr).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            if(Integer.valueOf(list2.get(0)) == n){
                answer.add(list2.get(1));
            }else{
                answer.add(list2.get(0));
            }
		}
		answer.forEach(System.out::println);
	}
}