package ungraded.exercises.chapter4;

import java.util.Scanner;

public class Exercise04_24 {
	public static void main(String[] args) {
		
	// Create a scanner object
	Scanner input = new Scanner(System.in);
	
	// Prompt user and store variable
	System.out.print("Eneter the first city: ");
	String cityOne = input.nextLine();
	String cityTwo = input.nextLine();
	String cityThree = input.nextLine();
	
	if (cityOne.compareTo(cityTwo) > 0) {
		String temp = cityOne;
		cityOne = cityTwo;
		cityTwo = temp;
	}
	if (cityTwo.compareTo(cityThree) > 0) {
		String temp = cityTwo;
		cityTwo = cityThree;
		cityThree = temp;
	}
	if (cityOne.compareTo(cityTwo) > 0) {
		String temp = cityOne;
		cityOne = cityTwo;
		cityTwo = temp;
	}
	
	System.out.printf("The three cities in alphabetical order are %s %s %s", cityOne, cityTwo, cityThree);
	}
}
