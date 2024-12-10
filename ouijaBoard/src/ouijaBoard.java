
/**\
 * File: ouijaBoard.java
 * Author(s): Justin Andrews, Philip Mejiha, and Seraphina Morrison
 * Created: 08/31/23
 * Last modified: 09/06/23
 * Description: we arent even sure yet tbh
 */

import java.util.concurrent.TimeUnit;

public class ouijaBoard {

	public static void main(String[] args) throws InterruptedException {

		// Normal Character List
		char[] normalChar = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		// String array that displays message
		String[] phrases = {"FUCK" };
		
		// Char array that I dont understand well tbh
		char[] phraseChars = phrases[0].toCharArray();

		// Count variable
		int count = 0;
		int charCount = 0;

		// While loop that runs until the phrases letter on the board are printed
		while (charCount != phraseChars.length) {
			char currentChar = phraseChars[charCount];

			System.out.println("           OUIJA");

			// While loop runs based on length of board
			while (count != 36) {

				if (count == 0) {
					System.out.print("  "); // Prints space
				}

				if (count == 12) {
					System.out.print("\n"); // Prints new line
				}

				if (count == 26) {
					System.out.print("\n    "); // Prints new line and space
				}
				// Prints the char variable in parenthesis
				if (normalChar[count] == currentChar) {
					System.out.print("(" + normalChar[count] + ") ");
					count++;
					// Prints the letter from the normalChar array and a space
				} else {
					System.out.print(normalChar[count] + " ");
					count++;
				}

			}
			// Delays printing for spooks
			TimeUnit.SECONDS.sleep(1);
			// Increases the charCount to print next in parenthesis
			charCount++;
			// Resets the count for the while loop on ln 35
			count = 0;
			System.out.print("\n\n\n");
		}
	}
}
