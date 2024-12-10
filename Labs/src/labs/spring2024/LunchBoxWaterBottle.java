package labs.spring2024;
/**
 * File: Lab4MorrisonNguyen
 * Class: CSCI-1302
 * Author: Seraphina Morrison & Tuyet Nguyen
 * Created on: February 9, 2024
 * Last Modified: February 9, 2024
 * Description: Modify WaterBottle class and inheritance
 */
public class LunchBoxWaterBottle extends WaterBottle{
	// Default no-args constructor
	public LunchBoxWaterBottle () {
		super(4.0, 0.9);
	}
	
	// Convenience constructor
	public LunchBoxWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
	// Overridden getInfo()
	@Override
	public String getInfo() {
		return String.format("%s and is appropriate for LunchBox instances", super.getInfo());
	}
}
