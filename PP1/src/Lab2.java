/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 19, 2023
 *Lab2
 *This code will store 2 integers and sort them from least
 *to greatest through a simple if statement*/


import java.util.Scanner;

public class Lab2 { // main method
	public static void main(String[] args) {
		// Creates scanner object assigned to the variable input1
		Scanner input1 = new Scanner(System.in);

		// prompts user to enter value
		System.out.print("Enter the value of num1: ");
		int num1 = input1.nextInt();// sets num1 to user input

		// prompts user to enter value
		System.out.print("Enter the value of num2: ");
		int num2 = input1.nextInt();// sets num2 to user input

		// if statement that evaluates if num1 is greater than num2
		if (num1 > num2) {

			/*
			 * if the if condition is true, lines 31-33 swap the user inputed variable
			 * values so that num1 < num2 */
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// prints the results
		System.out.println("The sorted numbers are " + num1 + ", " + num2);
	}
}
