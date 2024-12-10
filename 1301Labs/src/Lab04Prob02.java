import java.util.Scanner;

public class Lab04Prob02 {

	public static void main(String[] args) {

		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize variables
		String season = "";
		int monthNumber = 0;
	
		// Prompt for and store data
		System.out.print("Enter the month number: ");
		monthNumber = input.nextInt();
		
		if (monthNumber >= 1 && monthNumber <= 12) {
			
			if (monthNumber == 1 || monthNumber >= 11) {
				season = "winter";
			} else if (monthNumber <= 4) {
				season = "spring";
			} else if (monthNumber <= 7) {
				season = "summer";
			} else {
				season = "fall";
			}
			
			System.out.printf("Month %d occurs during %s.", monthNumber, season);
		} else {
			System.out.println("That is not a valid month.");
		}
	}
}
