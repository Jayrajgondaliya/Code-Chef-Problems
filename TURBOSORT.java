// Given the list of numbers, you are to sort them in non decreasing order.

// Input
// t – the number of numbers in list, then t lines follow [t <= 10^6].
// Each line contains one integer: N [0 <= N <= 10^6]
//
// Output
// Output given numbers in non decreasing order.
// Example
// Input:
//
// 5
// 5
// 3
// 6
// 7
// 1
// Output:
//
// 1
// 3
// 5
// 6
// 7


// Implementation using MergeSort Algorithm. - Worst case - Time Complexity - nLog(n)
import java.util.Scanner;

public class TURBOSORT{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int numberOfElements = sc.nextInt();
		int[] arr = new int[numberOfElements];
		
		for(int i = 0; i < numberOfElements; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		mergeSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	private static void mergeSort(int[] arr){
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length - 1);
	}
	
	private static void mergeSort(int[] arr, int[] temp, int start, int end){
		int leftStart = start;
		int leftEnd = (start + end)/2;
		int rightStart = leftEnd+1;
		int rightEnd = end;
		if(start < end){
			mergeSort(arr, temp, leftStart, leftEnd);
			mergeSort(arr, temp, rightStart, rightEnd);
		int i = leftStart;
		while(i <= rightEnd){
			if(rightStart > rightEnd){
				temp[i] = arr[leftStart];
				leftStart++;
			}else if(leftStart > leftEnd){
				temp[i] = arr[rightStart];
				rightStart++;
			}else{
				if(arr[leftStart] <= arr[rightStart]){
					temp[i] = arr[leftStart];
					leftStart++;
				}else if(arr[leftStart] > arr[rightStart]){
					temp[i] = arr[rightStart];
					rightStart++;
				}
			}
			i++;
		}
		for(int x = start; x <= end; x++){
			arr[x] = temp[x];
		}
		}	
	}
}