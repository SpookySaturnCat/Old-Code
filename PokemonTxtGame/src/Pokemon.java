import java.util.Arrays;

public class Pokemon {

	private String name;
	private String[] typeArray = new String[2];
	private String pokedex;
	private String[] movesList = {"N/A", "N/A", "N/A", "N/A"};
	private String type;
	private int hpStat;
	private int attackStat;
	private int defenseStat;
	private int spAttackStat;
	private int spDefenseStat;
	private int speedStat;
	private int level;
	private int pokedexNumber;

	public Pokemon() {

		name = "";
		pokedex = "";
		type = "";
		hpStat = 1;
		attackStat = 1;
		defenseStat = 1;
		spAttackStat = 1;
		spDefenseStat = 1;
		speedStat = 1;
		level = 1;
		pokedexNumber = 0;
	}
	
	public Pokemon(String name, String type, int pokedexNumber) {
		
		this();
		this.name = name;
		this.type = type;
		this.pokedexNumber = pokedexNumber;
		
	}

	public void setPokedexNumber(int newPokedexNumber) {
		pokedexNumber = newPokedexNumber;
	}

	public int getPokedexNumber() {
		return pokedexNumber;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setPokedex(String newPokedex) {
		pokedex = newPokedex;
	}

	public String getPokedex() {
		return pokedex;
	}

	public void setHpStat(int newHpStat) {
		hpStat = newHpStat;
	}

	public int getHpStat() {
		return hpStat;
	}

	public void setAttackStat(int newAttackStat) {
		attackStat = newAttackStat;
	}

	public int getAttackStat() {
		return attackStat;
	}

	public void setDefenseStat(int newDefenseStat) {
		defenseStat = newDefenseStat;
	}

	public int getDefenseStat() {
		return defenseStat;
	}

	public void setSpAttackStat(int newSpAttackStat) {
		spAttackStat = newSpAttackStat;
	}

	public int getSpAttackStat() {
		return spAttackStat;
	}

	public void setSpDefenseStat(int newSpDefenseStat) {
		spDefenseStat = newSpDefenseStat;
	}

	public int getSpDefenseStat() {
		return spDefenseStat;
	}

	public void setSpeedStat(int newSpeedStat) {
		speedStat = newSpeedStat;
	}

	public int getSpeedStat() {
		return speedStat;
	}

	public void setLevel(int newLevel) {
		level = newLevel;
	}

	public int getLevel() {
		return level;
	}

	public void setMovesList(String[] newMoves) {
		movesList = newMoves;
	}

	public void setTypeArray(String[] newType) {
		typeArray = newType;
	}

	public void setType(String newType) {
		type = newType;
	}

	public void printStatsMultipleType() {

		System.out.printf(
				"Name: %s%nLevel: %s%nPokedex#: %d%n%nType: %s%nMoves List: %s%n%n"
						+ "HP: %d%nAttack: %d%nDefense: %d%nSp Attack: %d%n" + "Sp Defense: %d%nSpeed: %d%n",
				name, level, pokedexNumber, Arrays.toString(typeArray), Arrays.toString(movesList), hpStat, attackStat,
				defenseStat, spAttackStat, spDefenseStat, speedStat);
	}

	public void printPokedex() {
		System.out.printf("%n%s", pokedex);
	}

	public void printStatsSingleType() {

		System.out.printf(
				"Name: %s%nLevel: %s%nPokedex#: %d%n%nType: %s%nMoves List: %s%n%n"
						+ "HP: %d%nAttack: %d%nDefense: %d%nSp Attack: %d%n" + "Sp Defense: %d%nSpeed: %d%n",
				name, level, pokedexNumber, type, Arrays.toString(movesList), hpStat, attackStat,
				defenseStat, spAttackStat, spDefenseStat, speedStat);
	}
}
