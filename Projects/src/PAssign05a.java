
/**
 *  File: PAssign05a
 *  Author: Seraphina Morrison
 *  Created: 10/03/2023
 *  Last Modified: 10/05/2023
 *  Description: This program allows a user to enter grades until
 *  a sentinel value is entered, the program counts, sorts and displays
 *  the grades run off a do while loop
 */
import java.util.Scanner;

public class PAssign05a {
	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Create and initialize variables
		double userInput = 0;
		double minimum = 101;
		double maximum = -1;
		int validGradeCount = 0;
		int invalidGradeCount = 0;
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int fCount = 0;

		// Do-while loop to run the program until -999 is entered
		do {
			// Prompt user and store their answer
			System.out.print("Enter grade from 0-100, -999 to stop: ");
			userInput = input.nextDouble();

			// Check to see if range is from 0-100
			if (userInput >= 0 && userInput <= 100) {

				validGradeCount++;

				// Check to see if user input is less than the minimum value if so, assign the
				// current user input to the minimum variable

				if (minimum > userInput) {
					minimum = userInput;
				}

				// Check to see if user input is more than the maximum value if so, assign the
				// current user input to the maximum variable

				if (maximum < userInput) {
					maximum = userInput;
				}

				// Selection statement to add a count value to the letter grade
				if (userInput >= 90.0) {
					aCount++;
				} else if (userInput >= 80.0) {
					bCount++;
				} else if (userInput >= 70.0) {
					cCount++;
				} else if (userInput >= 60.0) {
					dCount++;
				} else {
					fCount++;
				}

				// If the input is not the sentinel value an error message pops up and adds a
				// count value for this specific situation
			} else if (userInput != -999) {
				System.out.println("Error: That is not a valid score.");
				invalidGradeCount++;
			}
		} while (userInput != -999); // Loop runs until sentinel is entered

		// If statement to check if no maximum was entered
		if (maximum == -1) {
			maximum = 0;
		}

		// If statement to check if no minimum was entered
		if (minimum == 101) {
			minimum = 0;
		}

		// Print results
		System.out.printf("\nValid grades:\t%d\nInvalid grades:\t%d\nHighest grade:\t%.2f\nLowest grade:\t%.2f\n",
				validGradeCount, invalidGradeCount, maximum, minimum);
		System.out.printf("\nAs:\t%d\nBs:\t%d\nCs:\t%d\nDs:\t%d\nFs:\t%d\n", aCount, bCount, cCount, dCount, fCount);
	}
}
