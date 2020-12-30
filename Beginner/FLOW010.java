// Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the table below.
//
// Class ID	Ship Class
// B or b	BattleShip
// C or c	Cruiser
// D or d	Destroyer
// F or f	Frigate
// Input
// The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains a character.
//
// Output
// For each test case, display the Ship Class depending on ID, in a new line.
//
// Constraints
// 1 ≤ T ≤ 1000
// Example
// Input
//
// 3
// B
// c
// D
//
// Output
// BattleShip
// Cruiser
// Destroyer
// All submissions for this problem are available.


import java.util.*;
public class FLOW010{
	public static void main(String args[]){
		Map<Character, String> mapping = new HashMap<Character, String>();
		mapping.put('b', "BattleShip");
		mapping.put('c', "Cruiser");
		mapping.put('d', "Destroyer");
		mapping.put('f', "Frigate");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			System.out.println(mapping.get(Character.toLowerCase(sc.next().charAt(0))));
		}
	}
}




