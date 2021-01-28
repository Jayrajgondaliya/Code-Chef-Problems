//MDL
/*

You are given a sequence A1,A2,…,AN of distinct integers. While the sequence contains at least three elements, look at its first three elements, find the median among these elements and delete it. What will the final sequence be?

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing K space-separated integers, where K is the length of the final sequence. For each valid i, the i-th of these integers should be the i-th element of the final sequence.
Constraints
1≤T≤74
3≤N≤19
1≤Ai≤109 for each valid i
Example Input
2
3
2 5 3
10
38 9 102 10 96 7 46 28 88 13
Example Output
2 5 
102 7 
Explanation
Example case 1: We remove the element 3 because it is the median of (2,5,3). The final sequence is (2,5).
*/
import java.util.*;
import java.util.stream.*;
public class MDL{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String[] str = sc.nextLine().split(" ");
            List<Integer> list = new ArrayList<Integer>();
            for(String s : str){
                list.add(Integer.parseInt(s));
            }
            int a, b, c;
            while(list.size() >= 3){
                a = list.get(0);
                b = list.get(1);
                c = list.get(2);
                if(a > b){
                    if(b > c){
                        list.remove(1);
                    }else if(a > c){
                        list.remove(2);
                    }else{
                        list.remove(0);
                    }
                }else{
                    if(a > c){
                        list.remove(0);
                    }else if(b > c){
                        list.remove(2);
                    }else{
                        list.remove(1);
                    }
                }
            }
            answer.add(list.get(0)+" "+list.get(1));
		}
		answer.forEach(System.out::println);
	}
}