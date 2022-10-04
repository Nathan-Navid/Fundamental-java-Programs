package FundamentalJava;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(":::User Login APP:::");
		System.out.println("======================");
		System.out.println("Enter User Id:");
		String uid = sc.next();
		System.out.println("Enter User Pwd:");
		String pwd = sc.next();
		
		if(uid.equals("admin") & pwd.equals("admin@123"))
		{
			System.out.println("Admin Login Successfull...");
		}
		else if(uid.equals("student") | pwd.equals("student"))
		{
			System.out.println("Student Login Successfull...");
		}
		else
		{
			System.err.println("Invalid UID or PWD..");
		}
	}

	

}
