//PALIN

/*
A positive integer is called a palindrome if its representation in the decimal system is the same when read from left to right and from right to left. For a given positive integer K of not more than 1000000 digits, write the value of the smallest palindrome larger than K to output. Numbers are always displayed without leading zeros.

Input
The first line contains integer t, the number of test cases. Followed by t lines containing integers K.

Output
For each K, output the smallest palindrome larger than K.

Example
Input:
2
808
2133
Output:
818
2222
*/


import java.util.*;
public class PALIN{
	public static void main(String args[]){
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
