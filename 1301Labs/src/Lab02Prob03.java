/*
 *  File: Lab02Prob03.java
 *  Created: 12/20/2023
 *  Class: CSCI 1301
 *  Author: Seraphina Morrison
 */

import java.util.Scanner;

public class Lab02Prob03 {

	public static void main(String[] main) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your birth year: ");
		int birthYear = input.nextInt();
		
		int currentAge = 2023 - birthYear;
		
		System.out.println("You were born in " + birthYear + " and are " + currentAge + " years old.");
		System.out.println("In 15 years you will be " + (currentAge + 15) + " years old.");
		System.out.println("Someone twice your age is " + (currentAge * 2) + " years old.");
		System.out.println("Someone half your age is " + (currentAge / 2.0) + " years old.");
	}
}
