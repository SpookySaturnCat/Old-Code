/**
 * File: Lab04Prob01.java
 * Author: Hannah Pamplona, Seraphina Morrison
 * Created: 09/08/2023
 * Class: CSCI1301
 * Description: If else statement that generates a random number from 0-65 
 * and checks if user can drink based on their age
 */
//import gsu.Math;

public class Lab04Prob01 {
	public static void main(String[] args) {

		// Generate a number from 0-65 and save in variable
		int age = (int) (Math.random() * 66);

		// String that prints if you are not older or equal to 21
		String not = "";

		// If statement that prints if they can drink or not
		if (age < 21) {
			not = " not";
		}
		// Print results
		System.out.println("You are " + age + " years old and are" + not + " eligible to purchase alcohol.");
	}
}