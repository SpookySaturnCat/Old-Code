/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 24, 2023
 *Lab3
 *This code prompts a user to enter an integer using the console window
 *input and checks to see if the integer is divisible by both 5 and 6,
 *neither, or only one of them using if else statements. Code repeaters 10 times 
 *and then the user is asked if they would like to practice again without closing
 *the console window */


import java.util.Scanner;

public class HwTest3 {
	public static void main(String[] args) {

		// import scanner
		Scanner input = new Scanner(System.in);

		// prompts user
		System.out.print("Would you like to practice your multiplication tables? " 
		+ "(Enter 'true' or 'false'). ");
		boolean userChoice = (boolean) input.nextBoolean();
		// variable that is increased after each loop
		int myNumber = 1;

		// starts program while user input is true
		while (userChoice == true) {
			// prompts user
			System.out.print("Please enter a number from 1-10 to begin practicing. ");
			// starting number is assigned to the value of user input
			int userNumber = (int) input.nextInt();

			// conditions to do while userChoice is true
			do {
				System.out.println("What does " + userNumber + " * " + myNumber + " equal?");
				int userAnswer = (int) input.nextInt();
				int trueAnswer = userNumber * myNumber;

				// if userAnswer is not true above conditions are repeated
				if (userAnswer != trueAnswer) {
					System.out.println("Try Again");
					myNumber--; // sets myNumber back to the missed number
				} else
					System.out.println("Correct!");
				// increases myNumber by 1
				myNumber++;
				// runs nested statements until myNumber is 10
			} while (myNumber < 11);
			// repeats or terminates program once above conditions are met
			System.out.print("Would you like to practice your multiplication tables? " 
			+ "(Enter 'true' or 'false'). ");
			userChoice = (boolean) input.nextBoolean();
		}
		// if user enters fault at the start of the do statement, this dialog pops up
		System.out.print("Goodbye!");

	}
}
