package august;
/**
 * File: ChemistryTestOneQuestionInCodeImproved.java
 * Author: Seraphina Morrison
 * Created: 08/24/23
 * 
 * Prompt: You are traveling from Georgia Southerns's Savannah Campus
 * from the Science Center to NYU's Grossman school of Medicine.
 * You are choosing between a fully electric car and a gas car. Calculate 
 * the cost of the travel for each car assuming the following: 
 * 
 * Tiny Electric Car:
 * -Cost of charge is $15.52/full charge
 * -Range of a full charge is 200 miles
 * 
 * Tiny Gas Car:
 * -Cost of gas is fixed at $3.59/gallon
 * -fuel efficiency is 45 miles/gallon
 * 
 * ASSUMPTIONS: Distance traveled is 822.5
 * 
 * NOTE: This is the improved version. Instead of using the
 * numbers above this is a more general tool that utilizes
 * user input
 */
import java.util.Scanner;
public class ChemistryTestOneQuestionInCodeImproved {
	public static void main(String[] args) {
		
		//  scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the fixed cost of gas per gallon: ");
		double costPerGallon = input.nextDouble();
		System.out.print("Please enter the miles per gallon your car gets: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Please enter the miles driven on trip: ");
		double milesDriven = input.nextDouble(); 
		input.close(); // close input
		
		// compute cost
		double costForTrip = (costPerGallon / milesPerGallon) * milesDriven;
		System.out.println("The cost of travel is: $" + costForTrip);
	}
}
