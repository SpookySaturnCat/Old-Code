import java.util.Scanner;

public class Weapon {

	Utilities util = new Utilities();

	private String name;
	private String[] randomName = { "Goo Blaster", "Apocalypse", "Heartrazor", "Battleworn Ferocity",
			"Venom Incarnation", "Heartless Blade", "Hamstrung", "Edge of Madness", "Prick" };
	private String description;
	private String[] randomDesc = { "" };
	private String[] swordDesc = {
			"Hewn from an ice drake's fang, this sword's steel blade mimics frost patterns.\n\t     Renowned for sharpness and durability, it's a formidable weapon.",
			"Forged from volcanic obsidian, this sword retains heat for cauterizing wounds.\n\t     Its fire-resistant hilt allows controlled strikes in intense heat.",
			"Created under a celestial event, its moonlit blade and lightweight hilt enhance agility.\n\t     Known for balance and finesse, it's favored by skilled swordsmen.",
			"Tempered obsidian gives this blade a dark hue, perfect for stealth.\n\t     Its sleek design allows swift and silent maneuvers.",
			"Crafted during a storm, this steel blade, inspired by lightning, has a secure grip.\n\t     Lacking magic, its craftsmanship and design make it deadly in skilled hands." };
	private String[] bowDesc = {
			"Carved from the wood of an ancient frostpine tree, the Frostwind Longbow boasts an elegant yet sturdy design.\n\t     Its arrows, tipped with razor-sharp ice crystals, are known to freeze targets upon impact.\n\t     Crafted for precision, this bow is a favorite among skilled archers for its accuracy and deadly efficiency.",
			"Fashioned from the resilient wood of a fire-resistant emberwood tree, the Emberforge Flamecaster is a bow designed to withstand extreme temperatures.\n\t     Its arrows are dipped in a special fire-resistant oil, igniting upon release.\n\t     Archers wielding this bow can rain down fiery projectiles upon their foes with controlled precision.",
			"Carved under the rare glow of a lunar eclipse, this longbow features a silvery moonwood construction. Its arrows, fletched with feathers from nocturnal creatures, fly silently through the night. Known for its balance and accuracy, the Lunar Eclipse Longbow is a preferred choice for stealthy archers.",
			"Crafted from the darkened wood of shadowgrove trees, the Shadowstep Shadowbow blends seamlessly into the shadows.\n\t     Its arrows, with obsidian tips, strike with deadly precision, and the bow's lightweight design allows archers to move swiftly and unnoticed in dimly lit environments.",
			"Carved from the wood of a resilient stormbark tree, the Tempest Stormbow is designed to harness the power of the wind.\n\t     Its arrows, tipped with aerodynamic feathers, can pierce through the air with incredible speed.\n\t     Archers wielding this bow can shoot with remarkable swiftness, making it a favored choice for rapid and precise attacks." };
	private String[] wandDesc = {
			"Carved from the ancient Frostwood tree, this wand radiates a cool energy.\n\t     Its slender form is adorned with intricate frost patterns.\n\t     Known for precise spellcasting, the Frostwood Enchanter is a favorite among ice mages.",
			"Crafted from the charred wood of a mystical flame tree, this wand pulses with inner heat.\n\t     Its ember-shaped tip enhances fire spells, and the wand's grip, wrapped in flame-resistant material, ensures control during intense incantations.",
			"Formed during a celestial alignment, this wand's crystal core refracts moonlight.\n\t     Its lightweight construction and moonstone accents aid in graceful spellcasting, making it a choice tool for enchanters attuned to lunar energies.",
			"Hewn from the darkened heartwood of a shadow-infused tree, this wand seems to absorb light.\n\t     Its sleek design allows for swift spell gestures, and it is favored by practitioners of shadow magic for its stealthy charm.",
			"Forged from the wood of the legendary Thunderwood tree, this wand resonates with electrical energy.\n\t     Adorned with storm gems, it channels the power of lightning.\n\t     While lacking magical enhancements, its expert craftsmanship ensures precise spell control in the hands of a skilled wizard." };
	private String type;
	private String[] randomType = { "Sword", "Staff", "Gauntlet", "Bow", "Claws", "Lanturn", "Short Sword", "Flute",
			"Mirror", "Drum", "Scepter", "Glaive", "Shield", "Dagger", "Horn" };
	private String[] swordNames = { "Heartrazor", "Edge of Madness", "Heartless Blade", "Prick",
			"Battleworn Ferocity" };
	private String[] bowNames = { "Hamstrung", "Venom Incarnation" };
	private String[] wandNames = { "Goo Blaster", "Apocalypse" };
	private int damage;
	private int focusDamage;
	private double dmgPerSec;
	private int speed;
	private int range;
	private boolean isSingleHanded;
	private boolean isDuelWield;
	private String howManyHandsUsed;
	private String canBeDuelWielded;

	public Weapon() {

		type = "Default";
		name = "Default";
		description = "Default desc";
		damage = 1;
		focusDamage = 1;
		speed = 1;
		dmgPerSec = calcDPS(damage, speed);
		range = 1;
		isSingleHanded = true;
		isDuelWield = true;
		howManyHandsUsed = "Single handed";
		canBeDuelWielded = "Can be duel wielded";
	}
	
		public Weapon(String usrType) {
		
		if (usrType.equalsIgnoreCase("Sword")) {
			
			type = "Sword";
			name = swordNames[Utilities.randomIndex(swordNames)];
			description = swordDesc[Utilities.randomIndex(swordDesc)];
			damage = Utilities.d9() + 1;
			focusDamage = 0;
			speed = Utilities.d2() + 1;
			dmgPerSec = calcDPS(damage + focusDamage, speed);
			range = 3;
			isSingleHanded = true;
			isDuelWield = true;
			howManyHandsUsed = "Single handed";
			canBeDuelWielded = "Can be duel wielded";
			
		} else if (usrType.equalsIgnoreCase("Bow")) {
			
			type = "Bow";
			name = bowNames[Utilities.randomIndex(bowNames)];
			description = bowDesc[Utilities.randomIndex(bowDesc)];
			damage = Utilities.d9() + 1;
			focusDamage = 0;
			speed = Utilities.d2() + 1;
			dmgPerSec = calcDPS(damage + focusDamage, speed);
			range = 10;
			isSingleHanded = false;
			isDuelWield = false;
			howManyHandsUsed = "Two Handed";
			canBeDuelWielded = "Cannot be duel wielded";
			
		} else if (usrType.equalsIgnoreCase("Wand")) {
			
		type = "Wand";
		name = wandNames[Utilities.randomIndex(wandNames)];
		description = wandDesc[Utilities.randomIndex(wandDesc)];
		damage = 0;
		focusDamage = Utilities.d9() + 1;
		speed = Utilities.d2() + 1;
		dmgPerSec = calcDPS(damage + focusDamage, speed);
		range = 8;
		isSingleHanded = true;
		isDuelWield = true;
		howManyHandsUsed = "Single handed";
		canBeDuelWielded = "Can be duel wielded";
			
		} else {
			
			type = "Default";
			name = "Default";
			description = "Default desc";
			damage = 1;
			focusDamage = 1;
			speed = 1;
			dmgPerSec = calcDPS(damage, speed);
			range = 1;
			isSingleHanded = true;
			isDuelWield = true;
			howManyHandsUsed = "Single handed";
			canBeDuelWielded = "Can be duel wielded";
		}
	}

	public void setType(String newType) {
		type = newType;
	}

	public String getType() {
		return type;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setDesc(String newDesc) {
		description = newDesc;
	}

	public String getDesc() {
		return description;
	}

	public void setDamage(int newDamage) {
		damage = newDamage;
	}

	public int getDamage() {
		return damage;
	}

	public void setFocusDamage(int newFocusDamage) {
		focusDamage = newFocusDamage;
	}

	public int getFocusDamage() {
		return focusDamage;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void getDmgPerSec() {
		System.out.println(dmgPerSec);
	}

	public void setRange(int newRange) {
		range = newRange;
	}

	public int getRange() {
		return range;
	}

	public void setIsSingleHanded(boolean newIsSingleHanded) {
		isSingleHanded = newIsSingleHanded;
	}

	public Boolean getIsSingleHanded() {
		return isSingleHanded;
	}

	public void setIsDuelWield(boolean newIsDuelWield) {
		isDuelWield = newIsDuelWield;
	}

	public Boolean getIsDuelWield() {
		return isDuelWield;
	}
	
	int[] getNumericStats() {
		
		int[] weaponStats = {damage, focusDamage, speed, range,(isSingleHanded ? 1 : 0), (isDuelWield ? 1 : 0)};
		return weaponStats;
		
		
	}

	private double calcDPS(int damage, int speed) {
		double dps = damage * speed;
		return dps;

	}

	public void createWeapon() {
		Scanner input = new Scanner(System.in);

		System.out.printf("Enter the weapon type: ");
		setType(input.nextLine());

		System.out.printf("%nEnter the weapon name: ");
		setName(input.nextLine());

		System.out.printf("%nEnter the weapon description: ");
		setDesc(input.nextLine());

		System.out.printf("%nEnter the weapon damage: ");
		setDamage(input.nextInt());

		System.out.printf("%nEnter the weapon focus damage: ");
		setFocusDamage(input.nextInt());

		System.out.printf("%nEnter the weapon speed: ");
		setSpeed(input.nextInt());

		dmgPerSec = damage / speed;

		System.out.printf("%nEnter the weapon range: ");
		setRange(input.nextInt());

		System.out.printf("%nIs the weapon single handed (true or false): ");
		setIsSingleHanded(input.nextBoolean());

		System.out.printf("%nCan the weapon be duel wielded (true or false): ");
		setIsDuelWield(input.nextBoolean());

		if (isSingleHanded) {
			howManyHandsUsed = "Single handed";
		} else {
			howManyHandsUsed = "Two handed";
		}

		if (isDuelWield) {
			canBeDuelWielded = "Can be duel wielded";
		} else {
			canBeDuelWielded = "Cannot be duel wielded";
		}

	}

	public void generateRandomWeapon() {
		name = randomName[(int) (Math.random() * (randomName.length - 1))];
		type = randomType[(int) (Math.random() * (randomType.length - 1))];
		description = randomDesc[(int) (Math.random() * (randomDesc.length - 1))];
		damage = util.d9() + 1;
		focusDamage = util.d9() + 1;
		speed = util.d2() + 1;
		dmgPerSec = calcDPS(damage + focusDamage, speed);

	}

	public void getWeapon() {

		System.out.printf(
				"%s%n---------%nType: %s%nDescription: %s%nDamage: %d%nFocus damage: %d%nSpeed: %d%nDPS: %.2f%nRange: %d%n---%n%s%n%s%n%n",
				name, type, description, damage, focusDamage, speed, dmgPerSec, range, howManyHandsUsed,
				canBeDuelWielded);
	}
}
