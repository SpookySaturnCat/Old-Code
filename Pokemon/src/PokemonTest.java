
public class PokemonTest {

	public static void main(String[] args) {

		Utilities util = new Utilities();

		// Ghastly
		Ghastly ghastly = new Ghastly();

		ghastly.getStats();
		ghastly.printStats();
		ghastly.printPokedex();
		util.lineDivider();

		// Haunter
		Haunter haunter = new Haunter();

		haunter.getStats();
		haunter.printStats();
		haunter.printPokedex();
		util.lineDivider();

		// Gengar
		Gengar gengar = new Gengar();

		gengar.getStats();
		gengar.printStats();
		gengar.printPokedex();
		util.lineDivider();

	}
}
