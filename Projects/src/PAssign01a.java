/**
 * File: PAssign01a.java
 * Class: CSCI 1301
 * Author: Seraphina Morrison
 * Created: 08/27/23
 * Last Modified: 08/31/23
 * Description: This program asks the user for the amount of
 * items they want from a convenience store, and computes
 * the price based on given values
 */
import java.util.Scanner;

public class PAssign01a {
	public static void main(String[] args) {
	
		// Create Scanner object named input
		Scanner input = new Scanner(System.in);
		
		// Create and assign given value to double variables
		double beveragePrice = 0.50;
		double sandwichPrice = 2.75;
		
		// Prompt user and store information in double variables
		System.out.println("Welcome to the Convenience Store!");
		System.out.println("How many beverages would you like?");
		double beverageAmount = input.nextDouble();
		System.out.println("How many sandwhiches would you like?");
		double sandwichAmount = input.nextDouble();
		
		// Compute price for amount
		double priceOfTotalFood = beveragePrice * beverageAmount + sandwichPrice * sandwichAmount;
		
		// Print results
		System.out.println("The total of " + beverageAmount + " beverages and " + sandwichAmount 
				+ " sandwiches is $" + priceOfTotalFood + ".");
	}
}
