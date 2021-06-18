package com.jayrajgondaliya;

import java.util.Scanner;

public class Repetition {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int max = 0;
		int temp = 0;
		char prev = 'Z';
		for (char c : str.toCharArray()) {
			System.out.println(c);
			if (prev != c) {
				prev = c;
				max = Math.max(max, temp);
				temp = 0;
			}
			temp++;
		}
		System.out.println(max);
	}
}
