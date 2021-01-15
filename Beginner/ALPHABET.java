//ALPHABET
/*Not everyone probably knows that Chef has younder brother Jeff. Currently Jeff learns to read.

He knows some subset of the letter of Latin alphabet. In order to help Jeff to study, Chef gave him a book with the text consisting of N words. Jeff can read a word iff it consists only of the letters he knows.

Now Chef is curious about which words his brother will be able to read, and which are not. Please help him!

Input
The first line of the input contains a lowercase Latin letter string S, consisting of the letters Jeff can read. Every letter will appear in S no more than once.

The second line of the input contains an integer N denoting the number of words in the book.

Each of the following N lines contains a single lowecase Latin letter string Wi, denoting the ith word in the book.

Output
For each of the words, output "Yes" (without quotes) in case Jeff can read it, and "No" (without quotes) otherwise.

Constraints
1 ≤ |S| ≤ 26
1 ≤ N ≤ 1000
1 ≤ |Wi| ≤ 12
Each letter will appear in S no more than once.
S, Wi consist only of lowercase Latin letters.
Subtasks
Subtask #1 (31 point): |S| = 1, i.e. Jeff knows only one letter.
Subtask #2 (69 point) : no additional constraints
Example
Input:
act
2
cat
dog

Output:
Yes
No
Explanation
The first word can be read.

*/

import java.util.*;
public class ALPHABET{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> answer = new ArrayList<String>();
		
		char[] charArray = sc.nextLine().toCharArray();
		Set<Character> subSet = new HashSet<Character>();
		for(char c : charArray){
			subSet.add(c);
		}
		int n = sc.nextInt();
		sc.nextLine();
		String word;
		boolean flag;
		for(int i = 0; i < n; i++){
			word = sc.nextLine();
			flag = true;
			for(char c : word.toCharArray()){
				if(!subSet.contains(c)){
					flag = false;
					break;
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

