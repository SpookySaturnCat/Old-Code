package labs.spring2024;

/**
 * File : Lab4MorrisonNguyen Class : CSCI-1302C Author : Seraphina Morrison &
 * Tuyet Nguyen Created on : January 12, 2024 Last Modified : February 9, 2024
 * Description : Create water bottles that display height, radius, color,
 * volume, and all information
 */
public class WaterBottle {

	private double height;
	private double radius;
	private String color;
	private static double largestInitialVolume;

	// create default constructor
	public WaterBottle() {
		this(12.0, 2.0);
	}

	// convenience constructor
	public WaterBottle(double newHeight, double newRadius) {
		setHeight(newHeight);
		setRadius(newRadius);
		checkInitialVolume();
		setColor("green");
	}


	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	public String getInfo() {
		return String.format("A %s water bottle with height %.2f, radius %.2f, and volume %.2f", getColor(), getHeight(), getRadius(),
				getVolume());
	}

	// Acsessors and mutators
	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setHeight(double newHeight) {
		this.height = (newHeight > 0.0) ? newHeight : 12.0;
	}

	public void setRadius(double newRadius) {
		this.radius = (newRadius > 0.0) ? newRadius : 2.0;
	}

	public void setColor(String newColor) {
		this.color = newColor;
	}

	public static double getLargestInitialVolume() {
		return largestInitialVolume;
	}

	public void checkInitialVolume() {
		if (this.getVolume() > WaterBottle.getLargestInitialVolume()) {
			WaterBottle.largestInitialVolume = this.getVolume();
		}
	}

}
