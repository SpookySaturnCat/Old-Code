/**
 * File: PAssign01a.java
 * Class: CSCI 1301
 * Author: Seraphina Morrison
 * Created: 08/27/23
 * Last modified: 08/31/23
 * Description: Computes the area of a triangle based
 * on user inputs of base and height
 */

import java.util.Scanner;

public class PAssign01b {
	public static void main(String[] args) {
		
		// Create scanner object named input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for base and height
		System.out.print("Please enter the base of the triangle: ");
		double base = input.nextDouble();
		System.out.print("Please enter the length of the triangle: ");
		double height = input.nextDouble();
		
		// Compute
		double area = (height * base) / 2.0;
		
		// Print results
		System.out.println("A triangle with base " + base + " and height "
				+ height + " has an area of " + area + ".");
	}
}
