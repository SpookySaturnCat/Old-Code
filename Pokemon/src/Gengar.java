import java.util.Arrays;

public class Gengar {
	
	Pokemon gengar = new Pokemon();
	
	private String name;
	private String[] type = { "Ghost", "Poison" };
	private String pokedex;
	private String[] movesList = { "Shadow Punch", "Lick", "Night Shade", "Hex" };
	private int hpStat;
	private int attackStat;
	private int defenseStat;
	private int spAttackStat;
	private int spDefenseStat;
	private int speedStat;
	private int level;
	private int pokedexNumber;

	

	public Gengar() {
		
		gengar.setName("Gengar");
		gengar.setPokedex("Lurking in the shadowy corners of rooms,"
				+ "\nit awaits chances to steal its preys life force.");
		gengar.setHpStat(60);
		gengar.setAttackStat(65);
		gengar.setDefenseStat(60);
		gengar.setSpAttackStat(130);
		gengar.setDefenseStat(75);
		gengar.setSpeedStat(110);
		gengar.setLevel(35);
		gengar.setMovesList(movesList);
		gengar.setTypeArray(type);
		gengar.setPokedexNumber(94);
	}
	
	public void getStats() {
		name = gengar.getName();
		pokedex = gengar.getPokedex();
		hpStat = gengar.getHpStat();
		attackStat = gengar.getAttackStat();
		defenseStat = gengar.getDefenseStat();
		spAttackStat = gengar.getSpAttackStat();
		level = gengar.getLevel();
		speedStat = gengar.getSpeedStat();
		spDefenseStat = gengar.getSpDefenseStat();
		pokedexNumber = gengar.getPokedexNumber();
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
