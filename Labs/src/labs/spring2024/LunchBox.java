package labs.spring2024;

/**
 * File: Lab4MorrisonNguyen Class: CSCI-1302 Author: Seraphina Morrison & Tuyet
 * Nguyen Created on: January 26, 2024 Last Modified: February 9, 2024
 * Description: Create a LunchBag to hold a WaterBottle
 */
public class LunchBox {
	private double length;
	private double width;
	private double height;
	private WaterBottle bottle;

	// Default constructor
	public LunchBox() {
		setLength(10.6);
		setWidth(7.7);
		setHeight(6.33);
		setWaterBottle(new LunchBoxWaterBottle());
	}

	// Convenience constructor
	public LunchBox(double newLength, double newWidth, double newHeight, WaterBottle newBottle) {
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
		this.length = (newLength > 0) ? newLength : 10.6;
	}

	public void setWidth(double newWidth) {
		this.width = (newWidth > 0) ? newWidth : 7.7;
	}

	public void setHeight(double newHeight) {
		this.height = (newHeight > 0) ? newHeight : 6.33;
	}

	public void setWaterBottle(WaterBottle newBottle) {
		if (isValid(newBottle)) {
			this.bottle = newBottle;
		} else {
			this.bottle = new LunchBoxWaterBottle();
		}
	}

	// Method checks the validity of object
	public boolean isValid(WaterBottle waterBottle) {
		if ((waterBottle instanceof LunchBoxWaterBottle) && (waterBottle.getHeight() <= (getHeight() - 2))
				&& ((waterBottle.getRadius() * 2) <= (getWidth() * .25))) {
			return true;
		} else {
			System.out.println("Error: Invalid Waterbottle");
			return false;
		}
	}
}
