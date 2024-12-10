/*
	* File: Lab10Prob01.java
	* Class: CSCI 1301
	* Author: Seraphina Morrison, Phillip Mejia 
	* Created on: Nov 10, 2023
	* Description: Switching rows and columns and print results 
	*/

import java.util.Arrays;

public class Lab11Prob03 {

	public static void main(String[] args) {

		// Create original array
		int[][] myArray = { { 1, 2, 3 },
				{ 5, 4, 6 }, { 9, 8, 7 },
				{ 12, 10, 11 }
				};

		// Get new array
		int[][] newArray = transpose2DArray(myArray);
		 
		// For loop to print results
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[0].length; j++) {
				System.out.printf("%d ", newArray[i][j]);
			}
			System.out.printf("%n");

			}
	}

	public static int[][] transpose2DArray(int[][] arr) {

		// Create unpopulated copy array
		int[][] copy = new int[arr[0].length][arr.length];

		// Swap values
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
			
				copy[j][i] = arr[i][j];
			}
		}
		return copy;
	}
}
