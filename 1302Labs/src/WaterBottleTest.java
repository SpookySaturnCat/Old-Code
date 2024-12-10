/*
 *  File: WaterBottleTest.java
 *  Authors: DIPEN PATEL, Seraphina Morrison
 *  Created: 01/12/2024
 *  Description: Prints results of water bottle instances
 */
public class WaterBottleTest {

	public static void main(String[] args) {
		// Create water bottle objects
		WaterBottle bottle1 = new WaterBottle();
		WaterBottle bottle2 = new WaterBottle(9.5, 1.5);
		WaterBottle bottle3 = new WaterBottle(10.0, 2.5);
		
		// Create an array of bottless
		WaterBottle[] bottles = { bottle1, bottle2, bottle3};
		
		// Change color value on bottle3
		bottle3.setColor("blue");
		
		// Print results in for loop
		for (int i = 0; i < bottles.length; i++) {
			
			System.out.println(bottles[i].getInfo());
		}
	}
}
