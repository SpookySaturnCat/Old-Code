import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class UserTest {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// Recipes instances
		CreateRecipe bwdb = new CreateRecipe("Big Walk Dog Burger", 10);
		
		// Prompt to set name and pronouns
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		String[] pronouns = assignPronouns();

		// Create the instance of the users player
		User user = new User(name, pronouns);
		
		System.out.println("Lets test your cooking skills....");
		input.nextLine();
		
		// Cooking minigame (ISSUES WITH POPPING UP BEHIND ECLIPSE)
		bwdb.cook();
		user.setRecipes(user.getRecipes() + 1); // Add one to recipes variable
		
		// Saves the user's data to a text file
		Utilities.save(user);
	}

	// Method to assign and pass pronouns to String[] based on user input
	private static String[] assignPronouns() {

		// Initialize variables
		String[] pronouns = new String[2];
		int pronounChoice = 0;

		try {
			// Forces this interaction to happen once
			do {
				// Prompt user for pronoun choice
				System.out.printf("Which pronouns do you identify with?%n1: She/Her%n2: He/Him%n3: They/Them%n>:");
				pronounChoice = input.nextInt();
				
				// Makes sure choice is in the range
			} while (pronounChoice < 1 || pronounChoice > 3);

			// Catches invalid input
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.err.println("Entered value is not an integer");
		}

		// Switch case for populating array
		switch (pronounChoice) {
		case 1:
			pronouns[0] = "She";
			pronouns[1] = "Her";
			break;
		case 2:
			pronouns[0] = "He";
			pronouns[1] = "Him";
			break;
		case 3:
			pronouns[0] = "They";
			pronouns[1] = "Them";
			break;
		default:
			pronouns[0] = "She";
			pronouns[1] = "Her";
		}
		return pronouns;
	}
}
