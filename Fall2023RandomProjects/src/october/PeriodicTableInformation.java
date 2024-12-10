package october;

import java.util.Scanner;

public class PeriodicTableInformation {

	public static void main(String[] args) {

		// Declare and initialize variables
		String electronConfiguration = "";
		int row = 0;
		String rowString = "";
		char shell = 'b';
		String place = "c";
		int atomicNumber = 50;

		// Create scanner object
		Scanner input = new Scanner(System.in);
		// Do while loop
		while (atomicNumber != 99) {

			// Prompt user and store atomic number
			System.out.print("Please enter the atomic number of the element you want information on: ");
			atomicNumber = input.nextInt();

			// If statement to check if the user enetered a valud number
			if (atomicNumber < 1 || atomicNumber > 118) {

				System.out.println("Error: Invalid atomic number."
						+ "\nThe atomic number is on the top left of the element on your periodic table."
						+ "\nTry again.");
			} else {

				// Store method values in variables
				row = valenceRow(atomicNumber);
				rowString = Integer.toString(row);
				shell = valenceShell(atomicNumber, row);
				place = electronPlacement(atomicNumber, row, shell);

				// Create the string of the valence electron
				electronConfiguration = "" + rowString + shell + place;
				System.out.println(electronConfiguration);
			}
		}
	}

	// Finds the row level for ve
	public static int valenceRow(int aNumber) {

		// Initialize return variable
		int row = 9;

		// If statement to determine rows. P and S are n = r, D is n-1, F is n-2
		if (aNumber <= 2) {
			row = 1;
		} else if (aNumber <= 10) {
			row = 2;
		} else if (aNumber <= 18 || aNumber >= 21 && aNumber <= 30) {
			row = 3;
		} else if (aNumber <= 36 || aNumber >= 39 && aNumber <= 48 || aNumber >= 58 && aNumber <= 71) {
			row = 4;
		} else if (aNumber <= 54 || aNumber >= 71 && aNumber <= 80 || aNumber >= 90 && aNumber <= 103) {
			row = 5;
		} else if (aNumber <= 86 || aNumber >= 89 && aNumber <= 112) {
			row = 6;
		} else {
			row = 7;
		}
		return row;
	}

	public static char valenceShell(int aNumber, int row) {

		// Initilize return value
		char shell = 'A';

		// Selection statement to determine the shell of the atom (based on periodic
		// table
		if (row == '1' || aNumber <= 4) {
			shell = 'S';
		} else if (aNumber <= 10 || row == '3' && aNumber <= 18 && aNumber >= 13
				|| row == '4' && aNumber <= 36 && aNumber >= 31 || row == '5' && aNumber <= 54 && aNumber >= 49
				|| row == '6' && aNumber <= 86 && aNumber >= 81 || row == '7' && aNumber <= 113) {
			shell = 'P';
		} else if (row == '3' && aNumber <= 30 && aNumber >= 21 || row == '4' && aNumber <= 48 && aNumber >= 39
				|| row == '5' && aNumber <= 80 && aNumber >= 57 || row == '6' && aNumber <= 112 && aNumber >= 89) {
			shell = 'D';
		} else if (row == '4' && aNumber <= 71 && aNumber >= 58 || row == '5' && aNumber <= 103 && aNumber >= 90) {
			shell = 'F';
		} else {
			shell = 'S';
		}
		return shell;
	}

	// Determines the spot the electron is in the configuration
	public static String electronPlacement(int aNumber, int row, char shell) {
		String spot = "99";
		if (shell == 'S') {
			if (row == '1') {
				spot = Integer.toString(aNumber);
			} else {

				if (aNumber % 2 == 0) {
					spot = "2";
				} else {
					spot = "1";
				}
			}
		} else if (shell == 'P') {
			if (aNumber == 5 || aNumber == 13 || aNumber == 31 || aNumber == 49 || aNumber == 81 || aNumber == 113) {
				spot = "1";
			} else if (aNumber == 6 || aNumber == 14 || aNumber == 32 || aNumber == 50 || aNumber == 82
					|| aNumber == 114) {
				spot = "2";
			}

		}
		return spot;

	}
}
