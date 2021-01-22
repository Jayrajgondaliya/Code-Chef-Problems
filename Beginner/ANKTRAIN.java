//ANKTRAIN
/*
Rahul and Rashi are off to the wedding of a close relative. This time they have to travel without their guardians. Rahul got very interested in the arrangement of seats inside the train coach.

The entire coach could be viewed as an arrangement of consecutive blocks of size 8.


Berth Number   	Compartment

 1 -  8               1  
 9 - 16               2  
17 - 24               3  
... and so on
Each of these size-8 blocks are further arranged as:


 1LB,  2MB,  3UB,  4LB,  5MB,  6UB,  7SL,  8SU  
 9LB, 10MB, ...
 ...   
 ...
Here LB denotes lower berth, MB middle berth and UB upper berth.
The following berths are called Train-Partners:


3UB   |  6UB  
2MB   |  5MB  
1LB   |  4LB  
7SL   |  8SU  
and the pattern is repeated for every set of 8 berths.

Rahul and Rashi are playing this game of finding the train partner of each berth. Can you write a program to do the same?

Input
The first line of input contains a single integer T, denoting the number of test cases to follow.

Each of the next T lines contain a single integer N, the berth number whose neighbor is to be found out.

Output
The output should contain exactly T lines each containing the berth of the neighbor of the corresponding seat.

Constraints
Subtasks
Subtask #1 (50 points):

1 ≤ T ≤ 8
1 ≤ N ≤ 8
Subtask #2 (50 points):

1 ≤ T ≤ 100
1 ≤ N ≤ 500
Example
Input:
3
1
5
3

Output:
4LB
2MB
6UB

*/
import java.util.*;
public class ANKTRAIN{
	public static void main(String args[]) {
		Map<Integer, String> seatMap = new HashMap<Integer, String>() {
			{
				put(1, "LB");
				put(2, "MB");
				put(3, "UB");
				put(4, "LB");
				put(5, "MB");
				put(6, "UB");
				put(7, "SU");
				put(8, "SL");
			}
		};
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		int seat = 0, mod = 0, neighbor= 0;
		while (t --> 0) {
            seat = sc.nextInt();
            mod = seat % 8;
            if(mod == 0 || mod == 7){
                if(mod == 0) {
                    neighbor = seat - 1;
                    mod = 8;
                }
                else {
                    neighbor = seat + 1;
                }
            }else{
                if(mod <= 3){
                    neighbor = seat + 3;
                }else if(mod > 3){
                    neighbor= seat - 3;
                }
            }
            answer.add(neighbor+seatMap.get(mod));
		}
		answer.forEach(System.out::println);
	}
}