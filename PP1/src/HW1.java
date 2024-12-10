/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 18, 2023
 *HW1
 *This code gets user inputs of length and radius of a
 *cylinder and computes and displays its base area
 *and volume */


import java.util.Scanner;//import Scanner class

public class HW1 { // main method
	public static void main(String[] args) {
		// prompts user to enter radius value
		System.out.print("Please input a value for radius: ");
		/*
		 * This will create a scanner object, assigning it to the input variable, while
		 * using system.in as the data stream
		 */
		Scanner input = new Scanner(System.in);
		/*
		 * naming the double variable for radius and assigns the value to the user input
		 */
		double radius = input.nextDouble();
		// constant double variable of pi
		final double PI = 3.14159;
		// prompts user to enter length value
		System.out.print("Please input a value for length: ");
		/*
		 * naming the double variable for length and assigns the value to the user input
		 */
		double length = input.nextDouble();
		// formula for area
		double area = radius * radius * PI;
		// formula for volume
		double volume = area * length;
		// prints the results of the area
		System.out.println("The area of the cylinder is " + +area + " units squared.");
		// prints the results of the volume
		System.out.println("The volume of the cylinder is " + +volume + " units cubed.");
	}

}
