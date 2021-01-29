//CHFCHK

/**/


import java.util.*;
public class CHFCHK{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String[] str = sc.nextLine().split(" ");
            int min = Integer.parseInt(str[0]), temp = 0;
            for(String s : str){
                temp = Integer.parseInt(s);
                if(temp < min){
                    min = temp;
                }
            }
            answer.add(min);
		}
		answer.forEach(System.out::println);
	}
}



