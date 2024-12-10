package projects;

/*
 *  File: PAssign04.java
 *  Author: Seraphina Morrison
 *  Created: 02/18/2024
 *  Last modified: 02/22/2024
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PAssign04 {
	public static void main(String[] args) {
		// Initialized variables and create objects
		double sentinel = 0, min = 0, max = 0, average = 0;
		ArrayList<Double> list = new ArrayList<>();

		// No resource leaking here
		try (Scanner input = new Scanner(System.in)) {
			// Sentinel loop that ends when the user enters -999
			do {
				try {
					// Prompt user and store value
					System.out.print("Enter a double value (-999 to exit): ");
					sentinel = input.nextDouble();

					// Checks to make sure sentinel was not entered
					if (sentinel != -999) {
						// if-else statement to check if sentinel is in the list
						if (!list.contains(sentinel)) {
							list.add(sentinel); // Adds the inputed value to the list
						} else {
							// throw ArrayStoreExceptions message to constructor if duplicate
							throw new ArrayStoreException("Duplicate value");
						}
					}
					
				// Catch exceptions
				} catch (InputMismatchException ex) {
					System.out.println("That is not a valid double value.");
					input.next(); // Clear input buffer in catch block
				} catch (ArrayStoreException ex) {
					System.out.println(ex.getMessage());
				} catch (Exception ex) {
					System.out.println("Something unexpected occured.");
				}
			} while (sentinel != -999);
		}

		// if statement to make sure there was valid input
		if (!list.isEmpty()) {
			// Calculations using .Collections
			max = Collections.max(list);
			min = Collections.min(list);
			average = average(list);
			
			// Print array list contents by printing the object directly
			System.out.println(list);
			
			// Print a specific message (in lab)
			System.out.printf("Average: %.2f\nMax: %.2f\nMin: %.2f\n", average, max, min);
		
		} else {
			System.out.println("There were no values to process");
		}
	}

	public static double average(ArrayList<Double> list) {
		double sum = 0.0, average;

		for (int i = 0; i <= list.size() - 1; i++) {
			sum += (double) list.get(i);
		}

		average = sum / list.size();
		return average;
	}
}
