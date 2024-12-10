/**
 *  File: Triangle.java 
 *  Class: CSCI 1301
 *  Author:Justin Andrews and Seraphina Morrison
 *  Created on: November 17, 2023
 *  Description: Make a triangle cass with methods to calculate
 *  and create a string with allInfo()
 */

public class Triangle {

	// Data members
	private double sideA;
	private double sideB;
	private double sideC;

	// Default no arg constructor 
	public Triangle() {

		setSideA(3.0);
		setSideB(4.0);
		setSideC(5.0);
	}

	// Convince constructor
	public Triangle(double sideA, double sideB, double sideC) {

		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
	}
	public void setSideA(double newSideA) {

		// Make sure side is not negative
		if (newSideA < 0) {
			newSideA = 1.0;
		}
		sideA = newSideA;
	}
	public void setSideB(double newSideB) {

		// Make sure side is not negative
		if (newSideB < 0) {
			newSideB = 1.0;
		}
		sideB = newSideB;
	}
	public void setSideC(double newSideC) {

		// Make sure side is not negative
		if (newSideC < 0) {
			newSideC = 1.0;
		}
		sideC = newSideC;
	}
	public double getSideA() {

		return sideA;
	}
	public double getSideB() {

		return sideB;
	}
	public double getSideC() {

		return sideC;
	}
	
	// Calculate and return perimeter
	public double getPerimeter() {
		return (sideA + sideB + sideC);
	}

	// Calculate and return area
	public double getArea() {
		
		double halfPerimeter = getPerimeter() / 2.0;
		return Math.sqrt((halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC)));
	}

	// Return string w info
	public String getInfo() {
		
		return String.format("Side A: %5.2f\tSide B: %5.2f\tSide C: %5.2f\tArea: %5.2f\tPerimeter: %5.2f%n", sideA, sideB, sideC, getArea(), getPerimeter());
	}
}
