//EGRANDR
/*

Andrash study in Uzhland National University. Now is the time of exam results. Andrash similar to other students, hopes that this scores in the exam could fetch him a scholarship/stipendium for his studies.

There are following simple rules to receive stipendium:

University follows 5 point grading system. In an exam, a student can receive any score from 2 to 5. 2 is called an F grade, meaning that student has failed that exam.
Student should not have fail any of the exams.
Student must obtain a full score in some of his/her exams to show that he/she is excellent in some of the subjects.
He/She must have a grade point average not less than 4.0
You are given information regarding the exams and how Andrash performed in those. Can you help him figure out whether he will receive the stipendium or not!!

Input
The first line of input contains a single integer T denoting the number of test cases. This will be followed by T test cases.

The first line of each test case contains an integer N denoting the number of examinations.

The next line of each test case contains N space separated integers denoting Andrash's score for each exam.

Output
For each of the T test cases, output a single line - "Yes" (without quotes) if Andrash will receive stipendium, or "No" (without quotes) - otherwise.

Constraints and Subtasks
1 ≤ T ≤ 40
Let A[i] denote Andrash's score for i-th exam

Subtask #1: 20 points
1 ≤ N ≤ 100
2 ≤ A[i] ≤ 5

Subtask #2: 20 points
1 ≤ N ≤ 105
3 ≤ A[i] ≤ 5

Subtask #3: 60 points
1 ≤ N ≤ 105
2 ≤ A[i] ≤ 5
Example
Input:
2
5
3 5 4 4 3
5
3 4 4 4 5

Output:
No
Yes
Explanation
Example case 1. Student's average grade point score is 3.8 which makes him/her unqualified for obtaining the stipend.

Example case 2. Student satisfies all the criteria for getting stipend.*/


import java.util.*;
public class EGRANDR{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            boolean failed = false, excellent = false, gpa = false;
            int n = sc.nextInt();
            int total = 0, temp = 0;
            for(int i = 0; i < n; i++){
                temp = sc.nextInt();
                if(temp == 2){
                    failed = true;
                }else if(!excellent && temp == 5){
                    excellent = true;
                }
                total += temp;
            }
            if((total / n) >= 4){
                gpa = true;
            }

            if(!failed && excellent && gpa){
                answer.add("Yes");
            }else{
                answer.add("No");
            }
		}
		answer.forEach(System.out::println);
	}
}

