//MOVIEWKN


import java.util.*;
public class MOVIEWKN

{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String length[] = sc.nextLine().split(" ");
            String ratting[] = sc.nextLine().split(" ");
            int ans = 0, maxLR = 0, preR = 0, l, r;
            for(int i =0;i<n;i++){
                l = Integer.parseInt(length[i]);
                r = Integer.parseInt(ratting[i]);
                if(maxLR < (l * r)){
                    maxLR = l * r;
                    preR = r;
                    ans = i;
                }else if(maxLR == (l*r)){
                    if(preR < r){
                        maxLR = l * r;
                        preR = r;
                        ans = i;
                    }
                }
            }
            answer.add(ans+1);
		}
		answer.forEach(System.out::println);
	}
}

