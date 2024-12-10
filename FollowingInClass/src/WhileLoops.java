import java.util.Scanner;
public class WhileLoops {//
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a starting number: ");
		int startNumber = input.nextInt();
		
		System.out.print("Enter a ending number: ");
		int endNumber = input.nextInt();
		
		// Swap the two if they are out of order
		if (endNumber < startNumber) {
			int temp = startNumber;
			startNumber = endNumber;
			endNumber = temp;
			System.out.println("Swapped end and start numbers");
		}

		// Print out count from start to end
		while (startNumber <= endNumber) { 
			System.out.printf("%d ", startNumber);
			startNumber++;
		}
	}
}

