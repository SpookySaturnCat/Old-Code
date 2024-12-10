import java.util.Scanner;
public class NewProb02 {
	public static void main(String[] args) {
		
		// Create scanner object and string variable
		Scanner input = new Scanner(System.in);
		String season = "";
		// Prompt user and enter season int
		System.out.println("Welcome to the season checker.");
		System.out.print("Please enter the season you are in as an integer: ");
		int userMonth = input.nextInt();
		
		// If else statement
		 if (userMonth <= 2) {
			season = "winter";
		} else if (userMonth <= 5) {
			season = "spring";
		} else if (userMonth <= 8) {
			season = "summer";
		} else if (userMonth <= 11) {
			season = "fall";
		} else if (userMonth == 12){
			season = "winter";
		} else {
			season = "unavaliable";
		}
		// Display results
		System.out.println("With the user entered number " + userMonth + " your season is " 
				+ season + ".");
	}
}
