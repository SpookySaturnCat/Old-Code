/*
 *  Created: 11/23/23
 */
public class Potions {

	String name;
	String type;
	String recipe;
	int fpRecovery;
	int hpRecovery;
	int staminaRecovery;
	int fpDamage;
	int hpDamage;
	int staminaDamage;

	// Default no args constructor
	public Potions() {

		name = "Basic Health Recovery Potion";
		type = "Healing";
		recipe = "3 mini dragons tounge\n  cooked in a mystery stew";
		fpRecovery = 0;
		hpRecovery = 50;
		staminaRecovery = 0;
		fpDamage = 0;
		hpDamage = 0;
		staminaDamage = 0;
	}

	// Convenience constructor from hell
	public Potions(String name, String type, String recipe, int fpRecovery, int hpRecovery, int staminaRecovery,
			int fpDamage, int hpDamage, int staminaDamage) {

		setName(name);
		setType(type);
		setRecipe(recipe);
		setFpRecovery(fpRecovery);
		setHpRecovery(hpRecovery);
		setStaminaRecovery(staminaRecovery);
		setFpDamage(fpDamage);
		setHpDamage(hpDamage);
		setStaminaDamage(staminaDamage);

	}

	public Potions(String newName) {

		setType(typeOfPotion(newName));

	}
	
	public String typeOfPotion(String newName) {
		
		String newAttribute = "", damageOrRecovery = "", newType = "";
		
		if (newName.contains("Health")) {
			newAttribute = "Health ";
		}

		if (newName.contains("Stamina")) {
			newAttribute = "Stamina ";
		}
		
		if (newName.contains("Focus")) {
			newAttribute =  "Focus ";
		}
		
		if (newName.contains("Recovery")) {
			damageOrRecovery = "Recovery";
		}
		
		if (newName.contains("Damage")) {
			damageOrRecovery = "Damage";
		}
		
		newType = newAttribute + damageOrRecovery;
		
		return newType;
		}

	public String getInfo() {

		return String.format("Name: %s%nType: %s%nRecipe: %s%n%s%nHP Recovery: %d", name, type, recipe,
				divider("Potion"), hpRecovery);
	}

	public String divider(String word) {
		int length = 30 + word.length();
		String actualDivider = "";

		for (int i = 1; i < length; i++) {
			actualDivider += "" + "-";
		}

		return actualDivider;
	}

	public void wordDivider(String word) {
		System.out.printf("%n---------------%s--------------%n", word);
	}

	public void line() {
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getType() {
		return type;
	}

	public void setType(String newType) {
		type = newType;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String newRecipe) {
		recipe = newRecipe;
	}

	public int getFpRecovery() {
		return fpRecovery;
	}

	public void setFpRecovery(int newFpRecovery) {
		fpRecovery = newFpRecovery;
	}

	public int getHpRecovery() {
		return hpRecovery;
	}

	public void setHpRecovery(int newHpRecovery) {
		hpRecovery = newHpRecovery;
	}

	public int getStaminaRecovery() {
		return staminaRecovery;
	}

	public void setStaminaRecovery(int newStaminaRecovery) {
		staminaRecovery = newStaminaRecovery;
	}

	public int getFpDamage() {
		return fpDamage;
	}

	public void setFpDamage(int newFpDamage) {
		fpDamage = newFpDamage;
	}

	public int getHpDamage() {
		return hpDamage;
	}

	public void setHpDamage(int newHpDamage) {
		hpDamage = newHpDamage;
	}

	public int getStaminaDamage() {
		return staminaDamage;
	}

	public void setStaminaDamage(int newStaminaDamage) {
		staminaDamage = newStaminaDamage;
	}
}
