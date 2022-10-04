package FundamentalJava;

import java.util.Scanner;

public class StringChinOneSt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*** Realizing the number of Charactor in a String ***");
		System.out.println("========================================================");
		System.out.println("\n");

		System.out.print("Enter a String and a Charactor :  ");
		String string = sc.nextLine();
		String[] parts = string.split(" ");

		if (parts.length != 2) {
			System.err.println("\nPlease enter only 2 inputs");
		} else {

			int count = 0;

			for (int i = 0; i < parts[0].length(); i++) {

				if (parts[0].charAt(i) == parts[1].charAt(0)) {
					count++;
				}
			}
			System.out.println("\n");
			System.out.println("** " +parts[1].charAt(0)+" **" + " is occurs in given string: " + count + " times");

		}

	}

}
