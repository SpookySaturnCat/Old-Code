package labs.spring2024;
/**
 * File: Lab4MorrisonNguyen
 * Class: CSCI-1302
 * Author: Seraphina Morrison & Tuyet Nguyen
 * Created on: January 26, 2024
 * Last Modified: February 9, 2024
 * Description: Create a LunchBag to hold a WaterBottle
 */
public class LunchBag {
	private double length;
	private double width;
	private double height;
	private WaterBottle bottle;

	// Default constructor
	public LunchBag() { 
		setLength(11.2);
		setWidth(6.1);
		setHeight(7.9);
		setWaterBottle(new LunchBagWaterBottle());
	}

	// Convenience constructor
	public LunchBag(double newLength, double newWidth, double newHeight, WaterBottle newBottle) {
		setLength(newLength);
		setWidth(newWidth);
		setHeight(newHeight);
		setWaterBottle(newBottle);
	}

	// Accessors 
	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public WaterBottle getWaterBottle() {
		return bottle;
	}

	// Mutators
	public void setLength(double newLength) {
		length = (newLength > 0) ? newLength : 11.2;
	}

	public void setWidth(double newWidth) {
		width = (newWidth > 0) ? newWidth : 6.1;
	}

	public void setHeight(double newHeight) {
		height = (newHeight > 0) ? newHeight : 7.9;
	}

	public void setWaterBottle(WaterBottle newBottle) {
		if (isValid(newBottle)) {
			this.bottle = newBottle;
		} else {
			this.bottle = new LunchBagWaterBottle();
		}
	}

	// Method that takes parameter of WaterBottle
	public boolean isValid(WaterBottle waterBottle) {
		if ((waterBottle instanceof LunchBagWaterBottle) && (waterBottle.getHeight() > 0.0) && (waterBottle.getRadius() > 0.0) && ((waterBottle.getRadius() * 2) <= 4)) {
			return true;
		} else {
			System.out.println("Error: Invalid Waterbottle");
			return false;
		}
	}
}