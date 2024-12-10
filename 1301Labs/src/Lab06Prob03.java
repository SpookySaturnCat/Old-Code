import java.util.Scanner;

public class Lab06Prob03 {

	public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);

		// Declare and initialize variables
		int sentinel = 672, userNumber = 3, sum = 0, validNumbersEntered = 0;
		double average;

		// While loop
		while (userNumber != sentinel) {

			// Prompt for and store user data
			System.out.print("Please enter an integer value (enter 672 to exit): ");
			userNumber = input.nextInt();

			// Adds to sum and increases validNumbersEntered by one
			if (userNumber % 2 == 0 && userNumber >= 0 && userNumber != sentinel) {
				sum += userNumber;
				validNumbersEntered++;
			}
		}

		// Calculate average
		average = sum / (double) validNumbersEntered;

		// Print results
		System.out.printf("For the positive even numbers the sum was %d and the average was %.4f.%n", sum, average);
	}
}
