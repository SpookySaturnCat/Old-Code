
/**
 *  File: PAssign06.java
 *  Author: Seraphina Morrison
 *  Created: 10/15/2023
 *  Description: This program will allow the user to enter a string and char.
 *  Will then check if the char is in the string, and give the user the 
 *  reverse of their string
 */
import java.util.Scanner;

public class PAssign06 {

	public static void main(String[] args) {

		// Declare and initialize variables
		String userString = "", reverseString = "";
		char userChar;
		int numberOfItterations;

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Loop to run as long as the user does not enter "STOP"
		while (!userString.equals("STOP")) {

			// Prompt user and store values
			System.out.print("Enter a string: ");
			userString = input.next();

			// If the user does not enter "STOP" the loop continues
			if (!userString.equals("STOP")) {

				// Prompt user and store values
				System.out.print("Enter a character: ");
				userChar = input.next().charAt(0);

				// Run method and store values
				numberOfItterations = countCharacters(userString, userChar);

				// Print results through method
				printCount(userString, userChar, numberOfItterations);

				// Run method and store values
				reverseString = reverseString(userString);

				// Print results
				System.out.printf("The reverse of %s is %s%n%n", userString, reverseString);
			}
		}
	}

	public static int countCharacters(String word, char letter) {

		int count = 0; // Initialize count variable

		// For loop that runs until the whole string has been evaluated
		for (int i = 0; i < word.length(); i++) {

			/*
			 * If the character at the value of i equals the character the count variable
			 * increases by one
			 */
			if (word.charAt(i) == letter) {
				count++;
			}
		}
		return count;
	}

	public static void printCount(String aWord, char aLetter, int number) {

		// Print results
		System.out.printf("%c occurs in %s %d times%n", aLetter, aWord, number);
	}

	public static String reverseString(String userWord) {

		// Initialize variable
		String reverse = "";

		// For loop that iterates for the length of the word
		for (int i = userWord.length() - 1; i >= 0; i--) {

			// Creates new reversed string
			reverse = reverse + userWord.charAt(i);
		}
		return reverse;

	}
}
