/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 20, 2023
 *HW2
 *This code determines if a tennis player should practice on a day before 
 *a tournament based on these ALL of these explicit conditions: less than
 *14 days until next tournament, if the player has recently won less
 *than two games, if it is not raining & the temperature is below 95
 *degrees. If all conditions are met the player will practice, resulting 
 *in a true output to console, otherwise the results will be false */



import java.util.Scanner;//import Scanner class

public class HW2 {
	public static void main(String[] args) {

		// creates scanner object
		Scanner input = new Scanner(System.in);

		// prompts user to enter days until tournament
		System.out.print("How many days are left until the tournament? ");
		// int variable, days assigned to user input
		int days = (int) input.nextInt();

		// prompts user to enter recent wins
		System.out.print("How many games have you won recently? ");
		// int variable, wins assigned to user input
		int wins = (int) input.nextInt();

		// prompts user to answer if it is raining
		System.out.print("Is it raining? (true/false) ");
		// boolean variable, isRaining assigned to user input
		boolean isRaining = (boolean) input.nextBoolean();

		// prompts user to enter the temperature
		System.out.print("What is the temperature outside? ");
		// double variable, temperature assigned to user input
		double temperature = (double) input.nextDouble();

		// boolean variable set to true
		boolean doPractice = false;

		// if statement that determine if all the criteria are met
		if (days < 14 || wins < 2 || (!isRaining && temperature < 95))
			doPractice = true;

		// prints results to console
		System.out.println("Should you practice today? " + doPractice);
	}
}
