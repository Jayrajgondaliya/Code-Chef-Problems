/*
Chef lives in a huge apartment building with N floors, numbered 0 (ground floor) through N (terrace). Unfortunately, it has only one lift. We say that when the lift travels from a floor a to a floor b, it travels |b−a| floors.

Initially, the lift is on the ground floor. Then, it receives Q requests (numbered 1 through Q). For each valid i, the i-th request is for the lift to move from its current floor to a source floor fi, where some people enter the lift, and then move to a destination floor di, where they exit the lift. The lift should not stop anywhere in between moving to the floor fi or from the floor fi to the floor di. The lift must serve the requests sequentially, i.e. completely fulfill request 1, then request 2 and so on. The lift does not move anywhere after serving the final request.

Find the total number of floors the lift needs to travel to fulfill all the requests.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains two space-separated integers N and Q.
The following Q lines describe requests. For each valid i, the i-th of these lines contains two space-separated integers fi and di.
Output
For each test case, print a single line containing one integer ― the total number of floors travelled by the lift.

Constraints
1≤T≤250
1≤N≤106
1≤Q≤105
0≤fi,di≤N for each valid i
fi≠di for each valid i
the sum of Q over all test cases does not exceed 105
Example Input
1
2 3
1 2
0 1
1 0
Example Output
6
Explanation
Example case 1: The lift travels 2 floors up to serve the first request, 3 floors (2 down, then 1 up) to serve the second request and 1 floor down to serve the third request. Note that in this case, the lift returned to the ground floor, but it may end up at any floor.

*/



import java.util.*;
import java.lang.Math;
public class LIFTME{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            long totalCount = 0;
            long current = 0, s = 0, d = 0;
            for(int i = 0; i < q; i++){
                s = sc.nextInt();
                d = sc.nextInt();
                totalCount += Math.abs(current - s);
                current = s;
                totalCount += Math.abs(current - d);
                current = d;
            }
            answer.add(totalCount);
		}
		answer.forEach(System.out::println);
	}
}

