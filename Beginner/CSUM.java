//CSUM


import java.util.*;
public class CSUM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag  = false;
            int i = 0, j = n-1;
            while(i < j){
                if((arr[i] + arr[j]) == k){
                    flag = true;
                    break;
                }else if((arr[i] + arr[j]) > k){
                    j--;
                }else{
                    i++;
                }
            }
            if(flag){
                answer.add("Yes");
            }else{
                answer.add("No");
            }
		}
		answer.forEach(System.out::println);
	}
}
