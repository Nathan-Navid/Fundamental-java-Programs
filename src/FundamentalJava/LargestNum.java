package FundamentalJava;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("*** Realizing largest Numbers ***");
		System.out.println("============================================");
		System.out.println("\n");
		System.out.print("Enter 3 Numbers : ");

		String string = sc.nextLine();
		String[] numbers = string.split(" ");

		if (numbers.length != 3) {
			System.err.println("Please enter only 3 Numbers");
			System.out.println("\n");

		} else {
			int first = Integer.parseInt(numbers[0]);
			int second = Integer.parseInt(numbers[1]);
			int third = Integer.parseInt(numbers[2]);
			System.out.println("\n");
			System.out.println("First Number: " + numbers[0]);
			System.out.println("Second Number: " + numbers[1]);
			System.out.println("Third Number: " + numbers[2]);

			if (first > second && first > third) {
				System.out.println("\n");
				System.out.println("The Largest Num is " + first);
			} else if (second > first && second > third) {
				System.out.println("\n");
				System.out.println("The Larget Num is " + second);
			} else {
				System.out.println("\n");
				System.out.println("The largest Num is " + third);
			}
		}
	}
}
