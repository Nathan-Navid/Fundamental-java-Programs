package FundamentalJava;

import java.util.Arrays;
import java.util.Scanner;

//1. check the two strings have same length
//-- Create a class and active Scanner statement.  
//-- create a method getStrings() and ask user to type in.
//-- Create a static method to check before main method the length of two strings
//-- the method needs to be boolean, and the return value should be true or false if the lengths are not same should be false. 
//-- the Method should has properties (String s1, String s2) to check the two strings
//-- if statement s1.length != s2.length --> return false.
//2. Transform the strings to arrays of 
//-- transform each string to array of characters, by char anyname[] = s1.toCharArray[];
//-- we need to sort the arrays by  Arrays.sort(anyname);
//3. Iterate through the arrays and compare the same index  

public class Anagram2 {

	public static void main(String[] args) {
		System.out.println(" ::: CHECK THE 2 STRINGS ARE ANAGRAMS OR NOT:::");
		System.out.println("==================================================");
		System.out.println("\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String s1 = input.next();
		System.out.print("Enter Second String: ");
		String s2 = input.next();

		if (anagramCheck(s1, s2)) {
			System.out.println("\n");
			System.out.println(s1 + " , " + s2 + " are Anagrams");
		} else {
			System.out.println("\n");
			System.out.println(s1 + " , " + s2 + " are NOT Anagrams");
		}
		System.out.println("\n");
		System.out.println("THANK YOU");
	}

	static boolean anagramCheck(String s1, String s2) {

		s1 = s1.toLowerCase().replace(" ", "");
		s2 = s2.toLowerCase().replace(" ", "");

		// checking length
		if (s1.length() != s2.length()) {
			return false;
		}

		// transform to arrays
		char string1ToArray[] = s1.toCharArray();
		char string2ToArray[] = s2.toCharArray();

		// sorting
		Arrays.sort(string1ToArray);
		Arrays.sort(string2ToArray);

		for (int i = 0; i < s1.length(); i++) {
			if (string1ToArray[i] != string2ToArray[i]) {
				return false;
			}
		}
		return true;
	}
}
