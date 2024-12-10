import java.util.Scanner;

public class RepeatAdditionQuiz {

	// main method
	public static void main(String[] args) {

		// create integer values of random numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// create scanner object
		Scanner input = new Scanner(System.in);

		// Prompts user
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		// sets user input as the int variable named answer
		int answer = (int) input.nextInt();

		//repeats section until condition is no longer satisfied
		while (number1 + number2 != answer) {
			System.out.println("Wrong answer. Try again. What is " + number1 +
					" + " + number2 + "? ");
			//would loop infinitely without this line
			answer = input.nextInt();
		}
		System.out.println("You got this!");
	}

}
