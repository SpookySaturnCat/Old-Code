package ungraded.exercises.chapter6;

import java.util.Scanner;

public class exercise06_05 {
	
	public static void main(String[] args) {
		
		// Prompt user and store values through method;
		double firstNumber = askForDouble();
		double secondNumber = askForDouble();
		double thirdNumber = askForDouble();
		
		// Run void method
		displaySortedNumbers(firstNumber, secondNumber, thirdNumber);
	}
	public static double askForDouble() {
		
		// Create scanner object 
		Scanner input = new Scanner(System.in);
		
		// Prompt user and store value
		System.out.print("Please enter a number: ");
		double number = input.nextDouble();
		
		return number; // Return value
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double temp;
		
		if (num1 > num2) {
		      temp = num1;
		      num1 = num2;
		      num2 = temp;
		    }

		    if (num2 > num3) {
		      temp = num2;
		      num2 = num3;
		      num3 = temp;
		    }

		    if (num1 > num2) {
		      temp = num1;
		      num1 = num2;
		      num2 = temp;
		    }
		    System.out.printf("The numbers sorted are %.0f %.0f %.0f", num1, num2, num3);

	}
}
