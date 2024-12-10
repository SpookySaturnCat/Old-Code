/**
 * File: Lab02Prob01.java
 * Class: CSCI 1301
 * Author: Seraphina Morrison and Justin Andrews
 * Created on: 08/25/23
 * Description: determine the age of someone using the
 * birth year 1998 and the current year
 */
public class Lab02Prob01 {
	public static void main(String[] args) {
		int birthYear = 1998; // Initialize birthYear to 1998
		int currentAge = 2023 - birthYear; //compute
		
		// print results
		System.out.println("You were born in " + birthYear + 
		" and are " + currentAge + " years old.");
	}
}
