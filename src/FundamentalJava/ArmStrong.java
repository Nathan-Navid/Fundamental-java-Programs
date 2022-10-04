package FundamentalJava;

public class ArmStrong {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		int result;
		int value = num;
		while (num > 0) {
			result = num % 10;
			sum = sum + (result * result * result);
			num = num / 10;
		}
		if (value == sum) {
			System.out.println("Given Number is a Armstrong Number: " + sum);
		} else {
			System.out.println("Not a Armstrong number");
		}

	}

}