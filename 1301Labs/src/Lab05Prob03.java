import java.util.Scanner;

public class Lab05Prob03 {

	public static void main(String[] args) {
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt for and store user word
		System.out.print("Please enter a word: ");
		String userWord = input.nextLine();
		
		// Checks to see if user words length equals 5
		if (userWord.length() == 5) {
			
			// Create and initialize variables
			String newString = "";
			char first, second, third, fourth, fifth, temp = 0;
			
			// Store characters into variables
			first = userWord.charAt(0);
			second = userWord.charAt(1);
			third = userWord.charAt(2);
			fourth = userWord.charAt(3);
			fifth = userWord.charAt(4);
			
			// Swap values
			temp = first;
			first = fifth;
			fifth = temp;
			
			// Swap values
			temp = second;
			second = fourth;
			fourth = temp;
			
			// Create String
			newString = "" + first + second + third + fourth + fifth;
			
			// Print results
			System.out.printf("For the string %s the reverse is %s%n"
					, userWord, newString);
			
		} else {
			
			// Error message
			System.out.printf("The string you entered (%s) does not contain five characters%n", userWord);
		}
	}
}
