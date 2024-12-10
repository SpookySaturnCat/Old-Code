/**
 * File: Lab4MorrisonNguyen
 * Class: CSCI-1302
 * Author: Seraphina Morrison & Tuyet Nguyen
 * Created on: February 9, 2024
 * Last Modified: February 9, 2024
 * Description: Modify WaterBottle class and inheritance
 */
public class LunchBoxWaterBottle extends WaterBottle{
	public LunchBoxWaterBottle () {
		super(4.0, 0.9);
	}
	
	public LunchBoxWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
	@Override
	public String getInfo() {
		return String.format("%s and is appropriate for LunchBox instances", super.getInfo());
	}
}
