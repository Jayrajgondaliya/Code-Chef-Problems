package com.jayrajgondaliya;

import java.util.ArrayList;
import java.util.Scanner;

public class SNAKE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String steps = sc.nextLine();
            steps = steps.replaceAll("\\.", "");
            steps = steps.replaceAll("HT", "");
            System.out.println(steps);
            if(steps.length() > 0){
                answer.add("Invalid");
            }else{
                answer.add("Valid");
            }
		}
		answer.forEach(System.out::println);
	}

}
