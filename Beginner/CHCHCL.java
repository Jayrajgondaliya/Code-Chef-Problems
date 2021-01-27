//CHCHCL
/*


*/
import java.util.*;
public class CHCHCL{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 1 && m == 1){
                answer.add("Yes");
            }else{
                if(m % 2 != 0 && n % 2 != 0){
                    answer.add("No");
                }else{
                    answer.add("Yes");
                }
            }

		}
		answer.forEach(System.out::println);
	}
}