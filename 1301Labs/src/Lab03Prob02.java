/*
 *  File: Lab03Prob02.java
 *  Created: 12/20/2023
 *  Class: CSCI 1301
 *  Author: Seraphina Morrison
 */

import java.util.Scanner;

public class Lab03Prob02 {

	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		int hoursTaken, hoursNeeded, hoursLeft;
		double fifteenHours, twoSemesters, threeSemesters;
		
		// Prompt and store values
		System.out.print("Enter credit hours taken: ");
		hoursTaken = input.nextInt();
		System.out.print("Enter credit hours needed: ");
		hoursNeeded = input.nextInt();
		
		// COmpute values
		hoursLeft = hoursNeeded - hoursTaken;
		fifteenHours = hoursLeft / 15.0;
		twoSemesters = fifteenHours / 2.0;
		threeSemesters = fifteenHours / 3.0;
	
		// Print results
		System.out.printf("You have %d credit hour(s).%n"
				+ "Your degree requires %d credit hour(s).%n"
				+ "You have %d credit hour(s) until graduation.%n"
				+ "You have %.1f semester(s) (@ 15 credit hours/semester) left until graduation.%n"
				+ "You have %.1f semester(s) (@ 2 semesters/year) left until graduation.%n"
				+ "You have %.1f semester(s) (@ 3 semesters/year) left until graduation.%n"
				, hoursTaken, hoursNeeded, hoursLeft, fifteenHours,
				twoSemesters, threeSemesters);
		
		
	}
}
