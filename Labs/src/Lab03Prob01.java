
/**
 * File: Lab03Prob01
 * Author: Seraphina Morrison
 * Class: CSCI1301
 * Created: 09/06/23
 * Description: Asks user for information, stores it in variables, and displays it back to them 
 */
import java.util.Scanner;

public class Lab03Prob01 {
	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for current accumulated credit hours and store
		System.out.print("Please enter your accumulated credit hours as a college student: ");
		int accumulatedCredits = input.nextInt();

		// Prompt user for total credits needed and store
		System.out.print("Please enter the total credits needed for your degree: ");
		int totalCreditsNeeded = input.nextInt();

		// Print results
		System.out.println("You have " + accumulatedCredits + " credit hour(s).\r\n" + "Your degree requires "
				+ totalCreditsNeeded + " credit hour(s).");
	}
}
