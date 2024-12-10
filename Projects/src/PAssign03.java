/**
 *  File: PAssign03.java
 *  Class: CSCI 1301
 *  Author: Seraphina Morrison
 *  Created: 09/08/23
 *  Description: This program is an improvement of PAssign01a's convenience store.
 *  This program forces the user to purchase a minimum of 1 item per item or else
 *  they receive an error message
 */
import java.util.Scanner;

public class PAssign03 {
	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Create item variables with given values stored
		final double BEVERAGE_PRICE = 0.50;
		final double SANDWICH_PRICE = 2.75;

		// Prompt user for beverage amount and store input in double variable
		System.out.print("Enter the number of beverages: ");
		double beverageAmount = input.nextDouble();

		// If statement for beverages if user enter 0
		if (beverageAmount == 0) {
			System.out.println("ERROR: A quantity of zero is not allowed.\n");
			System.out.print("Enter the number of beverages: ");
			beverageAmount = input.nextDouble();
		}
	
		// Prints after the if statement
		System.out.println("Ordered: " + beverageAmount + " beverages\n");

		// Prompt user for sandwich amount and store input in double variable
		System.out.print("Enter the number of sandwiches: ");
		double sandwichAmount = input.nextDouble();

		// If statements for sandwiches if user enters 0
		if (sandwichAmount == 0) {
			System.out.println("ERROR: A quantity of zero is not allowed.");
			System.out.print("Enter the number of sanwiches: ");
			sandwichAmount = input.nextDouble();
		}
		
		// Print results
		System.out.println("Ordered: " + sandwichAmount + " sandwiches\n");

		// If else statements to display based on if the user entered 0 or not
		if (beverageAmount > 0 && sandwichAmount > 0) {
			// Compute subtotal and totalWithTax
			double subtotal = sandwichAmount * SANDWICH_PRICE + beverageAmount * BEVERAGE_PRICE;
			double totalWithTax = subtotal * 1.075;
			
			// Print results
			System.out.println("The subtotal of " + beverageAmount + " beverages and " + sandwichAmount 
					+ " sandwiches is $" + subtotal + ".");
			System.out.println("With tax, the total is $" + totalWithTax + ".");
		} else {
			System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
		}
	}
}
