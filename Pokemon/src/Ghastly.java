import java.util.Arrays;

public class Ghastly {
	
	Pokemon pokemon = new Pokemon();
	
	private String name;
	private String[] type = { "Ghost", "Poison" };
	private String pokedex;
	private String[] movesList = { "Confuse Ray", "Lick", "N/A", "N/A" };
	private int hpStat;
	private int attackStat;
	private int defenseStat;
	private int spAttackStat;
	private int spDefenseStat;
	private int speedStat;
	private int level;
	private int pokedexNumber;

	

	public Ghastly() {
		pokemon.setName("Ghastly");
		pokemon.setPokedex("It wraps its opponent in its gas-like body,\n"
				+ "slowly weakening its prey by poisoning it through the skin.");
		pokemon.setHpStat(30);
		pokemon.setAttackStat(35);
		pokemon.setDefenseStat(30);
		pokemon.setSpAttackStat(100);
		pokemon.setDefenseStat(35);
		pokemon.setSpeedStat(80);
		pokemon.setLevel(1);
		pokemon.setMovesList(movesList);
		pokemon.setTypeArray(type);
		pokemon.setPokedexNumber(92);

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
		
		System.out.printf("Name: %s%nLevel: %s%nPokedex#: %d%n%nType: %s%nMoves List: %s%n%n"
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
