//CHEFRECP

/*


In Chefland, types of ingredients are represented by integers and recipes are represented by sequences of ingredients that are used when cooking. One day, Chef found a recipe represented by a sequence A1,A2,…,AN at his front door and he is wondering if this recipe was prepared by him.

Chef is a very picky person. He uses one ingredient jar for each type of ingredient and when he stops using a jar, he does not want to use it again later while preparing the same recipe, so ingredients of each type (which is used in his recipe) always appear as a contiguous subsequence. Chef is innovative, too, so he makes sure that in each of his recipes, the quantity of each ingredient (i.e. the number of occurrences of this type of ingredient) is unique ― distinct from the quantities of all other ingredients.

Determine whether Chef could have prepared the given recipe.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-separated integers A1,A2,…,AN.
Output
For each test case, print a single line containing the string "YES" if the recipe could have been prepared by Chef or "NO" otherwise (without quotes).

Constraints
1≤T≤100
1≤N≤103
1≤Ai≤103 for each valid i
Example Input
3
6
1 1 4 2 2 2
8
1 1 4 3 4 7 7 7
8
1 7 7 3 3 4 4 4
Example Output
YES
NO
NO
Explanation
Example case 1: For each ingredient type, its ingredient jar is used only once and the quantities of all ingredients are pairwise distinct. Hence, this recipe could have been prepared by Chef.

Example case 2: The jar of ingredient 4 is used twice in the recipe, so it was not prepared by Chef.





*/


import java.util.*;
public class CHEFRECP{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
			int n = sc.nextInt();
            Map<Integer, Integer> mapOfCount = new HashMap<Integer, Integer>();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean flag = true;
            int currentNumber = 0;
            for(int i = 0; i < n; i++){
                if(currentNumber == arr[i]){
                    if(mapOfCount.containsKey(arr[i])){
                        mapOfCount.put(currentNumber, mapOfCount.get(currentNumber)+1);
                    }else{
                        mapOfCount.put(currentNumber, 1);
                    }
                }else{
                    if(!mapOfCount.containsKey(arr[i])){
                        currentNumber = arr[i];
                        mapOfCount.put(currentNumber, 1);
                    }else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                Set<Integer> counts = new HashSet<Integer>();
                for(Map.Entry<Integer, Integer> entry : mapOfCount.entrySet()){
                    if(counts.contains(entry.getValue())){
                        flag = false;
                        break;
                    }else{
                        counts.add(entry.getValue());
                    }
                }
            }

            if(flag){
                answer.add("YES");
            }else{
                answer.add("NO");
            }
		}
		answer.forEach(System.out::println);
	}
}

