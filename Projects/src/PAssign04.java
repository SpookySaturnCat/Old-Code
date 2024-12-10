
/**
 *  File: PAssign04.java
 *  Class: CSCI 1301
 *  Author: Seraphina Morrison
 *  Created: 09/24/2023
 *  Last modified: 09/29/2023
 *  Description: This program determines if a point is inside a rectangle with user given values.
 *  Utilizes breaking strings with the .substring method
 */
import java.util.Scanner;

public class PAssign04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt user
		System.out.print("Enter width for rectangle: ");
		int width = input.nextInt();

		System.out.print("Enter height for rectangle: ");
		int height = input.nextInt();

		// If negative numbers are inputed for height or width error message is displayed
		if (height < 0 || width < 0) {

			System.out.println("Your rectangle must have a positive height and width.");

			// else statement to run that confirms no negative numbers were inputed
		} else {
			// Prompt user
			System.out.print("Enter x,y value for center point of rectangle: ");
			String centerPoint = input.next();

			System.out.print("Enter x,y value for test point: ");
			String testPoint = input.next();

			// Split values
			int centerPointSplit = centerPoint.indexOf(',');
			int centerPointX = Integer.parseInt(centerPoint.substring(0, centerPointSplit));
			int centerPointY = Integer.parseInt(centerPoint.substring(centerPointSplit + 1));

			int testPointSplit = testPoint.indexOf(',');
			int testPointX = Integer.parseInt(testPoint.substring(0, testPointSplit));
			int testPointY = Integer.parseInt(testPoint.substring(testPointSplit + 1));

			// Calculate distance
			double horizontalDistance = Math.sqrt(Math.pow(testPointX - centerPointX, 2));
			double verticalDistance = Math.sqrt(Math.pow(testPointY - centerPointY, 2));

			// Declare and initialize isInside variable to "not"
			String isInside = " not ";

			/*
			 * This condition checks to see if the point is in the rectangle, if it is the
			 * value of isInside changes
			 */
			if (horizontalDistance <= width / 2 && verticalDistance <= height / 2) {
				isInside = " ";
			}

			System.out.printf("(%d, %d) is%sin the rectangle centered at (%d, %d) with width %d and height %d\n",
					testPointX, testPointY, isInside, centerPointX, centerPointY, width, height);
		}
	}
}
