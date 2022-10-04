package FundamentalJava;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float addRes, subRes, mulRes, devRes, modRes;
		System.out.println("******Calculator App******");
		System.out.println("======================");
		System.out.println(":::Enter the Operation from MENU:::");
		System.out.println("-----------------------");
		System.out.println("1. Add ");
		System.out.println("2. Sub ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide ");
		System.out.println("5. Modulo ");

		int op = sc.nextInt();

		
		if (op <= 5) {
			System.out.print("Enter First Number: ");
			float a = sc.nextInt();
			System.out.print("Enter Second Number: ");
			float b = sc.nextInt();

			if (op ==1) {
				addRes = a + b;
				System.out.println("----------------------------");
				System.out.println(a + " " + " Add " + b + " " + " = " + addRes);

			} else if (op == 2) {
				subRes = a - b;
				System.out.println("----------------------------");
				System.out.println(a + " " + " Sub " + b + " " + " = " + subRes);
			} else if (op == 3) {
				mulRes = a * b;
				System.out.println("----------------------------");
				System.out.println(a + " " + " Multiply " + b + " " + " = " + mulRes);
			} else if (op == 4) {
				devRes = a / b;
				System.out.println("----------------------------");
				System.out.println(a + " " + " Devide " + b + " " + " = " + devRes);
			} else if (op == 5) {
				modRes = a % b;
				System.out.println("----------------------------");
				System.out.println(a + " " + " Mod " + b + " " + " = " + modRes);
			}
		} else {
			System.err.println("Invalid Entry ");
		}
	}

}
