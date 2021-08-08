package Assignments;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input as 5
	

		// Declare an integer variable fact as 1

		int fact = 1;
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 5; i > 0; i--) {
			fact = fact * i;
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
			// the 'fact' variable)

		}
		// End of loop

		// Print factorial (fact)
		System.out.println("The facotial number is: " + fact);
	}

}
