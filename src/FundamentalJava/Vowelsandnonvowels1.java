package FundamentalJava;

import java.util.*;

public class Vowelsandnonvowels1 {

	public static void main(String[] args) {
		int count = 1, vcount = 0, nvcount = 0;
		Scanner sc = new Scanner(System.in);
		while (count <= 10) {
			System.out.println("Enter Alphabet: " + count);
			// charAt() is usedto read the particular position of given string
			// ex Raymone -- charAt(0) ---R
			char ch = sc.next().charAt(0);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vcount = vcount + 1;
				break;
			default:
				nvcount = nvcount + 1;
			}
			count++;
		}
		System.out.println("Count of Voowels: " + vcount);
		System.out.println("Count of Non-Vowels: " + nvcount);

		if (vcount > nvcount) {
			System.out.println("Vowels char are more then non vowels");
		} else if (vcount < nvcount) {
			System.out.println("Non Vowels Char are more than vowels");
		} else {
			System.out.println("Both are equals");
		}

	}

}