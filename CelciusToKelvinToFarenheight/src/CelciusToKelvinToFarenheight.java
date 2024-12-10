/**
 * File: CelciusToKelvinToFarenheight.java
 * Author: Seraphina Morrison
 * Created: 08/22/23
 * Description: This program is made to convert
 * any temperature to kelvin, farenheight, or celcius 
 * based on user input
 */
import java.util.Scanner;
public class CelciusToKelvinToFarenheight {

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
		System.out.println(startingConversionUnit);
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
		 */
		System.out.print("Please enter the numerical unit of degrees: \n");
		double degrees = input.nextDouble();
		/**
		 * create selection statements for options
		 */
		
		
		/** STEP: 5
		 * print results of conversion
		 */
		
	}
}
