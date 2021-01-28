//FLOW015
/*

According to Gregorian Calendar, it was Monday on the date 01/01/2001. If any year is input,
Write a program to display what is the day on the 1st January of this year.

Input
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer year.

Output
For each test case, display the day on the 1st January of that year in lowercase letters, in a new line.

Constraints
1 ≤ T ≤ 1000
1900≤ year ≤5000
Example
Input

3 
1994
1991
2014

Output

saturday
tuesday
wednesday
*/


import java.util.*;
import java.lang.Math;
public class FLOW015{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<Integer, String> map = new HashMap<Integer, String>(){{
            put(0, "monday");
            put(1, "tuesday");
            put(2, "wednesday");
            put(3, "thursday");
            put(4, "friday");
            put(5, "saturday");
            put(6, "sunday");
        }};
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int year = sc.nextInt();
            int count = 0;
            int i = 2001;
            while(i != year){
               
                if(year < i)
                    i--;
                
                if(isLeap(i))
                    count += 2;
                else   
                    count++;
                
                if(year > i)
                    i++;
            }
            count = count % 7;
            if(year < 2001){
                count = (7 - count) % 7;
            }
            answer.add(map.get(count));
		}
		answer.forEach(System.out::println);
    }
    
    private static boolean isLeap(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else {
                return true;
            }
        }else{
            return false;
        }
    }
}