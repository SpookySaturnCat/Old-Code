
/**
 * File: Lab03Prob01
 * Author: Seraphina Morrison
 * Class: CSCI1301
 * Created: 09/07/23
 * Description: Asks user for how many credits they have, and need,
 * and calculates when they will graduate, the years semesters and credits
 * left based on given conditions
 */
import java.util.Scanner;

public class Lab03Prob03 {
	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for current accumulated credit hours and store
		System.out.print("Please enter your accumulated credit hours as a college student: ");
		int accumulatedCredits = input.nextInt();

		// Prompt user for total credits needed and store
		System.out.print("Please enter the total credits needed for your degree: ");
		int totalCreditsNeeded = input.nextInt();

		// Calculate credits left before graduation
		int creditHoursLeft = totalCreditsNeeded - accumulatedCredits;

		/**
		 * Create double variable 17that calculates the amount of semesters left till
		 * graduating based on 15 credits per semester+
		 */
		int creditHoursPerSemester = 15;
		double semestersLeft = creditHoursLeft / (double) creditHoursPerSemester;

		// Assuming two semesters a year calculate how many years are left
		int twoSemestersValue = 2;
		double yearsLeftWithTwoSemesters = semestersLeft / twoSemestersValue;

		// Assuming two semesters a year calculate how many years are left
		int threeSemestersValue = 3;
		double yearsLeftWithThreeSemesters = semestersLeft / threeSemestersValue;
		
		// Calculate years, semesters, and credit hours left until graduation
		int yearsLeftModulated = (int) (creditHoursLeft / creditHoursPerSemester) / twoSemestersValue;
		int semestersLeftModulated = yearsLeftModulated % twoSemestersValue;
		int creditHoursLeftAfterTime = creditHoursLeft % creditHoursPerSemester;
		
		// Print results
		System.out.println("You have " + accumulatedCredits + " credit hour(s).\n" + "Your degree requires "
				+ totalCreditsNeeded + " credit hour(s).\nYou have " + creditHoursLeft
				+ " credit hour(s) until graduation.\nYou have " + semestersLeft + " semester(s) (@ "
				+ creditHoursPerSemester + " credit hours/semester) left until graduation.\nYou have "
				+ yearsLeftWithTwoSemesters + " year(s) (@ " + twoSemestersValue
				+ " semesters/year) left until graduation.\nYou have " + yearsLeftWithThreeSemesters
				+ " year(s) (@ " + threeSemestersValue + " semesters/year) left until graduation."
				+ "\nYou have " + yearsLeftModulated + " year(s), " + semestersLeftModulated 
				+ " semester(s), and " + creditHoursLeftAfterTime + " credit hour(s) "
				+ "(@ 2 semesters/year) left until graduation.");

	}
}
