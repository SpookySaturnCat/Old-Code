/**
 * File: Lab02Prob03.java
 * Class: CSCI 1301
 * Author: Seraphina Morrison and Justin Andrews
 * Created on: 08/25/23
 * Description: Print and calculate different ages based off user input 
 * and the perimeters given in Lab.
 */
import java.util.Scanner;

public class Lab02Prob03 {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user
		System.out.print("Enter your birth year: ");
		int birthYear = input.nextInt(); // setting birth year to user input
				
		// calculate ages based on birthYear variable and lab perimeters.
		int currentAge = 2023 - birthYear; 
		int ageIn15Years = currentAge + 15;  
		int doubleCurrentAge = currentAge * 2; 
		double halfCurrentAge = currentAge / 2.0; 
		
		// print current age of someone born in 1998.
		System.out.println("You were born in " + birthYear + 
				" and are " + currentAge + " years old.");
		
		// print results of current age in 15 years.
		System.out.println("In 15 years, you will be " + ageIn15Years + " years old.");
		
		// print results of someone double the current age.
		System.out.println("Someone twice your age is " + doubleCurrentAge + " years old.");
		
		// print results of someone who is half the current age.
		System.out.println("Someone half your age is " + halfCurrentAge + " years old.");
		
		//closes scanner. Good practice but not required.
		input.close();
	}
}