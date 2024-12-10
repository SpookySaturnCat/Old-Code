package ungraded.exercises.chapter4;

import java.util.Scanner;

public class Exercise04_01 {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user and store their information
		System.out.print("Enter the length from the center to a vertex: ");
		double length = input.nextDouble();
		
		double sides = 2 * length * Math.sin(Math.PI / 5);
		double area = (5.0 * Math.pow(sides, 2) / (4.0 * (Math.tan(Math.PI / 5.0))));
		
		System.out.printf("The area of the pentagon is %.2f", area);
	}
}
