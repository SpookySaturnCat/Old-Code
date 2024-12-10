/**
 * File : Lab4MorrisonNguyen
 * Class : CSCI-1302C
 * Author : Seraphina Morrison & Tuyet Nguyen
 * Created on : January 12, 2024
 * Last Modified : February 9, 2024
 * Description : Create water bottles that display height, radius, color,
 * 	volume, and all information
 */
public class WaterBottle {
	
	private double height;
	private double radius;
	private String color;
	private static double largestInitialVolume;
	
	// create default constructor
	public WaterBottle () {
		this(12.0, 2.0);
	}
	
	//convenience constructor
	public WaterBottle (double newHeight, double newRadius) {
		setHeight(newHeight);
		setRadius(newRadius);
		checkInitialVolume();
		setColor("green");
	}
	
	//method get volume
	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	//method get info
	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", color, height, radius, getVolume());
	}
	
	//access getHeight
	public double getHeight() {
		return height;
	}
	
	//access getRadius
	public double getRadius() {
		return radius;
	}
	
	//access getColor
	public String getColor() {
		return color;
	}
	
	//mutator setHeight
	public void setHeight(double newHeight) {
		height = (newHeight > 0.0) ? newHeight : 12.0;
	}
	
	//mutator setRadius
	public void setRadius(double newRadius) {
		radius = (newRadius > 0.0) ? newRadius : 2.0;
	}
	
	//mutator setColor
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	//static member 
	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}
	
	public void checkInitialVolume() {
		if (this.getVolume() > WaterBottle.getLargestInitialVolume())
		{
			WaterBottle.largestInitialVolume = this.getVolume();
		}
	}
		
}


