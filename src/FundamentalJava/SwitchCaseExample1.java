package FundamentalJava;

import java.util.Scanner;

public class SwitchCaseExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter month:");
//		int month_no = sc.nextInt();
//		
//		switch(month_no)
//		{
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("This is summer season:");
//			break;
//		case 4:
//			System.out.println("This is rainy season:");
//			break;
//		case 5:
//			System.out.println("This is winter season:");
//			break;
//			default:
//				System.err.println("It is Invalid choice..");
//				
//		}
		
		System.out.println("Enter Student Grade:");
		char grade = sc.next().charAt(0);
		String status=null;
		switch(grade)
		{
		case 'A':
			status = "Excellent";
		break;
		case 'B':
			status="Good";
			break;
			
		case 'C':
			status="Not Bad";
			break;
			default:
				System.err.println("Invalid Grade..");
		}
		System.out.println("Result Status: "+status);
		
		
	}

}