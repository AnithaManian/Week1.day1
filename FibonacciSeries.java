package Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		System.out.println("Print first number" + firstNum);
		// Print first number
		for (int i = 1; i < range; i++) {
			// Iterate from 1 to the range
			sum = firstNum + secNum;
			// add first and second number assign to sum
			firstNum = secNum;

			// Assign second number to the first number
			secNum = sum;
			// Assign sum to the second number
			System.out.println("Fibanocci series is" + sum);
			// print sum
		}
	}

}
