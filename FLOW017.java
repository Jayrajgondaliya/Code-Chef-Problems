// Three numbers A, B and C are the inputs. Write a program to find second largest among them.
//
// Input
// The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.
//
// Output
// For each test case, display the second largest among A, B and C, in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// 1 ≤ A,B,C ≤ 1000000
// Example
// Input
// 3
// 120 11 400
// 10213 312 10
// 10 3 450
//
// Output
//
// 120
// 312
// 10


import java.util.*;

public class FLOW017{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
			int[] arr = new int[3];
			addValue(sc.nextInt(), arr);
			addValue(sc.nextInt(), arr);
			addValue(sc.nextInt(), arr);
			answer.add(arr[1]);
		}
		
		for(int i : answer){
			System.out.println(i);
		}
	}
	
	public static void addValue(int num, int[] arr){
		if(arr.length == 0){
			arr[0] = num;
		}else{
			int temp = num;
			for(int i = 0; i < arr.length; i++){
				if(arr[i] < num ){
					temp = arr[i];
					arr[i] = num;
					num = temp;
				}
			}
		}
	}
}

