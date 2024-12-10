
/*
 *  File: BudgetCalc.java
 *  Author: Seraphina Morrison
 *  Created: 11/08/2023
 *  Last modified: 11/09/2023
 *  Description: idek anymore (slay)
 */
import java.util.Scanner;

public class BudgetCalc {

	// Create static scanner object
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Initialize variables (-1 for max var's cause no negative bills lmao I wish)
		double subscriptionSum = 0, subscriptionMax = -1, gasSum = 0, gasWeeklyAverage = 0, groceriesWeeklyAverage = 0,
				groceriesSum = 0, billsSum = 0, billMax = -1, eatingOutSum = 0, eatingOutMax = -1, miscBillsSum = 0, 
				miscBillsMax = -1, finalTotal = 0;
		
		String type = "", subscriptionMaxName = "", billMaxName = "", eatingOutMaxName = "", miscBillsMaxName = "";

		
		// Prompt user and store value
		print("Welcome to the budget calculator.\nWe will start calculating with your monthly income"
				+ "\n\nPlease enter the amount: ");
		double monthlyIncome = input.nextDouble();
		
		// Prompt user and store value
		print("\nPlease enter the amount of subscriptions you pay for per month: ");
		int subscriptionCount = input.nextInt();

		// Create subscription arrays
		double[] subscriptions = new double[subscriptionCount];
		String[] subscriptionName = new String[subscriptionCount];

		System.out.println(); // Formatting

		type = "Subscriptions"; // Change value (top down shit)

		// For loop to populate arrays, calculate subscriptionSum, and find the max
		for (int i = 0; i < subscriptionCount; i++) {

			// Prompt and store
			populateStringArrayVar(subscriptionName, i, type);
			populateDoubleArrayVar(subscriptions, i, type);

			// Formatting
			print("\n");
			
			subscriptionSum += subscriptions[i]; // Summation

			// Find max
			if (subscriptions[i] > subscriptionMax) {

				subscriptionMax = subscriptions[i];
				subscriptionMaxName = subscriptionName[i];
			}

		}

		// Display results
		printMonthlySumAndMax(subscriptionSum, "subscriptions", subscriptionMaxName, subscriptionMax);

		
		// Prompt user and store value
		System.out.print("\nHow many times have you gotten gas last month?: ");
		int gasCount = input.nextInt();

		print("\n"); // Formatting

		// Create gas array
		double[] gas = new double[gasCount];

		type = "Gas"; // Change value

		// For loop to populate and sum gas
		for (int i = 0; i < gasCount; i++) {

			// Prompt and store
			populateDoubleArrayVar(gas, i, type);

			gasSum += gas[i]; // Summation
		}

		// Calculate weekly average
		gasWeeklyAverage = gasSum / 4.0;

		// Display results
		printMonthlySum(gasSum, "gas");
		printWeeklyAverage(gasWeeklyAverage);
		
		print("\n"); // Formatting
		
		
		// Create array
		double[] groceries = new double[4];
		
		type = "Groceries"; // Change value
		
		// For loop to populate and sum
		for (int i = 0; i < groceries.length; i++) {
			
			// Prompt and store
			populateDoubleArrayVar(groceries, i, type);
			
			groceriesSum += groceries[i]; // Summation
		}
		
		// Calculate weekly average
		groceriesWeeklyAverage = groceriesSum / 4.0;
		
		// Display results
		printMonthlySum(groceriesSum, "groceries");
		printWeeklyAverage(groceriesWeeklyAverage);
		
		
		// Prompt user and store value
		print("\nHow many fixed monthly bills do you have each month?: ");
		int billsCount = input.nextInt();

		type = "Bills"; // Change value

		print("\n"); // Formatting

		// Create bill arrays
		double[] bills = new double[billsCount];
		String[] billName = new String[billsCount];

		// For loop to populate arrays, sum them, and find the max
		for (int i = 0; i < billsCount; i++) {

			// Prompt and store
			populateStringArrayVar(billName, i, type);
			populateDoubleArrayVar(bills, i, type);

			System.out.println(); // Formatting

			billsSum += bills[i]; // Summation

			// Find max
			if (bills[i] > billMax) {
				billMax = bills[i];
				billMaxName = billName[i];
			}
		}

		// Display results
		printMonthlySumAndMax(billsSum, "bills", billMaxName, billMax);

		
		// Prompt user and store value
		print("\nHow many times do you go out to eat a week?: ");
		int eatingOutCount = input.nextInt();

		// Create arrays
		double[] eatingOut = new double[eatingOutCount];
		String[] eatingOutName = new String[eatingOutCount];

		type = "Eating out"; // Change value

		// For loop to populate, sum, and find max
		for (int i = 0; i < eatingOut.length; i++) {

			// Prompt and store
			populateStringArrayVar(eatingOutName, i, type);
			populateDoubleArrayVar(eatingOut, i, type);

			// Summation
			eatingOutSum += eatingOut[i];

			// Find max
			if (eatingOut[i] > eatingOutMax) {
				eatingOutMax = eatingOut[i];
				eatingOutMaxName = eatingOutName[i];
			}
		}
		print("\n"); // Formatting
		
		// Display results
		printMonthlySumAndMax(eatingOutSum, "eating out", eatingOutMaxName, eatingOutMax);
		
		
		// Prompt user
		print("\nInput the amount of any other payments for the month to be processed: ");
		int miscBillsCount = input.nextInt();
		
		// Create arrays
		double[] miscBills = new double[miscBillsCount];
		String[] miscBillsName = new String[miscBillsCount];
		
		type = "Misc bills";
		
		// For loop to populate, sum, and find max
		for (int i = 0; i < miscBills.length; i++) {
			
			// Prompt and store
			populateStringArrayVar(miscBillsName, i, type);
			populateDoubleArrayVar(miscBills, i, type);
			
			// Summation
			miscBillsSum += miscBills[i];
			
			// Find max
			if (miscBills[i] > miscBillsMax) {
				miscBillsMax = miscBills[i];
				miscBillsMaxName = miscBillsName[i];
			}
		}
		
		// Display results
		printMonthlySumAndMax(miscBillsSum, "misc bills", miscBillsMaxName, miscBillsMax);
		
		
		// Calculate total sum
		finalTotal = subscriptionSum + gasSum + groceriesSum + billsSum + eatingOutSum + miscBillsSum;
		
		// Print results 
		System.out.printf("%nYour monthly total is %.2f%n", finalTotal);
		
		// Show left over
		System.out.printf("You have %.2f left over every month", monthlyIncome - finalTotal);
		
		
	}

	public static double populateDoubleArrayVar(double[] arr, int arrIndex, String type) {

		System.out.printf("%s %d of %d price: ", type, arrIndex + 1, arr.length);
		arr[arrIndex] = input.nextDouble();

		return arr[arrIndex];
	}

	public static String populateStringArrayVar(String[] arr, int arrIndex, String type) {

		System.out.printf("%s %d of %d name: ", type, arrIndex + 1, arr.length);
		arr[arrIndex] = input.next();

		return arr[arrIndex];
	}
	
	public static void print(String text) {
		System.out.print(text);
}
	public static void printMonthlySumAndMax(double sum, String type, String maxName, double maxAmount) {

		System.out.printf("Thank you.%nYou spend %.2f on %s every month "
		+ "with %s costing the most at %.2f%n", sum,
				type, maxName, maxAmount);
	}
	
	public static void printMonthlySum(double sum, String type){
		System.out.printf("%nThank you.%nYou spend %.2f on %s every month.%n"
				,sum, type);
	}
	
	public static void printWeeklyAverage(double average) {
		System.out.printf("You spend on average %.2f per week.%n", average);
	}

}
