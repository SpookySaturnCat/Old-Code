import java.util.Arrays;

public class Haunter {

	Pokemon pokemon = new Pokemon();
	private String name;
	private String[] type = { "Ghost", "Poison" };
	private String pokedex;
	private String[] movesList = { "Confuse Ray", "Lick", "Spite", "Curse" };
	private int hpStat;
	private int attackStat;
	private int defenseStat;
	private int spAttackStat;
	private int spDefenseStat;
	private int speedStat;
	private int level;
	private int pokedexNumber;
	

	public Haunter() {
		
		pokemon.setName("Haunter");
		pokemon.setPokedex("It can slip through any obstacle."
				+ "\nIt lurks inside walls to keep an eye on its foes.");
		pokemon.setHpStat(45);
		pokemon.setAttackStat(50);
		pokemon.setDefenseStat(45);
		pokemon.setSpAttackStat(115);
		pokemon.setDefenseStat(55);
		pokemon.setSpeedStat(95);
		pokemon.setLevel(25);
		pokemon.setMovesList(movesList);
		pokemon.setTypeArray(type);
		pokemon.setPokedexNumber(93);
		
	}
	
	public void getStats() {
		name = pokemon.getName();
		pokedex = pokemon.getPokedex();
		hpStat = pokemon.getHpStat();
		attackStat = pokemon.getAttackStat();
		defenseStat = pokemon.getDefenseStat();
		spAttackStat = pokemon.getSpAttackStat();
		level = pokemon.getLevel();
		speedStat = pokemon.getSpeedStat();
		spDefenseStat = pokemon.getSpDefenseStat();
		pokedexNumber = pokemon.getPokedexNumber();
	}
	
	public void printStats() {
		
		System.out.printf("Name: %s%nLevel: %s%nPokedex#%d: %n%nType: %s%nMoves List: %s%n%n"
				+ "HP: %d%nAttack: %d%nDefense: %d%nSp Attack: %d%n"
				+ "Sp Defense: %d%nSpeed: %d%n"
				, name, level, pokedexNumber, Arrays.toString(type), Arrays.toString(movesList),
				hpStat, attackStat, defenseStat,spAttackStat, spDefenseStat,
				speedStat);
	}

	public void printPokedex() {
		System.out.printf("%n%s", pokedex);
	}
	
}
