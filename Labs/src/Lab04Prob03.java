/**
 * File: Lab04Prob02.java Author: Hannah Pamplona, Seraphina Morrison Created:
 * 09/08/2023 Class: CSCI1301 Description: This program generates a raise and
 * new salary based on given conditions
 */
//import gsu.Math;

public class Lab04Prob03 {
	public static void main(String[] args) {

		// Create 40000 value
		double salary = 40000.0;

		// Create random number from 0-950
		int randomNumber = (int) (Math.random() * 951);

		// Constrain number from 0-6
		int statusNumber = randomNumber % 7;

		// Create raise value
		double raise;

		// If else statements to assign status
		if (statusNumber == 0) {
			raise = 0.0;
		} else if (statusNumber == 1) {
			raise = 3.7;
		} else if (statusNumber == 2) {
			raise = 4.2;
		} else if (statusNumber == 3) {
			raise = 5.7;
		} else if (statusNumber == 4) {
			raise = 6.1;
		} else if (statusNumber == 5) {
			raise = 7.3;
		} else {
			raise = 8.7;
		}

		// Compute newSalary
		double newSalary = salary + salary * (raise / 100);

		// Print results
		System.out.println("With a random status of " + statusNumber + " and an initial salary of $" + salary
				+ ", your raise is " + raise + "% which equates to a new salary of $" + newSalary + ".");
	}
}