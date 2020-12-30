/*
The chef has a recipe he wishes to use for his guests, but the recipe will make far more food than he can serve to the guests. The chef therefore would like to make a reduced version of the recipe which has the same ratios of ingredients, but makes less food. The chef, however, does not like fractions. The original recipe contains only whole numbers of ingredients, and the chef wants the reduced recipe to only contain whole numbers of ingredients as well. Help the chef determine how much of each ingredient to use in order to make as little food as possible.

Input
Input will begin with an integer T, the number of test cases. Each test case consists of a single line. The line begins with a positive integer N, the number of ingredients. N integers follow, each indicating the quantity of a particular ingredient that is used.

Output
For each test case, output exactly N space-separated integers on a line, giving the quantity of each ingredient that the chef should use in order to make as little food as possible.

Sample Input
3
2 4 4
3 2 3 4
4 3 15 9 6
Sample Output
1 1
2 3 4
1 5 3 2
	*/
	
import java.util.*;
public class RECIPE{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			System.out.println("");
			int n = sc.nextInt();
			int[] ingredients = new int[n];
			for(int i = 0; i < n; i++){
				ingredients[i] = sc.nextInt();
			}
			int gcd = gcdOf(ingredients);
			for(int i : ingredients){
				System.out.print(i / gcd+" ");
			}
		}
	}
	
	private static int gcdOf(int[] ingredients){
		int gcd = gcdOf(ingredients[0], ingredients[1]);
		for(int i = 2; i < ingredients.length; i++){
		gcd = gcdOf(gcd, ingredients[i]);	
		}
		
		return gcd;
	}
	
	private static int gcdOf(int small, int big){
		if(big < small){
			int temp = big;
			big = small;
			small = temp;
		}
		if(small == 0){
			return big;
		}
		int remainder = big % small;
		if(remainder == 0){
			return small;
		}else{
			return gcdOf(remainder, small);
		}
	}
}