/**
 *  File: ComputeCylinder.java
 *  Author: Seraphina Morrison
 *  Created: 08/24/23
 *  Decription:(Compute the volume of a cylinder) 
 *  Write a program that reads in the radius and 
 *  length of a cylinder and computes the area and
 *  volume using the following formulas
 */

package ungraded.exercises.chapter2;
import java.util.Scanner;
public class ComputeCylinder {
	public static void main(String[] args) {
		/**
		 *  Create scanner, address and prompt user to enter radius and length
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("This program will compute the area and volume of a cylinder!");
		System.out.print("Please enter the value for radius: ");
		double radius = input.nextDouble();
		System.out.print("Please enter the length: ");
		double length = input.nextDouble();
		/**
		 * Compute area and volume
		 */
		double area = radius * radius * 3.14159;
		double volume = area * length;
		/**
		 * Print results
		 */
		System.out.print("The area is " + area + " and the volume is " + volume);
	}
}
