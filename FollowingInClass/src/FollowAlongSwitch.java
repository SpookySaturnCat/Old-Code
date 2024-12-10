import java.util.Scanner;

public class FollowAlongSwitch {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String season = "";
		
		// Prompt user
		System.out.print("Please enter the month: ");
		int month = input.nextInt();
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4: 
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8: 
			season = "Summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Fall";
			break;
			
			default: 
				System.out.println("Not a valid month.");
		}
		System.out.println(month + " is in " + season);
	}
}
