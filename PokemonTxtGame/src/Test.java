import java.util.Scanner;

public class Test {
	
	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Declare and initialize variables
		String starterName, starterType;
		int starterPokedexNumber = 0;
		
		// Create NPC objects
		Player julie = new Player("Julie", "she", "her");

		// Prompt for and store name
		String userName = PlayerSetUp.promptName();
		
		Utilities.line(); // Line for aesthetics 
		
		// Create the user's player
		Player user = new Player(userName);
		
		// Runs the pronoun options menu and returns its value
		PlayerSetUp.promptPronoun(user);
		
		Utilities.line(); // Line for aesthetics 
		
		// Print stats
		user.printStats();
		
		Utilities.line(); // Line for aesthetics 

		// Starts dialog with Professor Kalma
		Dialog.firstInteraction(user);
		
		input.nextLine(); // Forces a new line
					
		// Lets the user chose a starter and stores the name
		starterName = Dialog.choseStarter();		
		
		// Switch statement that determines type based off name
		switch (starterName.toUpperCase()) {
		
		case "CHARAMANDER":
			starterType = "Fire";
			starterPokedexNumber = 0004;
			break;
		case "SQUIRTLE":
			starterType = "Water";
			starterPokedexNumber = 0007;
			break;
		case "BULBASAUR":
			starterType = "Grass";
			starterPokedexNumber = 0001;
			break;
			default:
				starterType = "";
		}
		
		Pokemon starter = new Pokemon(starterName, starterType, starterPokedexNumber);
		
		input.nextLine(); // Forces a new line

		starter.printStatsSingleType();
//		user.addAndCheckExperiencePoint(120);
	}
	
	
}
