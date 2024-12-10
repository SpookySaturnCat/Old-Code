import java.util.Scanner;

public class Lab06Prob01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double sentinal = -19.5, userNumber, max = -100, min = 100;

		// Do loop to ask for numbers
		do {

			// Prompt and store userNumber
			System.out.print("Please enter a number from -100 to 100, enter -19.5 to stop: ");
			userNumber = input.nextDouble();

			// Makes sure the sentinel was not entered
			if (userNumber != sentinal && userNumber <= 100.0 && userNumber >= -100.0) {
				
				// Checks for min
				if (userNumber < min && userNumber != sentinal) {
					min = userNumber;
				}

				// Checks for max
				if (userNumber > max) {
					max = userNumber;
				}
			}
		} while (userNumber != sentinal);

		if (min == 100 || max == -100) {
			System.out.println("There were no valid values.");
		} else {
			System.out.printf("The max value was %.1f%n"
					+ "The min value was %.1f%n", max, min);
		}
	}
}
