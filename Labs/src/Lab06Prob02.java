/**
 * File: Lab06Prob02.java
 * Authors: Seraphina Morrison and Jainie Kirk
 * Created on: 09/29/2023
 * Description: Use a for loop to find sum of values
 */
public class Lab06Prob02 {
	public static void main(String[] args) {
		
		// Initialize variables
		int sum = 0;
		
		// For loop that runs until i <= 250
		for (int i = 5; i <= 250; i++) {
			sum += Math.pow(2 * i + 1,2);
;
		}
		// Print results
		System.out.printf("The sum is %,d", sum);
	}
}