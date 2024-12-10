import java.util.Arrays;
import java.util.Scanner;

public class ConvienceStore {

	public static Scanner input = new Scanner(System.in);
	private static String choice;
	
	public ConvienceStore() {
		choice = "";
	}

	public static void main(String[] args) {

		 startGame();
	}
	public static void startGame() {
		
		Utilities.line();
		System.out.print("\nWelcome to the convience store.\n"
				+ "Do you want to be the owner or customer?\n"
				+ "Enter \"Owner\" for owner\n"
				+ "Enter \"Customer\" for customer\n"
				+ "Your choice: ");
		choice = input.nextLine();

		if (choice.equalsIgnoreCase("owner")) {
			OwnerPlaythrough.randomizeTime();
			String[] chores = OwnerPlaythrough.ownerChoiceGetChores();
			OwnerPlaythrough.setChore(chores);
		} else if (choice.equalsIgnoreCase("customer")) {
		} else {
			Utilities.line();
			System.out.println("\nInvalid input."
					+ "\nEnter \"owner\" or \"customer\"");
			startGame();
		}
	}
}
