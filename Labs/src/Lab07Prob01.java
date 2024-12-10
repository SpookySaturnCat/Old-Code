/**
 *  File: Lab07Prob01
 *  Authors: Taylor O'Neal and Seraphina Morrison
 *  Class: CSCI 1301
 *  Created on: 10/13/23
 *  Decription: Return the max value of a generated and inputted number based on a loop that runs 20 times
 */
import java.util.Scanner;
//import gsu.Math;

public class Lab07Prob01 {

	public static double randomMax(double scaled, int x) {

		// Declare and initialize variables
		double randomValue = 0.0;
		double result = 0.0;

		// For loop to check the max
		for (int i = 0; i < x; i++) {
			randomValue = Math.random() * scaled;

			if (randomValue > result) {
				result = randomValue;
			}

		}
		return result;
	}

	public static void main(String[] args) {

		// Create and initialize values
		double scaled = 0.0;
		int randomValue = 20;
		double largest = 0.0;

		// Create Scanner object
		Scanner input = new Scanner(System.in);

		// Do loop that runs until sentinel is entered
		while (scaled != 719.2) {
			
			// Make sure user enters positve number
			do {
				System.out.print("Enter the limit: ");
				scaled = input.nextDouble();
			} while (scaled < 0);

				if (scaled != 719.2) {

					largest = randomMax(scaled, randomValue);

					// Print results
					System.out.printf("For 20 random values between 0.0 and %.1f the largest value was %.1f.%n", scaled,
							largest);
				} 
					
			}

		}
	}