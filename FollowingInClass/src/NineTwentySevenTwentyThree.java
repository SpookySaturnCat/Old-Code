import java.util.Scanner;

public class NineTwentySevenTwentyThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput = 0, sentinel = -50;

		do {
			System.out.printf("Enter a starting number (%d to exit): ", sentinel);
			userInput = input.nextInt();

			if (userInput != sentinel) {
				System.out.println(Math.pow(userInput, 2));
			}
		} while (userInput != sentinel);

		System.out.println("Program ran");
	}
}
