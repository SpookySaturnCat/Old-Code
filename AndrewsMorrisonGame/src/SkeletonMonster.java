
public class SkeletonMonster {

	Character character = new Character();
	static Utilities utilities = new Utilities();
	
	private String name;
	private String alignment;
	private String[] alignmentChart = {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
	private int health;
	private int stamina;
	private int fp;
	private int strength;
	private int intelligence;
	private int charisma;
	private int perception;
	private int dexterity;
	private int slieghtOfHand;
	private int sneak;
	private int faith;
	private int survival;
	private int arcane;
	private int experience;
	private int level;
	
	public SkeletonMonster() {
		
		name = "Skeleton Monster";
		alignment = alignmentChart[8];
		health = 130;
		stamina = 150;
		fp = 70;
		strength = utilities.d20() + 2;
		intelligence = utilities.d20() + 2;
		charisma = utilities.d20() + 2;
		perception = utilities.d20() + 2;
		dexterity = utilities.d20() + 2;
		slieghtOfHand = utilities.d20() + 2;
		sneak = utilities.d20() + 2;
		faith = utilities.d20() + 2;
		survival = utilities.d20() + 2;
		arcane = utilities.d20() + 2;
		experience = utilities.d20() + 2;
		level = 2;
	}	
	
	public int getHealth() {
		return health;
	}
	
	public int getStrength()
	{
		return strength;
	}
	public void setHealth(int newHealth) {
		health = newHealth;
	}

	public void setName(String newName) {

		name = newName;
	}
	
	public String getName() {
		return name;
	}

	public void setAlignment(String newAlignment) {
		alignment = newAlignment;
	}

	public void setStamina(int newStamina) {
		stamina = newStamina;
	}

	public void setFP(int newFP) {
		fp = newFP;
	}

	public void setStrength(int newStrength) {
		strength = newStrength;
	}

	public void setIntelligence(int newIntelligence) {
		intelligence = newIntelligence;
	}

	public void setCharisma(int newCharisma) {
		charisma = newCharisma;
	}

	public void setPerception(int newPerception) {
		perception = newPerception;
	}

	public void setDexterity(int newDexterity) {
		dexterity = newDexterity;
	}

	public void setSlieghtOfHand(int newSlieghtOfHand) {
		slieghtOfHand = newSlieghtOfHand;
	}

	public void setSneak(int newSneak) {
		sneak = newSneak;
	}

	public void setFaith(int newFaith) {
		faith = newFaith;
	}

	public void setSurvival(int newSurvival) {
		survival = newSurvival;
	}

	public void setArcane(int newArcane) {
		arcane = newArcane;
	}

	public void setExperience(int newExperience) {
		experience = newExperience;
	}

	public void setLevel(int newLevel) {
		level = newLevel;
	}
	
	public int getLevel () {
		return level;
	}
	public void printStats() {
		System.out.printf("Name: %s%nAlignment: %s%nHealth: %d%nStamina: %d%nFP: %d%nStrength: %d%n"
				+ "Intelligence: %d%nCharisma: %d%nPerception: %d%nDexterity: %d%nSleight Of Hand: %d%n"
				+ "Sneak: %d%nFaith: %d%nSurvival: %d%nArcane: %d%nExperience: %d%nLevel: %d"
				+ "%n-----------------%n", name, alignment, health, stamina, fp, strength,
				intelligence, charisma, perception, dexterity, slieghtOfHand, sneak, faith, 
				survival, arcane, experience, level);

	}
}
