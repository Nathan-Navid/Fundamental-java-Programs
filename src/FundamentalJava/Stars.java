package FundamentalJava;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("*** Creating a shape with stars ***");
		System.out.println("============================================");
		System.out.println("\n");
		System.out.print("Enter 2 Numbers: ");
	

		String string = sc.nextLine();
		String[] parts = string.split(" ");

		if (parts.length != 2) {
			System.err.println("Please enter only 2 numbers");
		}
		int a = Integer.parseInt(parts[0]);
		int b = Integer.parseInt(parts[1]);
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || j == 0 || i == a - 1 || j == b - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		System.out.println("\n");
		System.out.println("THANK YOU");
	}

}
