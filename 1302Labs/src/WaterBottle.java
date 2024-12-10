
/**
 * File: csci1302/Circle.java
 * @author Taylor O'Neal, Seraphina Morrison
 * Created on: Jan 19, 2023
 * Modified: Jan 19, 2023
 * Description:  water bottle class practice lab
 */

public class WaterBottle {
	// Data fields
	private double height;
	private double radius;
	private String color = "";
	private static double largestInitialVolume;
	
	// No arg
	public WaterBottle() {
		this(12, 2);
	}
	
	// Convenience
	public WaterBottle(double newHeight, double newRadius) {
		setHeight(newHeight);
		setRadius(newRadius);
		setColor("green");
		checkInitialVolume();
	}
	
	// Set (mutators)
	public void setHeight(double newHeight) {
		height = (newHeight > 0) ? newHeight : 12;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius > 0) ? newRadius : 2;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	// Gets (accessors)
	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getVolume() {
		return Math.PI * (radius * radius) * height;
	}
	
	// Methods
	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
	}
	
	public void checkInitialVolume() {
		if (getVolume() > getLargestInitialVolume()) {
			largestInitialVolume = getVolume();
		}
	}
}