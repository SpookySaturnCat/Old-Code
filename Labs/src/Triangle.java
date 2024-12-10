/**
* File: PAssign0.java
* Class: CSCI 1301
* Author: Seraphina Morrison and Lin Nguyen
* Created on: Dec 1, 2023
* Description:
*/
public class Triangle {

	// Data members
	private double sideA;
	private double sideB;
	private double sideC;
	private static double largestInitialArea;

	// Default no arg constructor 
	public Triangle() {

		this(3.0, 4.0, 5.0);
	}

	// Convince constructor
	public Triangle(double sideA, double sideB, double sideC) {
		
		setSideA(sideA);
		setSideB(sideB);
		setSideC(sideC);
		checkInitialArea();
	}
	
	// Determines if triangle has larger area than  largest
	// InitialArea’s current value
	public void checkInitialArea() {
		
		if (getArea() > Triangle.largestInitialArea) {
			Triangle.largestInitialArea = getArea();
		}
	}
	
	public void setSideA(double sideA) {

		// Make sure side is not negative
		if (sideA < 0) {
			sideA = 1.0;
		}
		this.sideA = sideA;
	}
	
	public void setSideB(double sideB) {

		// Make sure side is not negative
		if (sideB < 0) {
			sideB = 1.0;
		}
		this.sideB = sideB;
	}
	public void setSideC(double sideC) {

		// Make sure side is not negative
		if (sideC < 0) {
			sideC = 1.0;
		}
		this.sideC = sideC;
	}
	
	public static double getLargestInitialArea() {
		return largestInitialArea;
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

