
public class Dialog {

	
	public static void levelUp() {
		
		System.out.printf("You leveled up!%nCurrent lvl: %d%n",
				Player.getLevel());	
		}
	
	public static void firstInteraction(Player user) {
		
		Utilities.divider();
		Utilities.forceEnter();
		
		System.out.printf("Welcome to the wonderful world of Pokemon %s%n"
				+ "I am Professor Kalma, it is nice to finally meet you.%n", user.getName());
		Utilities.forceEnter();
		
		System.out.printf("In this world there are creatures called Pokemon.%n"
				+ "Trainers like yourself battle alongside them.%n"
				+ "Professors like me study them.%n");
		
		Utilities.forceEnter();

				System.out.printf("Speaking of studying Pokemon...%n"
				+ "My granddaughter Julie has been helping me with a project.%n%n"
				+ "It's called a Pokedex. It logs any Pokemon caught by a trainer.%n"
				+ "This data is so importangt to Professors like myself.%n"
				+ "I'm going to give you one now.%n");
				
		Utilities.forceEnter();
		
		Inventory.inventory[0] = "Pokedex";
		addedToInventory(0);
	}
	
	public static void addedToInventory(int i) {
		
		Utilities.divider();

		System.out.printf("\t\t**%s added to inventory**%n", Inventory.inventory[i]);
	}
	
	public static String choseStarter() {
		
		Utilities.divider();
		Utilities.forceEnter();
		
		System.out.printf("That Pokedex that I have you is a new version.%n"
				+ "Lets test it out.%n"
				+ "I have three Pokemon for you to choose from.%n");
		
				System.out.printf("Charamander, Bulbasaur, and Squirtle.%n%n"
				+ "%nCharmander is fire type%n"
				+ "Bulbasaur is grass type%n"
				+ "Squirtle is water type%n%n"
				+ "Which will you choose?%n"
				+ "Enter the name of the starter you want: ");
				String pokemon = Test.input.nextLine();
				
				if (!(pokemon.equalsIgnoreCase("Charamander") || pokemon.equalsIgnoreCase("Bulbasaur") || pokemon.equalsIgnoreCase("Squirtle"))) {
					
					invalidEntry();
					choseStarter();
 				}
				
		return pokemon;
	}

	public static void invalidEntry() {

		System.out.println("\nInvalid entry\nTry again");
	}
}
