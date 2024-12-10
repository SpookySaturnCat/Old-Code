/*
 *  File: PAssign07.java
 *  Author: Seraphina Morrison
 *  Class: CSCI 1301
 *  Created: 10/31/23
 *  Last Modified: 11/02/2023
 */

import java.util.Scanner;

public class PAssign07 {
	
	public static void main(String[] args) {

		// Declare local variables
		int maxIndex = 0, minIndex = 0, underAverage = 0, overAverage = 0;
		double sum = 0, average = 0;

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user and store their data
		System.out.print("Enter number of values: ");
		int numberOfValues = input.nextInt();

		// Create an array with the user inputed amount of int variables
		int[] userNumbers = new int[numberOfValues];

		System.out.println(); // Print new line

		// For loop to populate array
		for (int i = 1; i < userNumbers.length + 1; i++) {
			
			// Prompt user and store their values
			System.out.printf("Enter value (%d of %d): ", i, numberOfValues);
			userNumbers[i - 1] = input.nextInt();
		}

		// Prints the index and values
		for (int i = 0; i < numberOfValues; i++) {
			System.out.printf("%nIndex %d: %d", i, userNumbers[i]);
		}
		
		// Initialize max and min variables
		int  max = userNumbers[0], min = userNumbers[0];
		
		// For loop to determine minimum and maximum
		for (int i = 1; i < numberOfValues; i++) {

			if (userNumbers[i] < min) {
				min = userNumbers[i];
				minIndex = i;
			}

			if (userNumbers[i] > max) {
				max = userNumbers[i];
				maxIndex = i;
			}
		}

		// Print min and max results
		System.out.printf("%n%nMaximum: %d at index %d%nMinimum: %d at index %d%n"
				,max, maxIndex, min, minIndex);

		// For loop to determine sum
		for (int i = 0; i < numberOfValues; i++) {

			// Calculate sum
			sum += userNumbers[i];
		}

		// Calculate average
		average = sum / (double) numberOfValues;

		// Print average results
		System.out.printf("Average: %.4f%n", average);

		// Find how many values are over and under the average
		for (int i = 0; i < numberOfValues; i++) {

			if (userNumbers[i] > average) {
				overAverage++;
			}

			if (userNumbers[i] < average) {
				underAverage++;
			}
		}

		// Print over-under results
		System.out.printf("Values over average: %d%nValues under average: %d%n"
				, overAverage, underAverage);
	}
}
