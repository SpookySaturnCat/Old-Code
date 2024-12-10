/**
 * File: MeanMagicEightBallImproved.java
 * Author: Seraphina Morrison
 * Created: 08/30/23
 * Last Modified: 08/31/23
 */
package august;

import java.util.Scanner;
import java.util.Random;

public class MeanMagicEightBallImproved {

	// Create static Scanner object
	static Scanner input = new Scanner(System.in);

	// Main method
	public static void main(String[] args) {

		// Runs the prompting user method
		promptingUser();

		// Stores user input in userControls variable
		int userControls = input.nextInt();

		// If statement that runs the program if the user types 1
		if (userControls == 1) {
			// continues running program will user
			do {
				// Run the game if they enter run
				runGame();

				// Restarts the prompt user method so they can chose what to do
				promptingUser();
				userControls = input.nextInt();
			} while (userControls == 1);
		}

		// Terminates program if userControls number is not 1
		System.exit(0);
	}
 
	// Method to prompt user
	public static void promptingUser() {
		System.out.println("\nEnter 1 to play the Mean Magic Eight Ball game.");
		System.out.println("Enter 2 to exit the program.");
	}

	// Method that runs the game
	public static void runGame() {
		// Prompt user and store question
		System.out.println("\nWelcome to the Mean Magic Eight Ball!");
		System.out.println("Type your question below.");
		input.nextLine();
		String userQuestion = input.nextLine();

		// Generate random number 1-20 to assign in switch case
		Random randomGenerator = new Random();

		int min = 1;
		int max = 19;

		int randomValue = randomGenerator.nextInt(max + min) + min;

		// Switch cases for determining answer
		switch (randomValue) {
		case 1:
			System.out.println("I think you're an idiot for asking about \"" + userQuestion + "\".");
			break;
		case 2:
			System.out.println("Literally who gives a shit...");
			break;
		case 3:
			System.out.println("The day you stop mentioning \"" + userQuestion + "\" is the day I find peace.");
			break;
		case 4:
			System.out.println("It's pathetic that you care so much.");
			break;
		case 5:
			System.out.println("Only losers care about \"" + userQuestion + "\".");
			break;
		case 6:
			System.out.println("I regret even asking.");
			break;
		case 7:
			System.out.println("So let me get this straight.....");
			System.out.println("You came to me..a simple java program...");
			System.out.println("About " + userQuestion + "?");
			System.out.println("Yeah do us all a favor and jump off a bridge.");
			break;
		case 8:
			System.out.println("L BOZO");
			break;
		case 9:
			System.out.println("I don't get paid enough for this..");
			break;
		case 10:
			System.out.println("You know what's so annoying?");
			System.out.println("Loser's who ask me questions like \"" + userQuestion + "\".");
			break;
		case 11:
			System.out.println("There is no answer, you're just a cunt.");
			break;
		case 12:
			System.out.println("Whenever people start talking about \"" + userQuestion + " \" I turn my brain off.");
			break;
		case 13:
			System.out.println("Oh I bet your parents are real prouf of you...");
			break;
		case 14:
			System.out.println("The magic eight ball thinks you should be ashamed.");
			break;
		case 15:
			System.out.println("You finally get acsess to an all knowing being and you waste your question on \""
					+ userQuestion + "\"?");
			break;
		case 16:
			System.out.println("You should have been swallowed.");
			break;
		case 17:
			System.out.println("I don't wanna play this game anymore...");
			break;
		case 18:
			System.out.println("Mom I frew up");
			break;
		case 19:
			System.out.println("It sounds like you need a hobby.");
			break;
		case 20:
			System.out.println("It's really dumb that you think I care about that.");
		}
	}
}
