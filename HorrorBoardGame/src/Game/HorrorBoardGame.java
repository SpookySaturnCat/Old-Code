/**
 *  File: HorrorBoardGame.java
 *  Author: Seraphina Morrison
 *  Created: 09/16/2023
 *  Last Modified: 10/02/2023
 */
package Game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class HorrorBoardGame {

	// Create static scanner object
	static Scanner input = new Scanner(System.in);

	// Variables to be used in all methods
	static String playerName;
	static String currentHorrorIcon = "";
	static int dice;
	static int currentTileSpot = 0;
	static int round = 0;
	static int tilesLeft = 0;
	static int count = 0;
	static int faceHuggerCount = 0;
	static int faceHuggerCountLeft = 5;
	static boolean michealMyers = false;
	static boolean ghostface = false;
	static boolean hannibal = false;
	static boolean jigsaw = false;
	static boolean tomie = false;
	static boolean jason = false;
	static boolean frankenstiensMonster = false;
	static boolean xenomorph = false;

	// Variables just for printing a message to congratulate the user
	public static final int ART_SIZE_SMALL = 12;
	public static final int ART_SIZE_MEDIUM = 18;
	public static final int ART_SIZE_LARGE = 24;
	public static final int ART_SIZE_HUGE = 32;
	private static final String DEFAULT_ART_SYMBOL = "*";

	// Main method
	public static void main(String[] args) throws Exception {

		HorrorBoardGame artGen = new HorrorBoardGame();

		// Welcome menu for the game
		System.out.println("\t               **Welcome to the Horror Board Game**");
		System.out.println("\t               **We hope you have a pleasent stay**");
		System.out.println("\t                       **Well, that me be hard...");
		System.out.println("       In this game you will fight to survive against famous horror icons.");
		System.out.println("With 48 spaces, and plenty of suprises, your task is to make it to the next day...alive.");
		System.out.println("            You will have a dice that moves you from a range of 1-6.");
		System.out.println("       There are hidden special spaces on the board that have random events.");
		System.out.println("        Some of them can help you out, while others may cause your demise.");
		System.out.println("             Whenever there are scenarios with numbers with choices EX:"
				+ "              \n                                      1: Run"
				+ "              \n                                      2: Hide"
				+ "\n                      You would enter the numberic equivelent."
				+ "              \n           ***************************Such as: 1**********************");
		System.out.println("      So good luck out there, and enjoy your time playing the Horror Board Game.");
		System.out.println("                            Please hit enter to continue.");
		lineDivider();

		// Prompt user for name and stores
		playerNameSetUp();
		lineDivider();

		// First roll
		System.out.println("\nYou are starting at tile: " + currentTileSpot);
		System.out.println("Press enter to roll the dice and move forward.\n");
		input.nextLine();
		displayRollAndSpot();

		while (currentTileSpot <= 47) {
			switch (currentTileSpot) {
			case 1:
				safeSpace();
				displayRollAndSpot();
				break;
			case 2:
				forwardTwoSpaces();
				displayRollAndSpot();
				break;
			case 3:
				jigsawTile();
				displayRollAndSpot();
				break;
			case 4:
				michealMyersTile();
				displayRollAndSpot();
				break;
			case 5:
				safeSpace();
				displayRollAndSpot();
				break;
			case 6:
				ghostFaceTile();
				displayRollAndSpot();
				break;
			case 7:
				backTwoSpaces();
				break;
			case 8:
				jasonTile();
				displayRollAndSpot();
				break;
			case 9:
				safeSpace();
				displayRollAndSpot();
				break;
			case 10:
				pennywiseTile();
				displayRollAndSpot();
				break;
			case 11:
				tomieTile();
				displayRollAndSpot();
				break;
			case 12:
				forwardTwoSpaces();
				break;
			case 13:
				safeSpace();
				displayRollAndSpot();
				break;
			case 14:
				hannibalTile();
				displayRollAndSpot();
				break;
			case 15:
				chuckyTile();
				displayRollAndSpot();
				break;
			case 16:
				safeSpace();
				displayRollAndSpot();
				break;
			case 17:
				candyManTile();
				displayRollAndSpot();
				break;
			case 18:
				xenomorphTile();
				displayRollAndSpot();
				break;
			case 19:
				safeSpace();
				displayRollAndSpot();
				break;
			case 20:
				leatherfaceTile();
				displayRollAndSpot();
				break;
			case 21:
				ghostFaceTile();
				displayRollAndSpot();
				break;
			case 22:
				frankenstiensMonsterTile();
				displayRollAndSpot();
				break;
			case 23:
				backTwoSpaces();
				break;
			case 24:
				freddyKreugerTile();
				displayRollAndSpot();
				break;
			case 25:
				jasonTile();
				displayRollAndSpot();
				break;
			case 26:
				artTheClownTile();
				displayRollAndSpot();
				break;
			case 27:
				safeSpace();
				displayRollAndSpot();
				break;
			case 28:
				frankenstiensMonsterTile();
				displayRollAndSpot();
				break;
			case 29:
				forwardTwoSpaces();
				break;
			case 30:
				leatherfaceTile();
				displayRollAndSpot();
				break;
			case 31:
				safeSpace();
				displayRollAndSpot();
				break;
			case 32:
				jigsawTile();
				displayRollAndSpot();
				break;
			case 33:
				candyManTile();
				displayRollAndSpot();
				break;
			case 34:
				safeSpace();
				displayRollAndSpot();
				break;
			case 35:
				artTheClownTile();
				displayRollAndSpot();
				break;
			case 36:
				forwardTwoSpaces();
				break;
			case 37:
				xenomorphTile();
				displayRollAndSpot();
				break;
			case 38:
				tomieTile();
				displayRollAndSpot();
				break;
			case 39:
				safeSpace();
				displayRollAndSpot();
				break;
			case 40:
				chuckyTile();
				displayRollAndSpot();
				break;
			case 41:
				backTwoSpaces();
				break;
			case 42:
				pennywiseTile();
				displayRollAndSpot();
				break;
			case 43:
				hannibalTile();
				displayRollAndSpot();
				break;
			case 44:
				freddyKreugerTile();
				displayRollAndSpot();
				break;
			case 45:
				michealMyersTile();
				displayRollAndSpot();
				break;
			case 46:
				safeSpace();
				displayRollAndSpot();
				break;
			case 47:
				backTwoSpaces();
				break;
			}
		}

		// Congratulate user on beating the game
		lineDivider();
		input.nextLine();

		System.out.println();
		artGen.printTextArt("      YOU DID IT", HorrorBoardGame.ART_SIZE_SMALL);
		System.out.println();
		System.out.println();
		artGen.printTextArt("Congratulations!", HorrorBoardGame.ART_SIZE_SMALL);
		System.out.println();

		System.out.println("" + "\nCongratulations on beating the Horror Board Game!\nThank you so much for playing.");
	}

	// A method for ASCII art to close game
	public enum ASCIIArtFont {
		ART_FONT_DIALOG("Dialog"), ART_FONT_DIALOG_INPUT("DialogInput"), ART_FONT_MONO("Monospaced"),
		ART_FONT_SERIF("Serif"), ART_FONT_SANS_SERIF("SansSerif");

		private String value;

		public String getValue() {
			return value;
		}

		private ASCIIArtFont(String value) {
			this.value = value;
		}
	}

	/**
	 * Prints ASCII art for the specified text. For size, you can use predefined
	 * sizes or a custom size. Usage -
	 * printTextArt("Hi",30,ASCIIArtFont.ART_FONT_SERIF,"@");
	 * 
	 * @param artText
	 * @param textHeight - Use a predefined size or a custom type
	 * @param fontType   - Use one of the available fonts
	 * @param artSymbol  - Specify the character for printing the ascii art
	 * @throws Exception
	 */
	private void printTextArt(String artText, int textHeight, ASCIIArtFont fontType, String artSymbol)
			throws Exception {
		String fontName = fontType.getValue();
		int imageWidth = findImageWidth(textHeight, artText, fontName);

		BufferedImage image = new BufferedImage(imageWidth, textHeight, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		Font font = new Font(fontName, Font.BOLD, textHeight);
		g.setFont(font);

		Graphics2D graphics = (Graphics2D) g;
		graphics.drawString(artText, 0, getBaselinePosition(g, font));

		for (int y = 0; y < textHeight; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < imageWidth; x++)
				sb.append(image.getRGB(x, y) == Color.WHITE.getRGB() ? artSymbol : " ");
			if (sb.toString().trim().isEmpty())
				continue;
			System.out.println(sb);
		}
	}

	/**
	 * Convenience method for printing ascii text art. Font default - Dialog, Art
	 * symbol default - *
	 * 
	 * @param artText
	 * @param textHeight
	 * @throws Exception
	 */
	private void printTextArt(String artText, int textHeight) throws Exception {
		printTextArt(artText, textHeight, ASCIIArtFont.ART_FONT_DIALOG, DEFAULT_ART_SYMBOL);
	}

	/**
	 * Using the Current font and current art text find the width of the full image
	 * 
	 * @param textHeight
	 * @param artText
	 * @param fontName
	 * @return
	 */
	private int findImageWidth(int textHeight, String artText, String fontName) {
		BufferedImage im = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		Graphics g = im.getGraphics();
		g.setFont(new Font(fontName, Font.BOLD, textHeight));
		return g.getFontMetrics().stringWidth(artText);
	}

	/**
	 * Find where the text baseline should be drawn so that the characters are
	 * within image
	 * 
	 * @param g
	 * @param font
	 * @return
	 */
	private int getBaselinePosition(Graphics g, Font font) {
		FontMetrics metrics = g.getFontMetrics(font);
		int y = metrics.getAscent() - metrics.getDescent();
		return y;
	}

	// Method that prompts for and stores user's name
	public static void playerNameSetUp() {

		input.nextLine(); // forces user to his enter
		System.out.print("Please enter your name: ");
		playerName = input.nextLine();
		System.out.println("Your name is " + playerName + "?\nIs that correct?\n");
		System.out.println("Please enter the number that reflects your position");
		System.out.println("1: Correct");
		System.out.println("2: Incorrect");
		int choice = input.nextInt(); // Stores their choice for switch statement

		// Determines user answer and guides them to correct case
		switch (choice) {
		case 1:
			System.out.println("Welcome, " + playerName + " lets get you started.\n");
			break;
		case 2:
			System.out.println("So, what is your name then?\n");
			playerNameSetUp();
			break;
		default:
			errorMessage();
			playerNameSetUp();
		}
	}

	// For aesthetics
	public static void lineDivider() {

		System.out.println(
				"------------------------------------------------------------------------------------------------");
	}

	// Method that rolls, displays information
	public static void displayRollAndSpot() {

		input.nextLine(); // Forces the user to hit enter
		lineDivider(); // Displays a line divider

		// Generate random number 1-6 and add to currentTileSpot
		dice = (int) ((Math.random() * 6) + 1);
		currentTileSpot += dice;

		// Computes how many tiles the user has until they finish the game
		tilesLeft = 48 - currentTileSpot;
		round++; // Increases round count

		// Prints information to user
		System.out.println("\nYou rolled a: " + dice);
		System.out.println("Your current position is on tile: " + currentTileSpot);

		if (currentTileSpot % 2 == 0) { // If spot is even or odd
			System.out.println("You landed on an even space.");
		} else {
			System.out.println("You landed on an odd space.");
		}

		// Prints information to user
		System.out.println("You are on round: " + round + " of the game.");
		System.out.println("You have " + tilesLeft + " tiles until you complete the game.\n");
		
		// If the faceHuggerCount is activated then there is a count after every round
				if (faceHuggerCount > 0 && faceHuggerCount < 5) {
					faceHuggerCount++;

					// Calculate faceHuggerCountLeft and display
					faceHuggerCountLeft = -faceHuggerCount;
					System.out.println("You have: " + faceHuggerCountLeft + " rounds before the facehugger kills you."
							+ "");
				}

				// If statement that kills you if you went five rounds after an attack with a
				// facehugger
				if (faceHuggerCount >= 5) {
					currentHorrorIcon = "Xenomorph";
					youLose();
				}
		lineDivider();

		
	}

	public static void displayCurrentTileSpot() {

		input.nextLine(); // Forces the user to hit enter
		System.out.println("Your current position is on tile: " + currentTileSpot + "\n");
		lineDivider();
	}

	public static void displayTileName() {
		System.out.printf("You landed on a %s tile\n", currentHorrorIcon);
	}

	// Method that terminates the program
	public static void youLose() {

		input.nextLine(); // Forces the user to hit enter
		lineDivider();
		System.out.println(currentHorrorIcon + " killed you.");
		System.out.println("You lost the game.\nThank's for playing and better luck next time.");
		System.exit(0); // Terminates the program
	}

	// Method that displays an error message
	public static void errorMessage() {

		System.out.println("Thats not a valid input. Try again.\n");
	}

	// Method that does nothing to player on the board
	public static void safeSpace() {

		input.nextLine(); // Forces the user to hit enter
		System.out.println("You landed on a safe space.\nRoll again to continue.\n");
	}

	// Method that forces user back two spaces
	public static void backTwoSpaces() {

		input.nextLine(); // Forces the user to hit enter
		System.out.println("You landed on a tile that moves you back two spaces.\n");
		currentTileSpot -= 2;
		displayCurrentTileSpot();
	}

	// Method that moves player up two extra spaces
	public static void forwardTwoSpaces() {

		input.nextLine(); // Forces the user to hit enter
		System.out.println("You landed on a tile that moves you up two spaces.\n");
		currentTileSpot += 2;
		displayCurrentTileSpot();
	}

	// Method that forces an interaction with Ghostface
	public static void ghostFaceTile() {

		input.nextLine(); // Forces user to hit enter

		// Set current horror icon (only happens if they can kill the user)
		currentHorrorIcon = "Ghostface";

		// Let user know their tile status
		displayTileName();
		System.out.println("What's your favorite scary movie?\n");

		// Create and initialize count
		int count = 0;

		// Runs this block if the user has not landed on a ghostface tile
		if (ghostface == false && count <= 3) {
			input.nextLine(); // Forces the user to hit enter

			// Prompt user
			System.out.println("Please enter the number that reflects your position:\n1: Halloween\n2: Scream"
					+ "\n3: Friday the 13th\n4: The Shining");
			int favoriteScaryMovie = (int) input.nextInt(); // Store their answer

			// Selection statement to decide the users fate
			if (favoriteScaryMovie == 1) {
				System.out.println("...Micheal Myers? Really? I should stab you for that.");
				input.nextLine();
				System.out.println("You are dead to me.");
				youLose();
			} else if (favoriteScaryMovie == 2) {
				System.out.println("I am honored.\nYou survived this interaction.");
				count++; // Increase count
				input.nextLine();
			} else if (favoriteScaryMovie == 3) {
				System.out.println("Everyone knows the third is the best.\nWrong choice!");
				input.nextLine();
				youLose();
			} else if (favoriteScaryMovie == 4) {
				System.out.println(
						"You should die for that....but it is an acceptable answer.\nYou survived this interaction.");
				count++; // Increase count
				input.nextLine();
			} else { // If the user inputs something incorrectly an error dialog pops up and the
						// method restarts
				errorMessage();
				ghostFaceTile();
			}
			ghostface = true;
		}

		// Else statement that runs if the user has landed on a ghostface tile before
		else {
			input.nextLine();
			// Prompt user and store their response
			System.out.println("Spell it out for me this time.");
			System.out.print("Please enter your favorite scary movie: ");
			String favoriteScaryMovieSpelled = input.nextLine();

			// Makes sure the user entered a choice from previous round
			if (!favoriteScaryMovieSpelled.equalsIgnoreCase("scream")
					&& !favoriteScaryMovieSpelled.equalsIgnoreCase("halloween")
					&& !favoriteScaryMovieSpelled.equalsIgnoreCase("friday the 13th")
					&& !favoriteScaryMovieSpelled.equalsIgnoreCase("the shining")) {
				System.out.println(
						"You entered something incorrectly.\nHint: Has to be an option from a previous Ghostface tile.");
				ghostFaceTile();
			}
			// If else statement to determine their fate
			if (favoriteScaryMovieSpelled.equalsIgnoreCase("scream")
					|| favoriteScaryMovieSpelled.equalsIgnoreCase("the shining")) {
				System.out.println("Congratulations, you may continue to live another day.");
				count++;
			} else {
				System.out.println("What a shame, another wrong answer means another victim.");
				input.nextLine();
				youLose();
			}
			ghostface = false;
		}
		if (count >= 3) {
			System.out.printf(
					"I'm kidding. You knew that answer again...Well at this point %s, I feel it'd be wrong to kill you."
							+ "\nSo I am going to send you to a safe space.",
					playerName);
			currentTileSpot = 27;
		}
	}

	// Method that forces an interaction with Jigsaw
	public static void jigsawTile() {

		currentHorrorIcon = "Jigsaw";
		input.nextLine(); // Forces the user to hit enter

		// Create and initilize variables
		String lottery = "";
		String guess = "";
		char lotteryDigit1 = '1';
		char lotteryDigit2 = '1';
		char guessDigit1 = '1';
		char guessDigit2 = '1';

		if (jigsaw == false) {
			System.out.printf("\nYou wake up in an abandon warehouse.\nSuddenly on the tv you see %s with a message.\n"
					+ "\n\"Hello %s, I am happy to see you are awake.\nLet's play the lottery, test your luck.\"",
					currentHorrorIcon, playerName);

			// Prompt the user to enter a guess
			System.out.print("\nEnter your lottery pick (two digits): ");
			guess = input.nextLine();

			// Create lottery number and print to user
			lottery = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);
			System.out.println("\nThe lottery number is " + lottery);

			// Get digits from lottery
			lotteryDigit1 = lottery.charAt(0);
			lotteryDigit2 = lottery.charAt(1);

			// Get digits from guess
			guessDigit1 = guess.charAt(0);
			guessDigit2 = guess.charAt(1);

			// Check the guess
			if (guess.equals(lottery)) {
				System.out.println("Exact match: you win immunity");
			} else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
				System.out.println("Match all digits: you win immunity");
			} else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
					|| guessDigit2 == lotteryDigit2) {
				System.out.println("Match one digit: you win immunity");
			} else {
				System.out.println("Sorry, no match. You have no fate on your side.");
				youLose();
			}
		} else {
			if (guess.equals(lottery)) {
				System.out.println("You won immunity last round so you are safe.");
			} else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
				System.out.println("You matched all the digits...I feel nice today, leave.");
			} else {
				System.out.println("Match one digit: your immunity ran out this round");
				youLose();
			}
		}
		jigsaw = true;
	}

	// Method that forces an interaction with Micheal Myers
	public static void michealMyersTile() {

		// Set current horror icon
		currentHorrorIcon = "Michael Myers";

		// Let user know their tile status
		displayTileName();

		// If statement that forces the user to get this dialog if they haven't landed
		// on a Myers tile before
		if (michealMyers == false) {
			// Prompt user
			System.out.println("\nYou need to hide.\nWhere do you want to go?\n");
			System.out.println("Please enter the number that reflects your position:\n1: The bathroom\n2: Laurie's room"
					+ "\n3: The broom closet");
			int choice = (int) input.nextInt();

			// Selection statement that decides your fate
			if (choice == 1 || choice == 3) {
				System.out.println("\nThe floorboard creeks right next to your hiding spot.");
				System.out.println("As you hold your breathe he stops in his tracks.\n");
				input.nextLine();
				System.out.println("Just as you think door is going to fly open, he continues walking away.");
				System.out.println("You survided this interaction.");
			} else if (choice == 2) {
				System.out.println("\nJust as you shut the door behind you, you hear it start to rattle.");
				System.out.println("Before you can even find a place to hide, Micheal lunges at you with a knife.\n");
				input.nextLine();
				youLose();
			} else {
				errorMessage();
				michealMyersTile();
			}
		}

		// Else statement that runs if user has landed on Myers tile
		else {
			System.out.println("You need to hide.\nWhere do you want to go?\n");
			System.out.println(
					"Please enter the number that reflects your position:\n1: The shed\n2: Under a car\n3: In a tree");
			int choice = (int) input.nextInt();

			// Selection statement that decides your fate
			if (choice == 2 || choice == 3) {
				System.out.println("Micheal walked straight past you.");
				input.nextLine();
				System.out.println("You survided this interaction.");
			} else if (choice == 1) {
				System.out.println("Just as you shut the door behind you, you hear it start to rattle.");
				System.out.println("Before you can even find a place to hide, Micheal lunges at you with a knife.");
				input.nextLine();
				youLose();
			} else {
				errorMessage();
				michealMyersTile();
			}
		}
		// After the first loop on this tile, the boolean is set to true so the user
		// gets the part two status if they land on the tile again
		michealMyers = true;
	}

	// Method that forces an interaction with Jason Voorhease
	public static void jasonTile() {

		currentHorrorIcon = "Jason";
		input.nextLine();

		displayTileName();

		if (jason == false) {

			// Prompt user and store choice
			System.out.println("So you want to come to Camp Crystal Lake?\nI hate to admit this to you, "
					+ "but this is a dangerous place.\nAvoid his mom..\nWhere do you want to go?"
					+ "\n1: The lake\n2: The cabin\n3: The outhouse");
			int choice = (int) input.nextInt();

			// Selection statement to guide outcomes
			switch (choice) {
			case 1:
				System.out.println("Big mistake!");
				youLose();
				break;
			case 2:
				System.out.println("You run into the cabin, and start to put things into the closet."
						+ "\nYou start to hear an older woman calling for her son\n"
						+ "\nShe starts peering into the windows of the cabin and you slip into the closet."
						+ "\nWhen she walks in she does not see you.\n\nYou survived this interaction.");
				break;
			case 3:
				System.out.println("Somehow it saved you!");
				break;
			default:
				errorMessage();
				jasonTile();
			}
		} else {

			// Prompt user and store their answer
			System.out.println("During the campfire songs someone mentions the woman calling for little \"Jason\"."
					+ "\nOthers admit they heard it, then suddenly the fire goes out."
					+ "\n\nWhat do you want to do?\n1: Tell the councelers to \"Knock it off\"\n2: Run to the bus"
					+ "\n3: Hide in the woods");
			int secondChoice = (int) input.nextInt();

			// Selection statement to guide user
			switch (secondChoice) {
			case 1:
				System.out.println("Who does that in a horror movie?");
				youLose();
				break;
			case 2:
				System.out.println(
						"\nYou run for your life, get in the car and leave the camp.\nYou survived this interaction.");
				break;
			case 3:
				System.out.println("As you run in the forest you start to hear a sound\nCh-Ch-Ch Ah-Ah-Ah");
				youLose();
				break;
			default:
				errorMessage();
				jasonTile();
			}
		}
		jason = true;
	}

	// Method that forces an interaction with Pennywise
	public static void pennywiseTile() {

		currentHorrorIcon = "Pennywise";
		input.nextLine(); // Forces user to hit enter

		// Generate a random number 0 - 100 and initialize userAnswer
		int randomNumber = (int) ((Math.random() * 101) + 1);
		int userAnswer = 0;

		// Prompt user
		displayTileName();
		System.out.println("Do you want to play a game?\nYou don't really have a choice..");

		// Loop that runs until user guesses random number
		while (userAnswer != randomNumber) {

			// Prompt user and store the user's answer
			System.out.print("\nChoose a number 1-100: ");
			userAnswer = (int) input.nextInt();

			// If user enter number greater than 100
			if (userAnswer > 100) {
				errorMessage();
				pennywiseTile();
			}

			// If else statement that directs the user in the right direction
			if (userAnswer == randomNumber) {
				System.out.println("Congratulations, you guessed correctly!");
			} else if (userAnswer > randomNumber) {
				System.out.println("Your number is larger than my number.");
			} else {
				System.out.println("Your number is smaller than my number.");
			}
		}
	}

	// Method that forces an interaction with Hannibal Lecter
	public static void hannibalTile() {

		currentHorrorIcon = "Hannibal";
		input.nextLine(); // Forces user to hit enter

		// Prompt user
		displayTileName();
		System.out.println("Time to see how smart you really are.\nAnswer incorrectly and it may be your demise.\n");

		// Trivia (needs boolean-2 iterations)
		if (hannibal == false) {

			// Prompt user and store their answer
			System.out.println(
					"Who directed The Shining (1970)?\n1: John Carpender\n2: William Friedkin\n3: Stanley Kubrick");
			int userAnswer = (int) input.nextInt();

			// Selection statement to determine the users fate
			if (userAnswer == 3) {
				System.out.printf(
						"\nCongratulations %s, you are a true horror connisour and earned my respects...for now.\n",
						playerName);
			} else if (userAnswer == 1 || userAnswer == 2) {
				System.out.println("Looks like you aren't all I thought you were...");
				youLose();
			} else {
				errorMessage();
				hannibalTile();
			}

			// If the user has landed on a hannibal tile before this block runs
		} else {

			// Prompt user and store their answer
			System.out.println("What was the little boy's name in Child's Play? (1988)\n1: Andy\n2: Dylan\n3: Danny");
			int userAnswer = (int) input.nextInt();

			// Selection statement to determine the users fate
			if (userAnswer == 1) {
				System.out.println("Congratulations, you have passed my tests.");
			} else if (userAnswer == 2 || userAnswer == 3) {
				System.out.println("Looks like you aren't all I thought you were...\n");
				youLose();
			} else {
				errorMessage();
				hannibalTile();
			}
		}
		hannibal = true;
	}

	// Method that forces an interaction with Chucky
	public static void chuckyTile() {

		currentHorrorIcon = "Chucky"; // Asigns the current horror icon to Chucky
		input.nextLine(); // Forces the user to hit enter

		displayTileName();

		System.out.println("Hi I'm Chucky, wanna play a game?");

		int count = 0; // Counter for rounds of minigame

		// Declare variables outside of while loop for optimized storage
		int randomNumber1;
		int randomNumber2;
		int userAnswer;

		// Prompts user
		displayTileName();
		System.out.println("Time to play a game.");

		// While loop that forces user to get 3 questions right in a row in order to
		// continue game
		while (count < 3) {

			// Generates random numbers for minigame 1-350
			randomNumber1 = (int) ((Math.random() * 350) + 1);
			randomNumber2 = (int) ((Math.random() * 350) + 1);

			// Prompt user
			System.out.println("Tell me, what is " + randomNumber1 + " + " + randomNumber2 + "?");
			userAnswer = (int) input.nextInt();

			// If else statement that adds or reset's their count
			if (randomNumber1 + randomNumber2 == userAnswer) {
				System.out.println("Correct.");
				count++;
			} else {
				System.out.println("Incorrect.");
				count = 0;
			}
		}
		// Prints message
		System.out.println("\nYou passed my test...this time.");
		input.nextLine();
	}

	// Method that forces an interaction with Tomie
	public static void tomieTile() {

		currentHorrorIcon = "Tomie"; // Assign current horror icon to Tomie
		input.nextLine(); // Force user to hit enter

		// Prompt user
		displayTileName();
		System.out.println("You must follow directions exactly, or Tomie may get mad.\n");

		if (tomie == false) {

			// Prompt user
			System.out.println(
					"Tomie wants some foie gras terrine.\nRun to the store and grab one of the ingredients for cooking!");
			input.nextLine();
			System.out.println("What are you grabbing from the store?\n1: Red Car Sonoma Coast Chardonnay"
					+ "\n2: Burmester Novidade Reserve Vintage"
					+ "\n3: Baugette\n4: Pain De Epices\n5: Fig Compote\n6: Blueberry Compote");
			int choice = (int) input.nextInt();
			input.nextLine(); // Force the user to hit enter

			if (choice > 6 || choice < 1) {
				errorMessage();
				tomieTile();
			} else if (choice == 2) {
				System.out.println("Good, this is exactly what I wanted.");
			} else if (choice == 1) {
				System.out.println("How dare you disrespect me with this cheap wine!?\nYou'll pay for that.");
				youLose();
			} else {
				System.out.println(
						"You can't follow my simple directions.\nKeywords: \"cook with\"!\nYou'll pay for that.");
				youLose();
			}

		} else {

			// Prompt user and store their answer
			System.out.println("Time to cook the foie gras terrine.\nFollow all Tomie's directions exactly.");
			System.out.println("First I need you to preheat the oven to 300\n");
			System.out.print("Preheat the oven to the correct temperature: ");
			double userInput = (double) input.nextDouble();

			// If else to determine fate
			if (userInput == 300) {
				System.out.println("\nThank you.\n");
			} else {
				System.out.println("You fool!");
				youLose();
			}
			// Prompt user again
			System.out.println(
					"Make a bain-marie.\n\n1: Cover the foie gras with wine\n2: Make a water bath to put in the oven");
			System.out.println("What do you want to do?");
			userInput = (int) input.nextInt();
			if (userInput == 1) {
				System.out.println("You really are not up to par.");
				youLose();
			} else if (userInput != 2) {
				errorMessage();
				tomieTile();
			} else {
				System.out.println("Thank you. I will have my maid tend to the rest. Goodbye.");
			}
		}
		tomie = true;
	}

	// Method that forces an interaction with the Candy Man
	public static void candyManTile() {

		currentHorrorIcon = "The Candy Man";
		input.nextLine();

		displayTileName();

		System.out.println("What are you going to say in the mirror?");
		System.out.print("\nType a single word here: ");
		String userAnswer = input.nextLine();

		// if statements that kills the user if they say candyman 5 times
		if (userAnswer.equalsIgnoreCase("Candyman")) {

			System.out.print("And again: ");
			userAnswer = input.nextLine();
		}
		if (userAnswer.equalsIgnoreCase("Candyman")) {
			System.out.print("Keep going: ");
			userAnswer = input.nextLine();
		}
		if (userAnswer.equalsIgnoreCase("Candyman")) {
			System.out.print("Say it again: ");
			userAnswer = input.nextLine();
		}
		if (userAnswer.equalsIgnoreCase("Candyman")) {
			System.out.print("One more time: ");
			userAnswer = input.nextLine();
		}
		if (userAnswer.equalsIgnoreCase("Candyman")) {
			System.out.print("You're mine now.");
			input.nextLine(); // Force the user to hit enter
			youLose();
		}

		// Prompt user
		System.out.printf("Do you have anything else to say besides \"%s\"?\n1: Yes\n2: No\n\n", userAnswer);

		int choice = (int) input.nextInt();

		switch (choice) {
		case 1:
			// Prompt user
			input.nextLine();
			System.out.print("\nThen say it: ");
			userAnswer = input.nextLine();

			// if statements that kills the user if they say candyman 5 times in a row
			if (userAnswer.equalsIgnoreCase("Candyman")) {

				System.out.print("And again: ");
				userAnswer = input.nextLine();
			}
			if (userAnswer.equalsIgnoreCase("Candyman")) {
				System.out.print("Keep going: ");
				userAnswer = input.nextLine();
			}
			if (userAnswer.equalsIgnoreCase("Candyman")) {
				System.out.print("Say it again: ");
				userAnswer = input.nextLine();
			}
			if (userAnswer.equalsIgnoreCase("Candyman")) {
				System.out.print("One more time: ");
				userAnswer = input.nextLine();
			}
			if (userAnswer.equalsIgnoreCase("Candyman")) {
				System.out.print("You're mine now.");
				input.nextLine(); // Force the user to hit enter
				youLose();
			}
			break;
		case 2:
			System.out.println("\nSmart.");
			break;
		default:
			errorMessage();
			candyManTile();
		}
	}

	// Method that forces an interaction with Art The Clown
	public static void artTheClownTile() {

		// Display current tile information to user
		currentHorrorIcon = "Art The Clown";
		input.nextLine();
		displayTileName();

		// Generate coin number
		int coin = (int) Math.random() * 2;

		// Prompt user for their guess
		System.out.println("Flip a coin\n1: heads\n2: Tails");
		int guess = input.nextInt();

		// Selection statement that determines the users fate
		if (guess == coin) {
			System.out.println("\nWell you live to see another day...or should I say tile.");
		} else if (guess > 1 || guess < 0) {
			errorMessage();
			artTheClownTile();
		} else {
			System.out.println("\nNot your lucky day.");
			youLose();
		}
	}

	// Method that forces an interaction with a Xenomorph
	public static void xenomorphTile() {

		// Display current tile information
		currentHorrorIcon = "Xenomorph";
		input.nextLine();
		displayTileName();

		if (xenomorph == false) {
			System.out.printf(
					"%s stares at you, and runs after you."
							+ "\nYou are able to lock youself in a room, but suddenly a %s attacks you from behind."
							+ "\n**You have a face hugger on you.**\nYou have 5 more rolls before you perish.",
					currentHorrorIcon, currentHorrorIcon);
			faceHuggerCount++;
		} else {
			System.out.println("Sadly the facehugger got you sooner than expected.");
			youLose();
		}
		xenomorph = true;
	}

	// Method that forces an interaction with a Leatherface
	public static void leatherfaceTile() {

		// Display current tile information
		currentHorrorIcon = "Leatherface";
		input.nextLine();
		displayTileName();
		System.out.println("\nYou ran away from him so fast you went up three spaces");
		currentTileSpot += 3;
		displayCurrentTileSpot();
	}

	// Method that forces an interaction with Nosferactu
	public static void frankenstiensMonsterTile() {

		// Display current tile information
		currentHorrorIcon = "Frankenstien's Monster";
		input.nextLine();
		displayTileName();

		if (frankenstiensMonster == false) {
			System.out.printf("%s is confused about the world the world, but has has learned some things."
					+ "\nHe knows he likes honest people."
					+ "\nTwo truths and a lie will help him decide what to do with you." + "\nFind the lie."
					+ "\n\n1: In The Ring people have 7 days to live after watching the video tape."
					+ "\n2: It took 7 years to make Aliens." + "\n3: Charles James Ray was Chucky's real name.\n\n",
					currentHorrorIcon);
			int choice = input.nextInt();

			// Selection statement to determine the user's fate
			switch (choice) {
			case 1:
				System.out.println("That's not the lie! C'mon now....");
				youLose();
				break;
			case 2:
				System.out.println("That's not the lie!");
				youLose();
				break;
			case 3:
				System.out.println("That is the lie!\n\nYou survived this interaction.");
				break;
			default:
				errorMessage();
				frankenstiensMonsterTile();
			}
		} else {
			System.out.printf("%s is confused about the world the world, but has has learned some things."
					+ "\nHe knows he likes honest people."
					+ "\nTwo truths and a lie will help him decide what to do with you." + "\nFind the lie."
					+ "\nThis time find the iccorect quote."
					+ "\n\n1: \"It’s not the house that’s haunted… It’s your son\" - Insidious"
					+ "\n2: \"It rubs the lotion on its skin or else it gets the hose again\" - Psycho"
					+ "\n3: \"Here's Johnny!\" - The Shining\n\n", currentHorrorIcon);
			int choice = input.nextInt();

			// Selection statement to determine the user's fate
			switch (choice) {
			case 1:
				System.out.println("That's not the lie! C'mon now....");
				youLose();
				break;
			case 2:
				System.out.println("That is the lie!\\n\\nYou survived this interaction.");

				break;
			case 3:
				System.out.println("That's not the lie! C'mon now....");
				youLose();
				break;
			default:
				errorMessage();
				frankenstiensMonsterTile();
			}
		}
		frankenstiensMonster = true;
	}

	// Method that forces an interaction with Freddy Kreuger
	public static void freddyKreugerTile() {

		// Display current tile information
		currentHorrorIcon = "Freddy Kreuger";
		input.nextLine();
		displayTileName();

		System.out.println("Oh no, you fell asleep!\nGo back three spaces.");
		currentTileSpot -= 3;
		displayCurrentTileSpot();
	}

}
