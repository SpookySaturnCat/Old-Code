import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		// generates a magic number 0 from 100
		int magicNumber = (int) (Math.random() * 101);

		// creates new scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Guess a magic number between 0 and 100: ");

		int userAnswer = -1;
		// repeats until if condition is met
		while (magicNumber != userAnswer) {
			// prompt user
			System.out.print("\nEnter your guess: ");
			// sets userAnser to user input
			userAnswer = (int) input.nextInt();

			// Condition to complete program function
			if (userAnswer == magicNumber)
				System.out.print("Yes, the answer is " + magicNumber);
			// repeats if number is too low
			else if (magicNumber > userAnswer)
				System.out.print("Your answer is too low");
			// repeats if number is too low
			else
				System.out.print("Your answer is too high");
		}
	}
}
