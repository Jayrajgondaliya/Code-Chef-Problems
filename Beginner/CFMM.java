//CFMM

/*

Today, Chef decided to cook some delicious meals from the ingredients in his kitchen. There are N ingredients, represented by strings S1,S2,…,SN. Chef took all the ingredients, put them into a cauldron and mixed them up.

In the cauldron, the letters of the strings representing the ingredients completely mixed, so each letter appears in the cauldron as many times as it appeared in all the strings in total; now, any number of times, Chef can take one letter out of the cauldron (if this letter appears in the cauldron multiple times, it can be taken out that many times) and use it in a meal. A complete meal is the string "codechef". Help Chef find the maximum number of complete meals he can make!

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
N lines follow. For each i (1≤i≤N), the i-th of these lines contains a single string Si.
Output
For each test case, print a single line containing one integer — the maximum number of complete meals Chef can create.

Constraints
1≤T≤100
1≤N≤100
|S1|+|S2|+…+|SN|≤1,000
each string contains only lowercase English letters
Example Input
3
6
cplusplus
oscar
deck
fee
hat
near
5
code
hacker
chef
chaby
dumbofe
5
codechef
chefcode
fehcedoc
cceeohfd
codechef
Example Output
1
2
5
Explanation
Example case 1: After mixing, the cauldron contains the letter 'c' 3 times, the letter 'e' 4 times, and each of the letters 'o', 'd', 'h' and 'f' once. Clearly, this is only enough for one "codechef" meal.

Example case 2: After mixing, the cauldron contains the letter 'c' 4 times, 'o' 2 times, 'd' 2 times, 'e' 4 times, 'h' 3 times and 'f' 2 times, which is enough to make 2 meals.*/



import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.lang.Math;
public class CFMM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i< n; i++){
                sb.append(sc.next());
            }
            char[]  charArray = sb.toString().toCharArray();
            Map<Character, Long> charMap = IntStream.range(0, charArray.length).mapToObj(e -> (Character) charArray[e]).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            long c = charMap.containsKey('c') ? charMap.get('c')/2:0;
            long e = charMap.containsKey('e') ? charMap.get('e')/2:0;
            long o = charMap.containsKey('o') ? charMap.get('o'):0;
            long d = charMap.containsKey('d') ? charMap.get('d'):0;
            long h = charMap.containsKey('h') ? charMap.get('h'):0;
            long f = charMap.containsKey('f') ? charMap.get('f'):0;
            
            long ans = Math.min(c, 
                       Math.min(e, 
                       Math.min(o, 
                       Math.min(d,
                       Math.min(h, f)))));
            answer.add(ans);
		}
		answer.forEach(System.out::println);
	}
}