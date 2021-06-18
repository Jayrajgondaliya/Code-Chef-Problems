package com.jayrajgondaliya;

import java.util.*;
import java.util.Scanner;

public class CHRL4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] streets = new int[n];
		for(int i = 0; i < n; i++){
			streets[i] = sc.nextInt();
		}
		int current = 0;
		long answer = streets[n-1];
		Map<Integer, Integer> path = new HashMap<Integer, Integer>();
		
		while(current != n-1){
			int diff = streets[n-1] - streets[current];
			if(diff >= 1 && diff <= k){
				path.put(current, n-1);
				current = n-1;
			}else{
				for(int i = current + 1; i < n; i++){
					diff = streets[i] - streets[current];
					if(diff >= 1 && diff <= k){
						path.put(current, i);
						current = i;
						break;
					}
				}
			}
		}
		
		for(Integer num : path.keySet()){
			answer *= streets[num];
		}
		
		System.out.println(answer % 1000000007L);

	}

}
