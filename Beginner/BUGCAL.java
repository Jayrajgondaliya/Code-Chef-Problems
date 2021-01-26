//BUGCAL
/*
Trans bought a calculator at creatnx's store. Unfortunately, it is fake. It has many bugs. One of them is adding two numbers without carrying. Example expression: 12 + 9 will have result 11 in his calculator. Given an expression in the form a + b, please output result from that calculator.

 

Input
The first line contains an integer T denote the number of test cases. Each test case contains two integers a, b in a single line.

 

Output
Each test case, print answer in a single line.

 

Constraints
1 ≤ T ≤ 100
1 ≤ a, b ≤ 109
Subtasks:

Subtask #1 (30 points): 1 ≤ a, b ≤ 9
Subtask #2 (70 points): original constrains
 

Example
Input:
2
12 9
25 25

Output:
11
40

*/
import java.util.*;
public class BUGCAL{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long max = 0, min = 0;
            
            if(a >= b){
                max = a;
                min = b;
            }else{
                max = b;
                min = a;
            }

            List<Long> minList = new ArrayList<Long>();
            while(min != 0){
                minList.add(min % 10);
                min /= 10;
            }
            //minList.forEach(System.out::print);
            List<Long> maxList = new ArrayList<Long>(); 
            while(max != 0){
                maxList.add(max % 10);
                max /= 10;
            }
            List<Long> sum = new ArrayList<Long>();
            long temp=0;
            for(int i = 0; i < maxList.size(); i++){
                temp = maxList.get(i);
                if(i < minList.size()){
                    temp += minList.get(i);
                }
                //System.out.println(temp);
                sum.add(temp % 10);
                temp = 0;
            }
            
            StringBuilder sb = new StringBuilder("");
            for(int i = sum.size() - 1; i >= 0; i--){
                sb.append(sum.get(i));
            }
            answer.add(Long.parseLong(sb.toString()));
		}
		answer.forEach(System.out::println);
	}
}