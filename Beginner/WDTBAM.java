//WDTBAM

/**/

import java.util.*;
public class WDTBAM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String correct = sc.nextLine();
            String chefs = sc.nextLine();
            int[] winnings = new int[n+1];
            //Arrays.sort(winnings);
            int count = 0;
            for(int i = 0; i < n+1; i++){
                winnings[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                if(chefs.charAt(i) == correct.charAt(i)){
                    count++;
                }
            }
            if(count == n){
                answer.add(winnings[count]);
            }else{
                int max = 0;
                for(int i = 0; i<= count; i++){
                    if(max < winnings[i]) max = winnings[i];
                }
                answer.add(max);
            }
            
		}
		answer.forEach(System.out::println);
	}
}