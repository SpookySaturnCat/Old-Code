package august;

import java.util.Scanner;

public class FarenheightToCelcius {
	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user and store value
		System.out.print("Please enter the degree: ");
		double temp = input.nextDouble();
		System.out.print("Enter the temp unit (f or c): ");
		String type = input.next();
		
		if (type.equalsIgnoreCase("c")) {
			System.out.println();
		} else if (type.equalsIgnoreCase("f")) {
			
		} else {
			System.out.println("Error: Invalid type comversion.\nPlease enter C or F/");
		}
	}
	public static double fToC(double temp) {
		double conversion = (5.0 / 9) * (temp - 32);
		
		return conversion;
	}
	public static double cToF(double temp) {
		double conversion = (9.0 /5) * temp + 32;
		
		return conversion;
	}
}
