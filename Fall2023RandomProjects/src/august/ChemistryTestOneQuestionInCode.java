package august;
/**
 * File: ChemistryTestOneQuestionInCode
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
 * NOTE: This is exactly what the questions wants
 * it is not improved and an extremely useless code
 * The only added step is the print statement to
 * display results
 */
public class ChemistryTestOneQuestionInCode {
	public static void main(String[] args) {
		final double milesTraveled = 822.5;
		
		// step one: compute cost per mile
		double electricCostPerMile = 15.52 / 200.0;
		double gasCostPerMile = 3.59 / 45.0;
		
		// multiply cost per mile by miles driven
		double electricCostForTrip = electricCostPerMile * milesTraveled;
		double gasCostForTrip = gasCostPerMile * milesTraveled;
		
		// print results
		System.out.println("The cost of the trip for the electric car is: $" 
		 + electricCostForTrip);
		System.out.println("The cost of the trip for the gas car is: $" 
		 + gasCostForTrip);
	}
}
