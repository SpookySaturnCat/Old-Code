import java.util.Scanner;

public class NineThirteenTwentyThree {
	public static void main(String[] args) {
		
	// Create scanner object 
	Scanner input = new Scanner(System.in);
	
	// Prompt user
	System.out.print("Please enter the year: ");
	int userYear = input.nextInt();
	
	if (userYear % 4 == 0 && userYear % 100 != 0  || userYear % 400 == 0) {
		System.out.println(userYear + " is a leap year.");
	} else {
		System.out.println(userYear + " is not a leap year.");
	}
	
	}
}
