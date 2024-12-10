package september;
import java.util.Scanner;

public class killTheHuntress {
	
	// Create scanner object and count variable
			static Scanner input = new Scanner(System.in);
			static int count = 0; // What is up w static?
			int choice; // Why doesnt this one have to be static? Is it cause of the main method?
	public static void main(String[] args) {
		
		// I need to ask williams about this
		killTheHuntress game = new killTheHuntress();

		// Edgy ass prompt do while loop
		do {
		System.out.println("Are you ready?");
		input.nextLine();
		count++;
		} while (count < 3);
		
		// Reset count
		count = 0;
		
		// Dialog for user
		System.out.print("I guess you are...");
		input.nextLine();
		System.out.print("I'd ask for your name, but I doubt you will last long.");
		input.nextLine();
		System.out.print("Have fun!");
		input.nextLine();
		
		// Run methods (why should they be with the object and whats up w void/static(I can do it all w out the object but i put it in to ask about))
		game.lineDivider();
		game.chapterOne();
	}
	public void errorMessage() {
		System.out.println("");
	}
	public void choiceMenuChapterOne() {
		System.out.println("\nWhat do you want to do?");
		System.out.println("1: Approach the humming");
		System.out.println("2: Run away");
		System.out.println("3: Scream");
		System.out.println("4: Piss yourself");
	}
	
	public void lineDivider() {
		System.out.println("------------------------------------------------------------------\n");
	}
	
	public void chapterOne() {
		System.out.print("The door slams shut quickly behind you.\nWhen you turn around, there is nothing but trees behind you.");
		input.nextLine();
		System.out.println("A low humming sound emerges to your left.");
		input.nextLine();
		choiceMenuChapterOne();
		
		choice = input.nextInt();
		
		switch (choice) {
		case 1: 
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default: errorMessage();
		chapterOne();
		
		}
	}
}
