/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 24, 2023
 *Lab3
 *This code prompts a user to enter an integer using the console window
 *input and checks to see if the integer is divisible by both 5 and 6,
 *neither, or only one of them using if else statements */


import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		// creates scanner object
		Scanner input = new Scanner(System.in);

		// prompts user
		System.out.print("Please Enter Integer: ");
		// assigns user input to int variable named userNumber
		int userNumber = (int) input.nextInt();

		/*
		 * nested if else statements that display results if user input matches the
		 * conditions
		 */
		if ((userNumber % 5 == 0) && (userNumber % 6 == 0))
			System.out.println(userNumber + " is divisible by both 5 and 6.");

		else if ((userNumber % 5 == 0) && (userNumber % 6 != 0))
			System.out.println(userNumber + " is divisible by 5 but not 6.");

		else if ((userNumber % 5 != 0) && (userNumber % 6 == 0))
			System.out.println(userNumber + " is divisible by 6 but not 5.");

		// if above statements are not met these conditions will print
		else
			System.out.println(userNumber + " is divisible by neither 5 nor 6.");
	}
}
