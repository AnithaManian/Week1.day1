package Assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input number (int)
		int a = 345;
		int quotient = 1;
		int add = 0;
		int remainder = 0;
		while (quotient != 0) {
			quotient = a / 10;
			System.out.println("The Quotient is :" + quotient);
			remainder = a % 10;
			System.out.println("The reminder is :" + remainder);
			a = quotient;
			add = add + remainder;
		}
		System.out.println("Total number is : " + add);

	}

}
