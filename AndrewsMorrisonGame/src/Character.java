import java.util.Scanner;

public class Character {

	static Scanner input = new Scanner(System.in);
	Utilities utilities = new Utilities();
	Weapon weapon = new Weapon();

	private String name;
	private String alignment;
	private String[] alignmentChart = {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
	private int health;
	private int maxHealth;
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
	private String[] talents;
	private String head;
	private String chest;
	private String back;
	private String legs;
	private String hands;
	private String feet;
	private String mainHand;
	private String offHand;
	private int arrows;
	private int healthPotions;
	private int staminaPotions;
	private int focusPotions;
	private int[] inventorySlots;
	private int[] weaponStats;
	private String[] inventory;
	

	// Default no-args constructor.
	public Character() {
		alignment = alignmentChart[4];
		health = 100;
		maxHealth = 100;
		stamina = 100;
		fp = 100;
		setAlignment(alignmentChart[utilities.d9()]);
		setStrength(utilities.d20() + 2);
		setIntelligence(utilities.d20());
		setCharisma(utilities.d20());
		setPerception(utilities.d20());
		setDexterity(utilities.d20());
		setSlieghtOfHand(utilities.d20());
		setSneak(utilities.d20());
		setFaith(utilities.d20());
		setSurvival(utilities.d20());
		setArcane(utilities.d20());
		setName("Jane Doe");
		talents = new String[3];
		head = "";
		chest = "";
		back = "";
		legs = "";
		hands = "";
		feet = "";
		mainHand = "";
		offHand = "";
		arrows = 0;
		healthPotions = 0;
		staminaPotions = 0;
		focusPotions = 0;
		inventorySlots = new int[10];
		inventory = new String[10];
	}
	
	public void getStats() {
		System.out.printf("Name: %s%nAlignment: %s%nHealth: %d%nMax Health: %d%nStamina: %d%nFP: %d%nStrength: %d%nIntelligence: %d%n"
				+ "Charisma: %d%nPerception: %d%nDexterity: %d%nSleight Of Hand: %d%nSneak: %d%nFaith: %d%nSurvival: %d%n"
				+ "Arcane: %d%nExperience: %d%nLevel: %d%nTalents: %s, %s, %s%n-----------------%n"
				, name, alignment, health, maxHealth, stamina, fp, strength, intelligence, charisma, perception, dexterity,
				slieghtOfHand, sneak, faith, survival, arcane, experience, level, talents[0], talents[1], talents[2]);
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void setMaxHealth(int newMaxHealth) {
		maxHealth = newMaxHealth;
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
	
	public int getLevel() {
		return level;
	}
	// Slightly changed this to make it like your first one. removed the input
	public void setTalents() {
		for (int i = 0; i < talents.length; i++) {
			System.out.printf("Enter talent %d: ", i + 1);
			String newTalent = input.nextLine();
			talents[i] = newTalent;
		}
	}

	public void getEquipment() {

		System.out.printf(
				"Head: %s%nChest: %s%nBack: %s%nLegs: %s%nHands: %s%nFeet: %s%nMain Hand: %s%nOff Hand: %s%n-----------------%n",
				head, chest, back, legs, hands, feet, mainHand, offHand);
	}

	public void setHead(String newHead) {
		head = newHead;
	}

	public void setChest(String newChest) {
		chest = newChest;
	}

	public void setBack(String newBack) {
		back = newBack;
	}

	public void setLegs(String newLegs) {
		legs = newLegs;
	}

	public void setHands(String newHands) {
		hands = newHands;
	}

	public void setFeet(String newFeet) {
		feet = newFeet;
	}

	public void setMainHand(String newMainHand) {
		mainHand = newMainHand;
	}

	public void setOffHand(String newOffHand) {
		offHand = newOffHand;
	}

	public void getInventory() {
		System.out.printf(
				"Arrows: %d%nHealth Potions: %d%nStamina Potions: %d%nFocus Potions: %d%nInventory Slots: %d%n-----------------%n", arrows,
				healthPotions, staminaPotions, focusPotions, inventorySlots.length);
	}

	public void setArrow(int newArrows) {
		arrows = newArrows;
	}

	public void setHealthPotions(int newHealthPotions) {
		healthPotions = newHealthPotions;
	}

	public void setStaminaPotions(int newStaminaPotions) {
		staminaPotions = newStaminaPotions;
	}

	public void setFocusPotion(int newFocusPotions) {
		focusPotions = newFocusPotions;
	}

	public void setInventorySlots(int[] newInventorySlots) {
		inventorySlots = newInventorySlots;
	}
	
	
	public void setEquipped(int[] array) {
		
		weaponStats = array;
		
	}
	
	public int[] getEquipped() {
		return weaponStats;
	}

	
}
