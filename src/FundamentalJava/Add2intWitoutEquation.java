package FundamentalJava;

import java.util.Scanner;

public class Add2intWitoutEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Sum of Two numbers Without Using Arithmetic Operators ***");
		System.out.println("*** ===================================================== ***");
		System.out.println("\n");
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		if (b > 0) {
			while (b > 0) {
				a++;
				b--;
			}
		}
		if (b < 0) { // when 'b' is negative
			while (b < 0) {
				a--;
				b++;
			}
		}
		System.out.println("Sum is: " + a);
	}
}