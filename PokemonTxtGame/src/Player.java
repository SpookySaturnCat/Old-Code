
public class Player {

	private static String name;
	public String[] pronoun = new String[2];
	private static int level;
	private static double currentXP;
	private static double xpMax;
	
	// Default no args constructor
	Player() {
		
		name = "Venus";
		pronoun[0] = "He";
		pronoun[1] = "Him";
		level = 1;
		currentXP = 0;
		xpMax = 100;
	}
	
	// Convenience constructor
	Player(String newName, String newPronounOne, String newPronounTwo) {
		
		this();
		setName(newName);
		setProunoun(newPronounOne, newPronounTwo);
	}
	
	Player(String newName) {
		this();
		setName(newName);
	}
	
	// Adds new XP to current XP and checks for a level up
	public void addAndCheckExperiencePoint(double newXP) {
		
		setCurrentXP(getCurrentXP() + newXP);
		
		if (getCurrentXP() >= getXPMax()) {
			setCurrentMax(getXPMax() * 1.5);
			setLevel(getLevel() + 1);
			Dialog.levelUp();
		}
	}

	private void setCurrentMax(double xpMax) {
		this.xpMax = xpMax;
	}

	// Acsessors and mutators
	public static double getCurrentXP() {
		
		return currentXP;
	}
	
	public static int getLevel() {
		return level;
	}
	
	public static double getXPMax() {
		return xpMax;
	}
	
	public static String getName() {
		return name;
	}
	
	private void setLevel(int level) {
		
		this.level = level;
	}

	private void setCurrentXP(double currentXP) {
		
		this.currentXP = currentXP;
	}
	
	private void setName(String name) {
		
		this.name = name;
	}
	
	private void setProunoun(String pronounOne, String pronounTwo) {

		pronoun[0] = pronounOne;
		pronoun[1] = pronounTwo;
	}

	public void printStats() {

		System.out.printf("Name: %s%n"
				+ "Pronouns: %s/%s%n"
				+ "Level: %d%n"
				+ "XP till level up: %.2f%n", 
				getName(), pronoun[0], pronoun[1], level,
				(getXPMax() - getCurrentXP()));
	}
}