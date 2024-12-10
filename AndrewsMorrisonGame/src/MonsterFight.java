import java.util.Scanner;

public class MonsterFight {

	private static Scanner input = new Scanner(System.in);
	private static Utilities utilities = new Utilities();
	private static Monster currentMonster = new Monster();
	private static Character currentPlayer = new Character();
	private static Weapon Sword = new Weapon("Sword");
	
	private static Game game = new Game();
	private int damage;
	private int monsterNewHealth;
	private int playerNewHealth;

	public MonsterFight() {

		damage = 0;
		monsterNewHealth = 0;
		playerNewHealth = 0;
		currentPlayer.setEquipped(Sword.getNumericStats());
	}

	public void promptFight() {

		// Prompt user
		System.out.print("Do you want to fight?\nEnter 1 for yes\nEnter 2 for no\n");
		int userChoice = (int) input.nextInt();

		// Makes sure user input is positive
		if (userChoice > 0) {

			if (userChoice == 1) { // If user enters 1
				do { // Repeat this method until the player or monster has no health
					rollForUserAndMonster();
				} while (currentMonster.getHealth() > 0 && currentPlayer.getHealth() > 0);
			} else if (userChoice == 2) { // Ends the program
				System.out.println("You declined to fight");
			} else { // Displays message and repeats method
				utilities.errorMessage();
				promptFight();
			}
		} else { // Displays message and repeats method
			utilities.errorMessage();
			promptFight();
		}
	}

	// Method to get initial rolls
	public void rollForUserAndMonster() {

		int playerRoll, monsterRoll;

		// Rolls for the player and monster
		playerRoll = enterToRoll();
		monsterRoll = utilities.d20();

		// Runs method with rolls as parameters and returns the value to currentPlayer
		currentPlayer.setHealth(fightAndReturnHP(playerRoll, monsterRoll));
	}

	public int fightAndReturnHP(int playerRoll, int monsterRoll) {

		// Print roll results
		printRoll(playerRoll, currentPlayer.getName());

		// Display starting health
		System.out.printf("Monster current health: %d%n%n", currentMonster.getHealth());

		// Descriptive text
		printAttackLn(currentPlayer.getName());

		// Calculate new monster health based on equipment
		if (currentPlayer.getEquipped() == null) {
			damage = attack(currentPlayer.getStrength(), playerRoll, currentPlayer.getLevel());
		} else {
			damage = attack(currentPlayer.getEquipped(), currentPlayer.getStrength(), playerRoll,
					currentPlayer.getLevel());
		}
		monsterNewHealth = currentMonster.getHealth() - damage;

		// Set monsters health
		currentMonster.setHealth(monsterNewHealth);

		// Checks the monsters health
		if (currentMonster.getHealth() > 0) {
			// Display stats
			System.out.printf("Monster current health: %d%n%n", currentMonster.getHealth());

			// Print roll results
			printRoll(monsterRoll, currentMonster.getName());

			// Display stats
			System.out.printf("%s current health: %d%n%n", currentPlayer.getName(), currentPlayer.getHealth());

			// Description
			printAttackLn(currentMonster.getName());

			// Calculate new player health
			damage = attack(currentMonster.getStrength(), monsterRoll, currentMonster.getLevel());
			playerNewHealth = currentPlayer.getHealth() - damage;

			// Set player health
			currentPlayer.setHealth(playerNewHealth);

			if (currentPlayer.getHealth() > 0) {
				// Display stats
				System.out.printf("%s current health: %d%n", currentPlayer.getName(), currentPlayer.getHealth());
				return playerNewHealth;
			} else {
				System.out.printf("The %s slayed the %s", currentMonster.getName(), currentPlayer.getName());
				return playerNewHealth;
			}
		} else { // The user slayed the monster
			System.out.printf("You slayed the %s", currentMonster.getName());
			
			// Set the level and maxHealth to new values
			currentPlayer.setLevel(currentPlayer.getLevel() + 1);
			currentPlayer.setMaxHealth(currentPlayer.getMaxHealth() + 10);
		}
		return playerNewHealth;
	}

	public int attack(int strength, int roll, int level) {
		return damage = ((roll * 2 + strength) * 2) + level;
	}

	// Overloaded with weapon.
	public int attack(int[] weaponStats, int strength, int roll, int level) {
		return damage = ((roll * 2 + strength) * 2) + level + weaponStats[0] + weaponStats[1];

	}

	public int enterToRoll() {

		// Prompt user
		System.out.println("\nHit enter to roll a d20:");
		input.nextLine(); // Force user to hit enter

		// Return value
		return utilities.d20();
	}

	public void printRoll(int roll, String name) {

		System.out.printf("%n%s rolled a: %d%n", name, roll);
	}

	public void printAttackLn(String name) {

		System.out.printf("%s attacks%n", name);
	}
}
