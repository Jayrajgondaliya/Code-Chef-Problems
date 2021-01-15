//VCS


import java.util.*;
import java.util.stream.*;
public class VCS{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			sc.nextLine();
			Set<Integer> ignored = Stream.of(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toSet());
			Set<Integer> tracked = Stream.of(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e)).collect(Collectors.toSet());
			boolean trackedB = false,ignoredB = false;
			int a=0, b=0;
			for(int i = 1; i <= n; i++){
				ignoredB = ignored.contains(i);
				trackedB = tracked.contains(i);
				if(ignoredB && trackedB){
					a++;
				}
				if(!ignoredB && !trackedB){
					b++;
				}
			}
			answer.add(a+" "+b);
		}
		answer.forEach(System.out::println);
	}
}




// Seq 1 for ignored files
// Seq 2 for tracked files
// out put -> tracked and ignored, untracked and unignored