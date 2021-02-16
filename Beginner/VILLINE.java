//VILLINE

/*
WW3 is near and Gru wants to recruit minions for his team. Gru went to the planet of minions to recruit minions, he saw that there are two villages separated by a river. He cannot recruit minions from both villages because then his team will have internal conflicts.

Gru is now in a dilemma about which village to recruit as he wants to have the strongest possible team.

You are given coordinates of houses on the planet. Each house has exactly one minion and his power is given. The planet of minion is considered as a 2-D plane and the river is denoted by a straight line ( y=mx+c ). Note: None of the houses are situated on the river.

Input:
First-line will contain N, number of houses.
Second-line will contain two integers, m and c denoting the river.
Next N lines will have exactly 3 integers X[i],Y[i],P[i] denoting the coordinates of houses and the power of minion in that house
Output:
Print the maximum power of the team which Gru can recruit.
Constraints
1≤N≤105
−104≤m,c≤104
−104≤X[i],Y[i]≤104
1≤P[i]≤104
Sample Input:
3
1 0
0 5 5
0 6 5
0 -8 20
Sample Output:
20

*/

import java.util.*;
public class VILLINE{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int c = sc.nextInt();
            int teamA = 0, teamB = 0;
            int x = 0, y = 0, p = 0, yi = 0;
            for(int i = 0; i < n; i++){
                x = sc.nextInt();
                y = sc.nextInt();
                p = sc.nextInt();
                yi = m * x + c;
                if(y < yi){
                    teamA += p;
                }else if(y > yi){
                    teamB += p;
                }
            }
            if(teamA > teamB) System.out.println(teamA);
            else System.out.println(teamB);
	}
}
