/*
 *  File: Lab03Prob01.java
 *  Created: 12/20/2023
 *  Class: CSCI 1301
 *  Author: Seraphina Morrison
 */

import java.util.Scanner;

public class Lab03Prob01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter credit hours taken: ");
		int hoursTaken = input.nextInt();
		
		System.out.print("Enter credit hours needed: ");
		int hoursNeeded = input.nextInt();
		
		System.out.printf("You have %d credit hour(s).%n"
				+ "Your degree requires %d credit hour(s).", hoursTaken, hoursNeeded);
		
	}
}
