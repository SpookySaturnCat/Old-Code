 /*
 *  File: PAssign08.java
 *  Author: Seraphina Morrison
 *  Class: CSCI 1301
 *  Created: 11/11/23
 *  Last Modified: 11/12/2023
 */

public class PAssign10 {

	public static void main(String[] args) {

		// Create 2D array with given values
		double[][] shippingContainers = { { 47.19, 39.19, 36.50 }, { 59.25, 59.25, 54.50 }, { 47.25, 29.25, 29.50 },
				{ 23.19, 19.20, 19.50 }, { 17.33, 17.33, 17.50 }, { 83.19, 47.25, 42.50 }, { 23.33, 19.33, 19.50 },
				{ 31.25, 23.25, 23.50 }, { 29.33, 29.33, 24.50 }, { 23.19, 23.19, 23.19 }, { 35.19, 35.19, 30.50 },
				{ 47.19, 44.19, 29.50 }, { 40.19, 27.88, 20.00 }, { 59.19, 47.19, 42.50 }, { 47.19, 47.19, 22.50 },
				{ 39.33, 39.33, 34.50 }, { 47.25, 29.25, 29.50 }, { 35.19, 21.19, 16.50 }, { 11.33, 11.33, 11.50 },
				{ 47.19, 39.19, 29.50 }, { 47.19, 47.19, 42.50 }, { 66.19, 29.20, 25.00 }, { 57.19, 41.19, 40.50 },
				{ 59.25, 59.25, 42.50 }, { 71.25, 47.25, 42.50 } };

		printShippable(shippingContainers); // Run print method
	}

	public static void printShippable(double[][] container) {

		// Declare and initialize variables outside of loops
		double cubicCentimeters, conversionFactor = 0.3937007874;

		// For loop for rows
		for (int i = 0; i < container.length; i++) {

			// Initialize cubicCentimeters to avoid multiplication of 0's
			cubicCentimeters = container[i][0] * conversionFactor;

			// Nested for loop for columns
			for (int j = 1; j < container[i].length; j++) {

				// Calculate cubic centimeters each loop
				cubicCentimeters *= container[i][j] * conversionFactor;
			}

			// If statement to check if container can be shipped
			if (cubicCentimeters >= 2000 && cubicCentimeters <= 7000) {

				// Print results
				System.out.printf("Container %d (%,.2f in^3) can be shipped%n", i, cubicCentimeters);
			}
		}
	}
}
