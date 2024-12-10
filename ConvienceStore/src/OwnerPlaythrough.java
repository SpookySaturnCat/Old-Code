import java.util.Arrays;
import java.util.Scanner;

public class OwnerPlaythrough {

	public static Scanner input = new Scanner(System.in);
	public static String timeOfDay, chore;
	private static String[] choresList;
	public static int time;
	

	public static void randomizeTime() {
		int d2 = (int) Math.random() * 2;

		if (d2 == 0) {
			setTimeOfDay("AM");
		} else {
			setTimeOfDay("PM");
		}
		getTimeOfDay();
		setTime((int) (Math.random() * 12) + 1);
		getTime();
	}

	public static String[] ownerChoiceGetChores() {
		
		Utilities.line();

		System.out.printf("%nWelcome to your Convience Store Boss.%n"
				+ "As the owner there is a lot of work to be done.%n"
				+ "It is currently %d %s.", time, timeOfDay);
		
		input.nextLine();

		if (timeOfDay.equalsIgnoreCase("AM")) {

			String[] arr1 = new String[4];
			String[] arr2 = new String[4];

			// Switch case with fall through behavior
			switch (time) {

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				arr1[0] = "Dance battle crackheads";
				arr1[1] = "Stock inventory";
				arr1[2] = "Scroll phone";
				arr1[3] = "Run register";
				return arr1;
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				arr2[0] = "Talk to old people";
				arr2[1] = "Sweep";
				arr2[2] = "Read newspaper";
				arr2[3] = "Run register";
				return arr2;
			default:
				return arr1;
			}

		} else {

			String[] arr3 = new String[4];
			String[] arr4 = new String[4];
			
			switch (time) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				arr3[0] = "Change coffee";
				arr3[1] = "Wipe counters";
				arr3[2] = "Make dinner";
				arr3[3] = "Run register";
				return arr3;
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
				arr4[0] = "Set meth gator traps";
				arr4[1] = "Fix ID scanner";
				arr4[2] = "Clean soda fountain";
				arr4[3] = "Run register";
				return arr4;
			default:
				return arr3;
			}
		}
	}
	
	public static void setChore(String[] arr) {
		
		Utilities.line();
		
		System.out.printf("%nYour chores list is:%n%s%n"
				+ "Which chore would you like to do?"
				, Arrays.toString(arr));
		input.nextLine();
		enterForLoop(arr);
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		chore = arr[choice];
	}
	
	public static String getChore() {
		return chore;
	}
	
	public static void choreTime(String chore) {
		
		if (chore.equals("Dance battle crackheads")) {
			
		} else if (chore.equals("Stock inventory")) {
			
		} else if (chore.equals("Scroll phone")) {
			 
		} else if (chore.equals("Talk to old people")) {
			
		} else if (chore.equals("Sweep")) {
			
		} else if (chore.equals("Read newspaper")) {
			
		} else if (chore.equals("Change coffee")) {
			
		} else if (chore.equals("Wipe counters")) {
			
		} else if (chore.equals("Run register")) {
			
		} else { // Run register

			
		}
	}

	public static void enterForLoop(String[] arr) {
		
		Utilities.line();
		Utilities.newLine();

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter %d for %s%n",
					i, arr[i]);
		}
	}
	
	public static int getTime() {
		return time;
	}

	public static void setTime(int newTime) {
		time = newTime;
	}
	
	public static String getTimeOfDay() {
		return timeOfDay;
	}
	
	public static void setTimeOfDay(String newTimeOfDay) {
		timeOfDay = newTimeOfDay;
	}
	
}
