//CATSDOGS
/*
Chef is a farmer and a pet lover. He has a lot of his favorite pets cats and dogs in the barn. He knows that there are C cats and D dogs in the barn. Also, one day went to field and found that there were L legs of the animals touching the ground. Chef knows that cats love to ride on the dogs. So, they might ride on the dogs, and their legs won't touch the ground and Chef would miss counting their legs. Chef's dogs are strong enough to ride at max two cats on their back.

It was a cold foggy morning, when Chef did this counting. So he is now wondering whether he counted the legs properly or not. Specifically, he is wondering whether it is possible that he counted correctly. Please help Chef in finding it.

Input
First line of the input contains an integer T denoting number of test cases. T test cases follow.

The only line of each test case contains three space separated integers C, D, L denoting number of the cats, number of the dogs and number of legs of animals counted by Chef, respectively.

Output
For each test case, output a single line containing a string "yes" or "no" (both without quotes) according to the situation.

Constraints
1 ≤ T ≤ 105
0 ≤ C, D, L ≤ 109
Subtasks
Subtask #1 (20 points)

1 ≤ T ≤ 104
0 ≤ C, D ≤ 102
Subtask #2 (30 points)

1 ≤ T ≤ 105
0 ≤ C, D ≤ 103
Subtask #3 (50 points)

Original constraints
Example
Input:
3
1 1 8
1 1 4
1 1 2

Output:
yes
yes
no
Explanation
Example 1. There is one cat and one dog. The number of legs of these animals on the ground are 8, it can be possible when both cat and dog are standing on the ground.

Example 2. There is one cat and one dog. The number of legs of these animals on the ground are 4, it can be possible if the cat will ride on the dog, so its legs won't be counted by Chef, only the dog's legs will be counted.

Example 3. There is one cat and one dog. The number of legs of these animals are 2, it can not be true at all, Chef might have made some mistake. Hence answer is "no".
*/
import java.util.*;
public class CATSDOGS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            long c = sc.nextLong();
            long d = sc.nextLong();
            long l = sc.nextLong();
            long max = (c + d) * 4;
            long min = 0;
            if(c <= 2 * d){
                min = d * 4;
            }else{
                min = ((c - 2 * d) + d) * 4;
            }
            
            if(l % 4 == 0 && l <= max && l >= min){
                answer.add("yes");
            }else{
                answer.add("no");
            }
		}
		answer.forEach(System.out::println);
	}
}

