/**
 * File: PAssign01c.java
 * Class: CSCI 1301
 * Author: Seraphina Morrison
 * Created on: 08/26/23
 * Last modified: 08/31/23
 * Description: This program computes pascals based on given values
 */
public class PAssign01c {
	public static void main(String[] args) {
		
		// Create variables
		final double IDEAL_GAS_CONSTANT = 8.31446;
		int temperatureInKelvin = 313;
		double volume = 0.25;
		int moles = 1;
		
		// Compute
		double pascals = (moles * IDEAL_GAS_CONSTANT * temperatureInKelvin) / volume;
		
		// Print results
		System.out.println( "The pressure of " + moles + " mole(s) of an ideal gas with volume " 
				+ volume + " m^3 at temperature " + temperatureInKelvin + " K is " + pascals + 
				" pascals.");
	}
}
