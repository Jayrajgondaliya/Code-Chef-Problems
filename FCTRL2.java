//Small factorials

// Input
// An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.
//
// Output
// For each integer n given at input, display a line with the value of n!
//
// Example
// Sample input:
// 4
// 1
// 2
// 5
// 3
// Sample output:
//
// 1
// 2
// 120
// 6


// Solution using array as storing mechanism - also we have used Dynamic programming concept to store previous results to process quickly.
// there are several efficient ways are also possible such as BigInteger.

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

public class FCTRL2 {
	private static Map<Integer, Integer[]> answerMap = new HashMap<Integer, Integer[]>() {
		{
			put(0, getBaseArr(0));
			put(1, getBaseArr(1));
		}
	};

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Integer numberOfInt = sc.nextInt();
		Integer arr[] = new Integer[numberOfInt];
		for (int i = 0; i < numberOfInt; i++) {
			arr[i] = sc.nextInt();
		}

		for (int num : arr) {
			factorial(num);
		}

		for (int i : arr) {
			StringBuilder sb = new StringBuilder("");
			Integer[] arrValue = answerMap.get(i);
			boolean check = true;
			int j = arrValue.length - 1;
			for (; j >= 0; j--) {
				if (check && (arrValue[j] == null || arrValue[j] == 0)) {
					continue;
				}
				check = false;
				sb.append(arrValue[j]);
			}
			System.out.println(sb.toString());
		}
	}

	private static void factorial(int n) {
		if (n > 1) {
			if (!answerMap.containsKey(n)) {
				int nearestValue = findNearestAlreadyCalculatedKey(n);
				answerMap.put(n, calculateFactorial(n, nearestValue));
			}
		}
	}

	private static Integer[] calculateFactorial(int n, int nearestValue) {
		Integer[] response = getBaseArr(0);
		System.arraycopy(answerMap.get(nearestValue), 0, response, 0, response.length);
		if (nearestValue < n) {
			while (n != nearestValue) {
				nearestValue++;
				int temp = 0;
				for (int i = 0; i < response.length; i++) {
					if (temp == 0 && response[i] == null) break;
					int val = response[i] != null ? response[i] : 0;
					temp = val * nearestValue + temp;
					response[i] = temp % 10;
					temp = temp / 10;
				}
			}
		} else if (nearestValue > n) {
			while (n != nearestValue) {
				divide(response, nearestValue);
				int temp = 0;
				for (int i = response.length - 1; i >= 0; i--) {
					if (temp == 0 && response[i] == null) continue;
					if (response[i] != null) {
						temp = response[i] + temp * 10;
						response[i] = temp / nearestValue;
						temp = temp % nearestValue;
					}
				}
				nearestValue--;
			}
		}

		return response;
	}
	private static int findNearestAlreadyCalculatedKey(int n) {
		int diff = n - 1;
		int nearestKey = 1;
		for (int i : answerMap.keySet()) {
			if (Math.abs(n - i) < diff) {
				diff = Math.abs(n - i);
				nearestKey = i;
			}
		}
		return nearestKey;
	}

	private static Integer[] getBaseArr(int n) {
		Integer[] baseArr = new Integer[200];
		int index = 0;
		while (n > 0) {
			baseArr[index] = n % 10;
			n /= 10;
			index++;
		}
		return baseArr;
	}
}


// Using BigIntegers - we can achieve same thing that we did here with array.
			//             int n = sc.nextInt();
			//             BigInteger f = new BigInteger("1");
			//             for (int i = 2; i <= n; i++) {
			// 	f = f.multiply(BigInteger.valueOf(i));
			// }
