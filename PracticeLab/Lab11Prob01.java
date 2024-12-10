/*
	* File: Lab10Prob01.java
	* Class: CSCI 1301
	* Author: Seraphina Morrison, Phillip Mejia 
	* Created on: Nov 10, 2023
	* Description: set status based on given conditions
	*/

public class Lab11Prob01 {
	
	public static void main(String[] args) {
		
		// Create 2D Array
		int[][] pirateBooty = {
				{ 110, 1600 }, { 101, 1400 }, { 200, 50 }, { 322, 700 }, { 57, 500 },
				{ 625, 1500 }, { 300, 320 }, { 50, 210 }, { 100, 105 }, { 90, 400 },
				{ 30, 2000 }, { 200, 1300 },
				};
		
		String status = "";
		
		// Run through loop to assign status
		for (int i = 0; i < pirateBooty.length; i ++) {
			
			if (pirateBooty[i][0] > 100 && pirateBooty[i][1] < 1500) {
				status = "toss";
			} else {
				status= "keep";
			}
			// Print results
			System.out.printf("Cargo %2d: %s%n", i + 1, status);
		}
		
		
	}
}
