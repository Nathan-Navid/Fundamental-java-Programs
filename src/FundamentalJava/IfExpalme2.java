package FundamentalJava;

import java.util.Scanner;

public class IfExpalme2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int value = sc.nextInt();
		if (value > 0) {
			System.out.println("It is a Positive Num: " + value);
		} else if (value == 0) {
			System.out.println("It is a zero..");
		} else {
			System.out.println("It is a Negative Num: " + value);
		}

	}

}
