//VOWELTB
/*

Write a program to take a character (C) as input and check whether the given character is a vowel or a consonant.

NOTE:− Vowels are 'A', 'E', 'I', 'O', 'U'. Rest all alphabets are called consonants.

Input:
First line will contain the character C.
Output:
Print "Vowel" if the given character is a vowel, otherwise print "Consonant".

Constraints
C will be an upper case English alphabet
Sample Input:
Z
Sample Output:
Consonant

*/

import java.util.*;
public class VOWELTB{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<Character>(Arrays.asList('A','E','I','O','U'));
		if(set.contains(sc.nextLine().charAt(0))){
            System.out.println("Vowel");
        }else
            System.out.println("Consonant");
	}
}


