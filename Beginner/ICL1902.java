//ICL1902

import java.util.*;
public class ICL1902
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            int ans = 0;
            for(int i = 0; n > 0;i++){
                if(n == 1){
                    ans++;
                    break;
                }else{
                    if(n < (i+1)*(i+1)){
                        n -= (i * i);
                        ans++;
                        i = 0;
                    }
                }
            }
            answer.add(ans);
		}
		answer.forEach(System.out::println);
	}
}
