package Assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare your input
		int num = 153;
		int remainder;// calculated
		int quotient = 1;// remainder
		int sum = 0;// original
		int i = num;

		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)
//		i = quotient;
		// Assign input into variable original

		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0
		while (quotient != 0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder = i % 10;
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)
			quotient = i / 10;
			i = quotient;
			sum = sum + (remainder * remainder * remainder);
		}
		if (sum == num) {
			System.out.println("The number is an Armstrong");
		} else {
			System.out.println("The number is not an Armstrong");
		}

		// Within loop: get the quotient when done by 10 (Tip: Assign the result to
		// input)

		// Within loop: Add calculated with the cube of remainder & assign it to
		// calculated

		// Check whether calculated and original are same

		// When it matches print it as Armstrong number

	}

}
