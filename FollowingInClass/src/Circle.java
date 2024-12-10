/**
 * File: csci1302/Circle.java
 * @author Christopher Williams
 * Description:  Emulates a circle as an object
 */

class Circle {
	/** The radius of this circle */
	private double radius;

	/** Create a default Circle and set defaults for values */
	public Circle() {
		radius = 1.0;
	}

	/** Create a Circle with a set radius */
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		if (newRadius > 0) {
			radius = newRadius;
		} else {
			radius = 1.0;
		}
	}

	/** Return the diameter of this circle */
	public double getDiameter() {
		return 2.0 * radius;
	}

	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter (circumference) of this circle */
	public double getPerimeter() {
		return 2.0 * radius * Math.PI;
	}
}