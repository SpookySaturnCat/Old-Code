package ungraded.exercises.chapter6;

import java.util.Scanner;

public class Exercise06_02 {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user and store value
		System.out.print("Please enter an integer: ");
		double userNumber = input.nextDouble();
		
		// Run method and store value
		int sum = sumDigits(userNumber);
		
		// Print results
		System.out.printf("You inputted %.0f the sum of all digits is %d", userNumber, sum);
		}
	
	public static int sumDigits(double n) {
		
		// Declare and init variables
		int sum = 0, temp = 0;
		
		while (n > 0) {
			
			temp = (int) (n % 10);
			sum += temp;
			n = n / 10;
		}
		
		return sum;
	}
}
