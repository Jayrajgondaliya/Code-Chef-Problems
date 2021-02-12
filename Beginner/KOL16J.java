//KOL16J


import java.util.*;
public class KOL16J{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean flag = true;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > n) flag = false;
            }

            if(flag){
                boolean temp=false;
                for(int i = 0; i < n; i++){
                    if(arr[i] != (i+1)){
                        temp = true;
                        break;
                    }
                }
                flag = flag && temp;
            }

            if(flag){
                Set<Integer> tempset = new HashSet<Integer>();
                for(int i = 0; i < n; i++){
                    if(!tempset.add(arr[i])){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag){
                answer.add("yes");
            }else{
                answer.add("no");
            }

    	}
		answer.forEach(System.out::println);
	}
}
