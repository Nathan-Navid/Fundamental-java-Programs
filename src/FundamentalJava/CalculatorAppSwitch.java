package FundamentalJava;

import java.util.Scanner;

public class CalculatorAppSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(":::Calculator APP:::");
		System.out.println("=====================");
		System.out.println("::::MENU::::");
		System.out.println("======================");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. MULTI");
		System.out.println("4. DIVIDE");
		System.out.println("5. MODULO");
		System.out.println("Select a Choice");
		int choice = sc.nextInt();
		if (choice > 5) {
			System.exit(0);
		} else
			System.out.println("Enter First Num:");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Num:");
		int num2 = sc.nextInt();

		int result = 0;
		switch (choice) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		case 5:
			result = num1 % num2;
			break;
		default:
			System.out.println("Invalid Choice..");
		}
		System.out.println("Output is: " + result);

	}

}
