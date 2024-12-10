import java.util.Scanner;

public class SkeletonMonsterFight {

	private static Scanner input = new Scanner(System.in);
	private static Utilities utilities = new Utilities();
	private static SkeletonMonster currentMonster = new SkeletonMonster();
	private static Character currentPlayer = new Character();
	private int damage;
	private int userChoice;
	private int monsterNewHealth;
	private int playerNewHealth;

	public SkeletonMonsterFight() {
		damage = 0;
		userChoice = 0;
		monsterNewHealth = 0;
		playerNewHealth = 0;
	}

	public void promptFight() {

		// Prompt user
		System.out.print("Do you want to fight?\nEnter 1 for yes\nEnter 2 for no\n");
		int userChoice = (int) input.nextInt();

		if (userChoice > 0) {

			if (userChoice == 1) {
				do {
					startFight();
				} while (currentMonster.getHealth() > 0 && currentPlayer.getHealth() > 0);
			} else if (userChoice == 2) {
				System.out.println("You declined to fight");
			} else {
				utilities.errorMessage();
				promptFight();
			}
		} else {
			utilities.errorMessage();
			promptFight();
		}
	}

	public void startFight() {

		int playerRoll, monsterRoll;

		playerRoll = enterToRoll();
		monsterRoll = utilities.d20();
		continueFight(playerRoll, monsterRoll);
	}

	public void continueFight(int playerRoll, int monsterRoll) {

		// Print roll results
		printRoll(playerRoll, currentPlayer.getName());

		// Display stats
		System.out.printf("Monster current health: %d%n%n", currentMonster.getHealth());

		// Description
		printAttackLn(currentPlayer.getName());

		// Calculate new monster health
		damage = attack(currentPlayer.getStrength(), playerRoll, currentPlayer.getLevel());
		monsterNewHealth = currentMonster.getHealth() - damage;

		// Set monsters health
		currentMonster.setHealth(monsterNewHealth);

		if (currentMonster.getHealth() > 0) {
			// Display stats
			System.out.printf("Monster current health: %d%n%n", currentMonster.getHealth());
		} else {
			System.out.printf("You slayed the %s", currentMonster.getName());
			currentPlayer.setLevel(currentPlayer.getLevel() + 1);
		}

		if (currentMonster.getHealth() > 0) {
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
			} else {
				System.out.printf("The %s slayed the %s", currentMonster.getName(), currentPlayer.getName());
			}
		}

	}

	public int attack(int strength, int roll, int level) {
		return damage = ((roll * 2 + strength) * 2) + level;
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
