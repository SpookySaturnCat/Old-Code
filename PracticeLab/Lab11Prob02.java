/*
	* File: Lab10Prob01.java
	* Class: CSCI 1301
	* Author: Seraphina Morrison, Phillip Mejia 
	* Created on: Nov 10, 2023
	* Description: Print the max on each row of an array
	*/

public class Lab11Prob02 {

	public static void main(String[] args) {

		int[][] myArray = { {2, 9, 4},
				{-512, -1024, -2048},
				{5, -8, 17} };
		
		printRowMax(myArray); // Print results
	}
	
	public static void printRowMax(int[][] arr) {
		
		int maxValue;
		for (int i = 0; i < arr.length; i++) {
			// Reset maxValue 
			maxValue = arr[i][0];
			
			for (int j = 0; j < arr[i].length; j++) {
				// Find max
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];
				}
			}
			// Print results
			System.out.printf("Row %d Max: %d%n", i + 1, maxValue);
		}
	}
}
