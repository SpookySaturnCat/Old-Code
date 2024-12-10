import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {

		// generates 2 random numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		// if number1 < number2 swap them
		if (number1 < number2) {

			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		// prompts the user to answer equation
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		//creates scanner object
		Scanner input = new Scanner(System.in);
		//names the int variable answer and is assigned to the value of 
		//user input
		int answer = input.nextInt();
		
		//if statement that requires correct answer
		if (number1 - number2 == answer) {
			
			System.out.println("You are correct!");
		}
		else
		{
			System.out.println("Your answer is wrong.\n" + number1 + " - "
					+ number2 + " should be " + (number1 - number2));
		}

	}

}
