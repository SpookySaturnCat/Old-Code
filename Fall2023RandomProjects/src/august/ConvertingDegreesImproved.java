/**
 * File: ConvertingDegrees.java
 * Author: Seraphina Morrison
 * Created: 08/22/23
 * Last Modified: 08/27/23
 * Description: This program is made to convert
 * any temperature to kelvin, farenheight, or celcius 
 * based on user input
 * IMPROVED VERSION
 */
package august;

import java.util.Scanner;

public class ConvertingDegreesImproved {

	public static void main(String[] args) {

		// Declare and initialize variables
		String typeDesired = "", startingType;
		double initialTemp, newTemp;

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Do while loop to control output
		do {

			// Prompt user on type of conversion they need and store value
			System.out.print("Please enter the unit of conversion you want (\"celsius\" or \"fahrenheit\"): ");
			typeDesired = input.next();

			// If the user enters something correctly the program continues to run
			if (typeDesired.equalsIgnoreCase("celsius") || typeDesired.equalsIgnoreCase("fahrenheit")) {

				// Ask the user for the temperature they want
				System.out.print("Please enter the temperature degrees in decimal form: ");
				initialTemp = input.nextDouble();

				// If else on methods to run based on conversation type they want
				if (typeDesired.equalsIgnoreCase("celsius")) {

					startingType = "celsius";
					newTemp = celciusToFarenheit(initialTemp);
				} else {

					startingType = "fahrenheit";
					newTemp = fahrenheitToCelcius(initialTemp);
				}

				// Print results
				printResults(startingType, initialTemp, newTemp);

			} else {

				// Else statement that has an error message
				System.out.println("Error: Invalid input. Try again.");
			}
			// Close do while loop
		} while (!typeDesired.equalsIgnoreCase("celsius") || !typeDesired.equalsIgnoreCase("fahrenheit"));

	}

	public static double celciusToFarenheit(double celsius) {

		// Calculate newTemp
		double newTemp = (9.0 / 5) * celsius + 32;
		return newTemp; // return value to main
	}

	public static double fahrenheitToCelcius(double fahrenheit) {

		// Calculate newTemp
		double newTemp = (5.0 / 9) * (fahrenheit - 32);
		return newTemp; // return value to main
	}

	public static void printResults(String oldType, double oldTemp, double newTemp) {

		// Declare and initialize variables
		String newType = "celsius";

		if (oldType.equalsIgnoreCase("celsius")) {
			newType = "fahrenheit";
		}
		System.out.printf("%.2f %s was converted to %.2f %s.%n%n", oldTemp, oldType, newTemp, newType);
	}
}