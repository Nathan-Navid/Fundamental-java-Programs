package FundamentalJava;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		
		while (a <= b)
		{
			if (a % 2 == 0)
				
			{
				System.out.println(a + " ");
				
			}

			a++;
		}
	}

}
