/**
 * File: Lab4MorrisonNguyen
 * Class: CSCI-1302
 * Author: Seraphina Morrison & Tuyet Nguyen
 * Created on: February 9, 2024
 * Last Modified: February 9, 2024
 * Description: Modify WaterBottle class and inheritance
 */

public class LunchBagWaterBottle extends WaterBottle {
	
	
	public LunchBagWaterBottle () {
		super(12.0, 2.0);
	}
	
	public LunchBagWaterBottle(double height, double radius) {
		super(height, radius);
	}
	
	@Override
	public String getInfo() {
		return String.format("%s and is appropriate for LunchBag instances", super.getInfo());
	}
}
