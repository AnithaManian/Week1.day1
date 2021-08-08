package Assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Declare an int Input and assign a value 13
		int num = 115;

		// Declare a boolean variable flag as false

		boolean result = false;

		// Iterate from 2 to half of the input

		int value = num/2;
		for (int i = 2; i < value; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a primenumber");
				result = true;
				break;
			} else {
				System.out.println(num + " is a prime number ");
				result = false;
				break;
			}
		}

	}

}
