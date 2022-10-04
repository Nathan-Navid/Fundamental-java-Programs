package FundamentalJava;

import java.util.Scanner;

public class Fibonnaci1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Num:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Num:");
		int num2=sc.nextInt();
		System.out.println("Enter the Range:");
		int range=sc.nextInt();
		System.out.print(num1);
		while(num2<range)
		{
			System.out.println(" "+num2+ " ");
			int third=num1+num2;
			num1=num2;
			num2=third;
		}
		
	}

}