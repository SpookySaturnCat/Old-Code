
/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 21, 2023
 *Test1
 * This program that prompts the user to enter a double for 
 * the balance of their bank account, as well as a boolean asking 
 * whether to display their status */
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {

		// creates scanner object
		Scanner input = new Scanner(System.in);

		// prompts user to enter balance
		System.out.print("Please enter your bank balance: ");
		// sets bankBalance as user input
		double bankBalance = (double) input.nextDouble();

		// asks user if they want to display balance
		System.out.print("Do you wish to display your status? " + "(true/false): ");
		// sets displayStatus to user input
		boolean displayStatus = input.nextBoolean();

		// if statements that output responses based on conditions
		
		

		if ((bankBalance < 0) && (displayStatus == true))
			System.out.print("Your account is negative.");

		else if ((bankBalance > 0) && (displayStatus == true))
			System.out.print("Your account is positive.");

		else if ((bankBalance == 0) && (displayStatus == true))
			System.out.print("Your account is empty.");
		
       //if above statements are not met these conditions will print
		else
			System.out.print("Your status will not be displayed");

	}

}
