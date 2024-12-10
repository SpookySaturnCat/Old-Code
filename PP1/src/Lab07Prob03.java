/**
 *  File: Lab07Prob03.java
 *  Author: Taylor O'Neal and Seraphina Morrison
 *  Class: CSCI1301
 *  Description: Finf
 *  
 */
public class Lab07Prob03 {
	public static void main(String[] args) {
		printApproximateCos(Math.PI / 6.0);
	}
	
	public static double factorial(int number) {
		double result = 0;
		for (int i = 7; i > 0; i--) {
			
			result += number * (number - 1);
			number--;
		}
		return result;
	}
	
	public static void printApproximateCos(double x) {
		
		// Calculates using method
		int result = (int) factorial((int) x);
		// Displays
		System.out.printf("Actural Cos (PI/6): %f", result);
	}
}
