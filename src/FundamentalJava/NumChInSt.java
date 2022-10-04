package FundamentalJava;

import java.util.Scanner;

public class NumChInSt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Realizing the number of Charactor in a String ***");
		System.out.println("==============================================================");
		System.out.println("\n");

		System.out.print("Enter a String: ");
		String string = sc.next();
		System.out.print("Enter a Charactor: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(ch + " is occurs in the string: " + count + " times");

	}

}
