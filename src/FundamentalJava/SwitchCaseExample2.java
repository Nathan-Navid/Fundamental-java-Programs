package FundamentalJava;

import java.util.Scanner;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float bonus=0;
		System.out.println("==========================");
		System.out.println(":::Emp Mgmt System APP:::");
		System.out.println("==========================");
		System.out.println("Enter Emp Dept:");
		String dept = sc.next();
		if(dept.equalsIgnoreCase("IT"))
		{
			System.out.println("Enter Emp Grade:");
			String grade=sc.next();  // ABC -->A--->0 B---->1 C----->2
			if(grade.equalsIgnoreCase("a"))
			{
				bonus=30;
			}
			else if(grade.equalsIgnoreCase("b"))
			{
				bonus=20;
			}
			else if(grade.equalsIgnoreCase("c"))
			{
				bonus=10;
			}
			else
			{
				System.err.println("Invalid Grade..");
			}
			System.out.println("Emp Bonus is: "+bonus);
		}
		else
		{
			System.err.println("Invalid Dept..");
		}

	}

	

}
