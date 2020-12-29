//
// Tanu has got interested in signs and gestures that we use for communication. One such gesture is the head-bob.
// When we want to signal "Yes" to someone, we move the head up-and-down. For "No", the head is moved left-and-right, rotating about the vertical axis.
// There is a peculiar way of gesturing "Yes", commonly seen in India, by moving head sideways (rotating about the forward-back axis). This is called the Indian head-bob.
//
// Tanu observed many people on the railways station, and made a list of gestures that they made. Usual "Yes" gesture is recorded as "Y", no as "N" and Indian "Yes" gesture as "I". (Assume no foreigner uses the Indian "Yes" gesture and vice-versa). Identify which of them were Indians, which were not Indian, and which one you cannot be sure about.
//
// Input
// First line contains T, number of people observed by Tanu.
// Each person is described in two lines. First line of the description contains a single integer N, the number of gestures recorded for this person. Next line contains a string of N characters, each character can be "Y", "N" or "I".
// Output
// For each person, print "INDIAN" if he/she is from India, "NOT INDIAN" if not from India, and "NOT SURE" if the information is insufficient to make a decision.
// Constraints
// For 30 points: 1 ≤ T,N ≤ 100
// For 70 points: 1 ≤ T,N ≤ 1000
// Example
// Input:
// 3
// 5
// NNNYY
// 6
// NNINNI
// 4
// NNNN
//
// Output:
// NOT INDIAN
// INDIAN
// NOT SURE

import java.util.*;
import java.io.*;

public class HEADBOB{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		boolean Y = false, I = false;
		String gestures;
		while(t-->0){
			sc.nextInt();
			sc.nextLine();
			gestures = sc.nextLine();
			for(char c : gestures.toCharArray()){
				if(c == 'Y'){
					Y = true;
					break;
				}else if(c == 'I'){
					I = true;
					break;
				}
			}
			if(Y) answer.add("NOT INDIAN");
			else if(I) answer.add("INDIAN");
			else answer.add("NOT SURE");
			Y = false; 
			I = false;
		}
		
		answer.forEach(System.out::println); 
	}
}