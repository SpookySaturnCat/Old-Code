/**
 *  File: TriangleTest.java 
 *  Class: CSCI 1301
 *  Author: Lin Nguyen and Seraphina Morrison
 *  Created on: November 17, 2023
 *  Description: Print results of triangle instances made from
 *  			 triangle object.
 */

public class TriangleTest {
	
	public static void main(String[] args) {
		
//		// Create triangle objects
//		// Default no args
//		Triangle triangle1 = new Triangle(); 
//		
//		// Objects with positive values
//		Triangle triangle2 = new Triangle(6.4, 8.7, 10.2);
//		
//		// Objects with positive values
//		Triangle triangle3 = new Triangle(-10.5, -8.8, -7.2);
//
//		// Print object results
//		System.out.printf(triangle1.getInfo());
//		System.out.printf(triangle2.getInfo());
//		System.out.printf(triangle3.getInfo());
//		System.out.printf(TriangleTest.copyTriangle(triangle1).getInfo());
//		
//		System.out.printf("%nLargest Initial Area: %.2f", Triangle.getLargestInitialArea());
	}
	
	// Returns a copy of triangle object with sides doubled
	public static Triangle copyTriangle(Triangle original) {
		
		return new Triangle(original.getSideA() * 2 ,original.getSideB() * 2,original.getSideC() * 2); 
	}	
}
