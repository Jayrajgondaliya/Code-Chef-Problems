package com.jayrajgondaliya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PLAIN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int k = sc.nextInt();
            for(int i = k+1; ;i++){
                if(isPalindrome(i)){
                    answer.add(i);
                    break;
                }
            }
		}
		answer.forEach(System.out::println);
    }
    
    public static boolean isPalindrome(int num){
        List<Integer> numArrayList = new ArrayList<Integer>();
        while(num > 0){
            numArrayList.add(num % 10);
            num /= 10;
            //System.out.println(num);
        }

        //numArrayList.forEach(System.out::println);
        boolean flag = true;
        for(int i = 0, j = numArrayList.size() - 1; i <= j; i++, j--){
            if(numArrayList.get(i) != numArrayList.get(j)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
