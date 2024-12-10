import java.util.Scanner;

public class LetsDoTimesTables {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to practice your times tables? (Enter true or false): ");
		boolean userChoice = input.nextBoolean();
		
		while(userChoice) {
			
			System.out.println("Please enter an integer 1-12 that you would like to practice with: ");
			int userNumber = input.nextInt();
			int computerNumber = 1;
			
			do  {
				System.out.println("What is " + userNumber + " * " + computerNumber + "? ");
				int userAnswer = input.nextInt();
				
				if (userAnswer != userNumber * computerNumber) {
					System.out.println("Please try again)");
					computerNumber--;
				}
				else {
					System.out.println("Correct!");
				}
				computerNumber++;
			}
				while (computerNumber < 13);
				
			System.out.println("Would you like to practice your times tables? (Enter true or false): ");
			 userChoice = input.nextBoolean();
			}
		System.out.print("Goodbye.");
	}

}
