package textbook.followed.examples.chapter.two;
/**
 * File: ComputingArea.java
 * Author: Seraphina Morrison
 * Created: 08/17/23
 * Description: This program will compute the area of a circle
 */
public class ComputingArea {
	public static void main(String[] args) {
		double radius = 3; 
		final double PI = 3.14159;
		double area = radius * radius * PI; //formula for area
		System.out.print("The area for the circle of radius " +
		radius + " is " + area); //prints results
		
		
	}

}
