package ungraded.exercises.chapter6;

import java.util.Scanner;

public class Exercise06_04 {

	public static void main(String[] args) {

		int userNumber = 98;

		// Create scanner object
		Scanner input = new Scanner(System.in);

		while (userNumber != 999) {

			do {
				// Prompt user and store their digit
				System.out.print("Please enter a number that is more than "
						+ "two digits with no decimal places (999 to exit): ");
				userNumber = input.nextInt();
				
			} while (userNumber < 9);

			if (userNumber != 999) {

				// Run void method
				reverse(userNumber);
			}
		}
	}

	public static void reverse(int number) {

		// Declare and init variables
		int temp = 0;

		// Loop that runs until number is negative (no more digit spots left)
		while (number > 0) {

			// Extract the last digit
			temp = (int) number % 10;

			// Print last digit
			System.out.print(temp);

			// Divide the number by 10 to get make the next digit last
			number = number / 10;
		}
		System.out.println("\n");
	}
}
