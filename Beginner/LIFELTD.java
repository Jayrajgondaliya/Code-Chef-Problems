//LIFELTD

/*

Recently the company Life Ltd created a new logo for themselves. You are asked to test the design of the logo.

The logo is a 3 * 3 square grid with 9 cells. Each cell contains some lower case english letter. This logo will be considered good if there exist three cells in the shape of an L that contain the letter 'l' (lower case 'L') in each of them. That is, there should be a cell with 'l', its cell directly beneath it should also have 'l' and the cell to the right of the second cell should also have 'l'.

Your task is to tell whether the logo is good or not.

Input
The first line of the input contains an integer T denoting the number of test cases. The description of the test cases follows.
Each of the next three lines contains a description of the logo, i-th of the line contains three characters which denote the i-th row of the logo.
Output
For each test case, output yes or no according to the answer to the problem.

Constraints
1≤T≤100
Example Input
3
laz
lla
aaa
ala
lla
aaa
lll
lll
lll
Example Output
yes
no
yes
Explanation:
Testcase1: The L shaped cells with 'l' in each of them is shown in bold here:

laa

lla

aaa

*/


import java.util.*;
public class LIFELTD{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        ArrayList<String> answer = new ArrayList<String>();
        sc.nextLine();
		while(t-->0){
            char[][] chars = new char[3][3];
            String temp;
            for(int i = 0; i < 3; i++){
                temp = sc.nextLine();
                for(int j = 0; j < 3; j++){
                    chars[i][j] = temp.charAt(j);
                }
            }
            boolean ans = false;
            for(int i = 0; i < 2;i++){
                for(int j = 0; j < 2; j++){
                    if(chars[i][j] == 'l'){
                        //if(i < 2 && j < 2){
                            if(chars[i+1][j] == 'l' && chars[i+1][j+1] == 'l') {
                                ans = true;
                                break;
                            }
                        //}
                    }
                }
            }
            if(ans) answer.add("yes");
            else answer.add("no");
		}
		answer.forEach(System.out::println);
	}
}
