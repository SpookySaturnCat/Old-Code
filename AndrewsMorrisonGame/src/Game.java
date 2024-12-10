import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		// Create objects
		Scanner input = new Scanner(System.in);
		Character user = new Character();
		Monster monster = new Monster();
		MonsterFight fight = new MonsterFight();
		Utilities util = new Utilities();
		
		// Create and initialize variables
		String weaponChoice = "", userName = "";
		
		
		// Dumb skyrim joke lol
		System.out.println("Hey you, you're finally awake!\nYou were trying to cross the...");
		input.nextLine(); // For dramatics
		
		// Prompt user for name
		System.out.print("So anyways...tell us traveller, what should we call you?"
				+ "\nEnter your name here: ");
		userName = input.nextLine(); // Set the name
		user.setName(userName); // Set the name
		
		// Greet and prompt user
		System.out.printf("%nWelcome %s, it is nice to meet you.\nYou have started an untitled unfinished game.\n"
				+ "There is not too much right now but lets show off what we have.\n"
				+ "The first thing we would need the user to do is set up their character\n\n"
				+ "Out of these three choices, type the response you want:\n\"Wand\"\n"
				+ "\"Sword\"\n\"Bow\"\nEnter response here: ", user.getName());
		
		// Get input from the user to create an object and get the weapon
		weaponChoice = input.nextLine();
		Weapon weapon = new Weapon(weaponChoice);
		util.println();
		weapon.getWeapon();
		
		// Print character information
		user.getStats();
		user.getEquipment();
		user.getInventory();
		
		// Start fight for user
		System.out.printf("Now that a character is somewhat built its time to test your strength.%n%n");
		/*
		 *  Error with the default values of character being instated:(
		 */
		fight.promptFight();
		
	}
}
