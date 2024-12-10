/**
 * File: Lab04Prob02.java
 * Author: Hannah Pamplona, Seraphina Morrison
 * Created: 09/08/2023
 * Class: CSCI1301
 * Description: User enters month as an int and program dsplays season
 * */

import java.util.Scanner;

public class Lab04Prob02 {
	public static void main(String[] args) {

		// Create Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for int value and store in int
		System.out.print("Enter the month number: ");
		int month = input.nextInt();

		// Month string
		String season = "";
		boolean error = false;

		// If else statement that puts the value of the correct season in the season variable
		if (month <= 2) {
			season = "winter";
		} else if (month <= 5) {
			season = "spring";
		} else if (month <= 8) {
			season = "summer";
		} else if (month <= 11) {
			season = "fall";
		} else if (month == 12) {
			season = "winter";
		} else {
			error = true;
		}

		if (error) {
			System.out.println("That is not a valid month");
		} else {
			// Print results
			System.out.println("Month " + month + " occurs during " + season);
		}
	}
}