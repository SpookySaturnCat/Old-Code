package ungraded.exercises.chapter4;

import java.util.Scanner;
public class ChapterFourPointFive {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user and store values
		System.out.print("Enter the number of sides: ");
		int sideNumber = input.nextInt();
		
		System.out.print("Enter the length of a sides: ");
		double sideLength = input.nextDouble();
		
		double area = (sideNumber * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / sideNumber));
		
		System.out.printf("The area of the polygon is %f", area);
	}
}
