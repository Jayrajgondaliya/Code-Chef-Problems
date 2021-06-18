//TEAMNAME

/*

Сhef has assembled a football team! Now he needs to choose a name for his team. There are N words in English that Chef considers funny. These words are s1,s2,…,sN.

Chef thinks that a good team name should consist of two words such that they are not funny, but if we swap the first letters in them, the resulting words are funny. Note that under the given constraints, this means that a word is a non-empty string containing only lowercase English letters.

Can you tell Chef how many good team names there are?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated strings s1,s2,…,sN.
Output
For each test case, print a single line containing one integer — the number of ways to choose a good team name.

Constraints
1≤T≤100
2≤N≤2⋅104
2≤|si|≤20 for each valid i
s1,s2,…,sN contain only lowercase English letters
s1,s2,…,sN are pairwise distinct
the sum of N over all test cases does not exceed 2⋅104
Subtasks
Subtask #1 (20 points): s1,s2,…,sN contain only letters 'a' and 'b'

Subtask #2 (80 points): original constraints

Example Input
3
2
suf mas
3
good game guys
4
hell bell best test
Example Output
2
0
2
Explanation
Example case 1: The good team names are ("muf", "sas") and ("sas", "muf").

Example case 2: There are no good team names because all funny words start with 'g'.

Example case 3: The good team names are ("hest", "tell") and ("tell", "hest").

*/

import java.util.*;
import java.util.stream.*;
public class TEAMNAME{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
            sc.nextLine();
            String[] arrStr = sc.nextLine().split(" ");
            Arrays.sort(arrStr);
            Map<String, Set<Character>> mapOfPrefix = Arrays.stream(arrStr).collect(Collectors.groupingBy(e -> e.substring(1), Collectors.mapping(e -> e.charAt(0), Collectors.toSet())));
            //Set<String> set = new TreeSet<String>(Arrays.asList(arrStr));
            int totalCount = 0;
            for(Map.Entry<String, Set<Character>> entry1 : mapOfPrefix.entrySet()){
                for(Map.Entry<String, Set<Character>> entry2 : mapOfPrefix.entrySet()){
                    if(!entry1.getKey().equals(entry2.getKey())){
                        int noOfCommonPrefix = getCommonPrefix(entry1.getValue(), entry2.getValue());
                        totalCount += (entry1.getValue().size() - noOfCommonPrefix) * (entry2.getValue().size() - noOfCommonPrefix);
                    }
                }
            }
            System.out.println(totalCount);
		}
	}

    public static int getCommonPrefix(Set<Character> set1, Set<Character> set2){
        int count = 0;
        for(Character c : set1){
            if(set2.contains(c)) count++;
        }
        return count;
    }

}




  // for(int i = 0; i < n-1; i++){
            //     for(int j = n-1; j > i; j--){
            //         if(arrStr[j].charAt(0) != arrStr[i].charAt(0)){
            //             if(!set.contains(arrStr[j].substring(0,1).concat(arrStr[i].substring(1,arrStr[i].length())))
            //                 && !set.contains(arrStr[i].substring(0,1).concat(arrStr[j].substring(1,arrStr[j].length())))){
            //                 totalCount+=2;
            //             }
            //         }else{
            //             break;
            //         }
            //     }
            // }