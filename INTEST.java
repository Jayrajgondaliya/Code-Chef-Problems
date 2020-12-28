// The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least 2.5MB of input data per second at runtime.
//
// Input
// The input begins with two positive integers n k (n, k<=107). The next n lines of input contain one positive integer ti, not greater than 109, each.
//
// Output
// Write a single integer to output, denoting how many integers ti are divisible by k.
//
// Example
// Input:
// 7 3
// 1
// 51
// 966369
// 7
// 9
// 999996
// 11
//
// Output:
// 4


import java.util.*;

public class INTEST{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		while(t-->0){
			if(sc.nextInt() % k == 0) count++;
		}
		System.out.println(count);
	}
}


//SOlution with BufferedReader - Because trick in this solutions is to handle 2.5 MB input per seconds and Scanner is relatively slow in Reading than Buffered Reader.


// import java.io.OutputStream;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.PrintWriter;
// import java.util.StringTokenizer;
// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.InputStream;
//
//
// // Remember that the class name should be "Main" and should be "public".
// public class Main {
// 	public static void main(String[] args) {
// 		// System.in and System.out are input and output streams, respectively.
// 		InputStream inputStream = System.in;
//
// 		InputReader in = new InputReader(inputStream);
//
// 		int n = in.nextInt();
// 		int k = in.nextInt();
//
// 		int ans = 0;
//
// 		for (int i = 0; i < n; i++) {
// 			int x = in.nextInt();
//
// 			if (x % k == 0) {
// 				ans++;
// 			}
// 		}
//
// 		System.out.println(ans);
// 	}
//
// 	static class InputReader {
// 		public BufferedReader reader;
// 		public StringTokenizer tokenizer;
//
// 		public InputReader(InputStream stream) {
// 			reader = new BufferedReader(new InputStreamReader(stream), 32768);
// 			tokenizer = null;
// 		}
//
// 		public String next() {
// 			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
// 				try {
// 				    tokenizer = new StringTokenizer(reader.readLine());
// 				} catch (IOException e) {
// 				    throw new RuntimeException(e);
// 				}
// 			}
// 			return tokenizer.nextToken();
// 		}
//
// 		public int nextInt() {
// 			return Integer.parseInt(next());
// 		}
// 	}
// }