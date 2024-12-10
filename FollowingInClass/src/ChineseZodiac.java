import java.util.Scanner;

public class ChineseZodiac {
	public static void main(String[] args) {
		
		// Create string variable and scanner
		String animal = "";
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user and store year
		System.out.print("Please enter the year you were born: ");
		int year = input.nextInt();
		
		// Switch case statement
		switch (year % 12) {
		case 0: animal = "monkey";
		break;
		case 1 : animal = "rooster";
		break;
		case 2 : animal = "dog";
		break;
		case 3 : animal = "pig";
		break;
		case 4 : animal = "rat";
		break;
		case 5 : animal = "ox";
		break;
		case 6 : animal = "tiger";
		break;
		case 7 : animal = "rabbit";
		break;
		case 8 : animal = "dragon";
		break;
		case 9 : animal = "snake";
		break;
		case 10 : animal = "horse";
		break;
		case 11 : animal = "sheep";
		}
		
		// Print results
		System.out.println("Your Chinese zodiac animal is " + animal);
	}
}
