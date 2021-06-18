//COLGLF4
/*
Chef and N−1 more of his friends go to the night canteen. The canteen serves only three items (well, they serve more, but only these three are edible!), which are omelette, chocolate milkshake, and chocolate cake. Their prices are A, B and C respectively.

However, the canteen is about to run out of some ingredients. In particular, they only have E eggs and H chocolate bars left. They need:

2 eggs to make an omelette
3 chocolate bars for a chocolate milkshake
1 egg and 1 chocolate bar for a chocolate cake
Each of the N friends wants to order one item. They can only place an order if the canteen has enough ingredients to prepare all the ordered items. Find the smallest possible total price they have to pay or determine that it is impossible to prepare N items.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains six space-separated integers N, E, H, A, B and C.
Output
For each test case, print a single line containing one integer ― the minimum cost of N items, or −1 if it is impossible to prepare N items.

Constraints
1≤T≤2⋅105
1≤N≤106
0≤E,H≤106
1≤A,B,C≤106
the sum of N over all test cases does not exceed 106
Subtasks
Subtask #1 (30 points): 1≤N≤100
Subtask #2 (70 points): original constraints

Example Input
3
5 4 4 2 2 2
4 5 5 1 2 3
4 5 5 3 2 1
Example Output
-1
7
4
Explanation
Example case 1: The maximum number of items that can be produced using 4 eggs and 4 chocolates is 4, so the answer is −1.

Example case 2: In the optimal solution, the friends should order 2 omelettes, 1 chocolate milkshake and 1 chocolate cake, with cost 1⋅2+2⋅1+3⋅1=7.

Example case 3: In the optimal solution, the friends should order 4 chocolate cakes, with cost 1⋅4=4.
*/
import java.util.*;
import static java.lang.Math.*;
public class COLGLF4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Long> answer = new ArrayList<Long>();
		while(t-->0){
			int numberOfFriends = sc.nextInt();
            int numberOfEggs = sc.nextInt();
            int numberOfChocalateBars = sc.nextInt();
            Dish omelette = new Dish("Omlette", sc.nextInt(), 2, 0);
            Dish milkShake = new Dish("Milk Shake", sc.nextInt(), 0, 3);
            Dish cake = new Dish("Cake", sc.nextInt(), 1, 1);
			List<Dish> menuByPrice = new ArrayList<>();
            menuByPrice.add(omelette);
            menuByPrice.add(milkShake);
            menuByPrice.add(cake);
            Collections.sort(menuByPrice);
            Map<Dish, Integer> bill = new HashMap<Dish, Integer>();
            if(maximumNumOfDish(numberOfEggs, numberOfChocalateBars) >= numberOfFriends){
                int currentItem = 0;
                int maxItem = maximumNumOfDish(numberOfEggs, numberOfChocalateBars);
                
                while(){

                }
            }else{
                answer.add(-1L);
            }
		}
		answer.forEach(System.out::println);
	}

    public int 
   
    public int maximumNumOfDish(int numOfEggs, int numberOfChocalateBars){
        int total = 0;
        total += min(numberOfEggs, numberOfChocalateBars);
        numberOfEggs -= total;
        numberOfChocalateBars -= total;
        total += numberOfEggs / 2;
        total += numberOfChocalateBars / 3;
        return total;
    }

    public static int maxPossibleOmelette(int numberOfEggs){
        return numberOfEggs/2;
    }

    public static int maxPossibleMilkShake(int numberOfChocalateBars){
        return numberOfChocalateBars/3;
    }

    public static int maxPossibleMilkShake(int numberOfChocalateBars, int numberOfEggs){
        return min(numberOfChocalateBars, numberOfEggs);
    }
}

class Dish implements Comparable<Dish>{
    public String name;
    public int price;
    public int eggsRequired;
    public int chocolateBarsRequired;

    Dish(String name, int price, int eggs, int chocolateBars){
        this.name = name;
        this.price = price;
        eggsRequired = eggs;
        chocolateBarsRequired = chocolateBars;
    }
    
    @Override
    public int compareTo(Dish d){
        if(price > d.price){
            return 1;
        }else if(price < d.price){
            return -1;
        }else{
            return 0;
        }
    }
}