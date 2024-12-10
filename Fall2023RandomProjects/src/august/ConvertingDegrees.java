/**
 * File: ConvertingDegrees.java
 * Author: Seraphina Morrison
 * Created: 08/22/23
 * Description: This program is made to convert
 * any temperature to kelvin, farenheight, or celcius 
 * based on user input
 */
package august;

import java.util.Scanner;
public class ConvertingDegrees {

	public static void main(String[] args) {
		/**
		 *  create scanner and ask user input starting 
		 *  temperature type
		 *   store in char variable
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What type of temperature unit are you starting with?");
		System.out.println("Please enter \"f\" for Farneheight");
		System.out.println("Please enter \"c\" for Celcius");
		System.out.println("Please enter \"k\" for Kelvin");
		char startingConversionUnit = input.next().charAt(0);
		/**
		 *  ask user what type of conversion they want
		 *  store in char variable
		 */
		System.out.println("What type of conversion do you want?");
		System.out.println("Please enter \"f\" for Farneheight");
		System.out.println("Please enter \"c\" for Celcius");
		System.out.println("Please enter \"k\" for Kelvin");
		char desiredConversionUnit = input.next().charAt(0);
		/**
		 *  prompt user to enter degrees 
		 *  store in double variable
		 *  closes scanner object
		 */
		
		System.out.print("Please enter the numerical unit of degrees: \n");
		double userDegrees = input.nextDouble();
		 /**
		  *  make convertedDegrees variable
		  *  create selection statements for options
		  */
		input.close();
		double convertedDegrees =0;
		// if the user starts with fahrenheit
		if (startingConversionUnit == 'f')	 {
			if (desiredConversionUnit == 'c') {//f to c
				convertedDegrees = (userDegrees - 32) * (5.0 / 9);
			}
			else if (desiredConversionUnit == 'k') {//f to k
				convertedDegrees = (userDegrees - 32) * (5.0 / 9.0) + 273.15;
			}
		}
		// if the user starts with celcius
		else if (startingConversionUnit == 'c') {
			if (desiredConversionUnit == 'f') { // c to f
				convertedDegrees = (userDegrees * (9.0 / 5.0)) + 32;
			}
			else if (desiredConversionUnit == 'k') { // f to c
				convertedDegrees = userDegrees + 273.15;
			}
		}
		
		//if the user starts with kelvin
		else if (startingConversionUnit == 'k') { 
			if (desiredConversionUnit == 'f') { // k to f
				convertedDegrees = (userDegrees - 273.15) * (9.0 / 5.0) + 32;
			}
			else if (desiredConversionUnit == 'c') { // k to c
				convertedDegrees = userDegrees - 273.15;
			
			}
		}
		else {
			userError();
		}
		
		//print results of conversion
		System.out.print("You started with: " + userDegrees + startingConversionUnit + 
				" and converted it to: " + convertedDegrees + desiredConversionUnit);
	}
	//method that mocks user and closes program
	public static void userError() {
		System.out.println("You messed up inputting something something.");
		System.out.println("Try again, and listen to instructions this time.");
		System.exit(0);
	}
}
