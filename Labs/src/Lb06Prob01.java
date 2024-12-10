/**
 * Seraphina Morrison and Jainie Kirk
 * 9/29/2023
 * CSCI 1301
 * Description: Determine the minimum and maximum of a list of numbers
 */
import java.util.Scanner;

public class Lb06Prob01 {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Create sentinel 
		double userNumber = 0;
		double max = -101.0, min = 101.0;
		
		// do while loop if input != 19.5
		do {

			// Prompt the  and store value
			System.out.println("Enter a decimal number (enter -19.5 to quit): ");
			 userNumber = input.nextDouble();
			 
			 // If else statement
			 if (userNumber > max && userNumber >= -100.0 && userNumber <= 100.0 && userNumber != -19.5) {
				 
				 max = userNumber;
			 }
			 
			 if (userNumber < min && userNumber >= -100.0 && userNumber <= 100.0 && userNumber != -19.5) {
				 min = userNumber;
			 }
			 
		} while (userNumber != -19.5);
		
		// Display
		
		if (max == -101.0 || min == 101.0) {
			System.out.println("There were no valid values");
		}
		else {
		System.out.println("The max value was " + max);
		System.out.println("The min value was " + min);
		}
		
	}
}