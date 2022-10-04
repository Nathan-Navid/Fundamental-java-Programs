package FundamentalJava;

import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to check:");
		original=sc.next();
		//it returns the string length
		int len=original.length();
	
		for(int pos=len-1;pos>=0;pos--)
		{
			reverse=reverse+original.charAt(pos);
			//4->m  + 3->a 2->d + 1->a + 0->m  = madam 
		}
		System.out.println("Reverse Value: "+reverse);
		if(original.equals(reverse))
		{
			System.out.println("It is a Palindrome : "+original);
		}
		else
		{
			System.err.println("Not a Palindrome");
		}

	}

}