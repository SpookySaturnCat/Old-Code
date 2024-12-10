import java.util.Scanner;

public class Lab05Prob02 {

	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Prompt and store data
		System.out.print("Please enter a word: ");
		String userWord = input.nextLine();

		// Check if word is larger than 4 letters
		if (userWord.length() >= 4) {

			// Create character values based on input strings.
			char firstLetter = userWord.charAt(0);
			char lastLetter = userWord.charAt(userWord.length() - 1);
			char middleLetter = userWord.charAt((int) Math.ceil((userWord.length() / 2.0)));

			// Display results
			System.out.printf(
					"For the string %s%n" + 
							"firt letter is %c%nlast letter is%c%n" + 
							"\"middle\" letter is %c",
					userWord, firstLetter, lastLetter, middleLetter);

		} else {

			// Display error message
			System.out.printf("The string you enetered (%s) contains less than 4 characters", userWord);
		}
	}
}
