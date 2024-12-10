import java.util.Scanner;

public class squareOf {
	public static void main(String[] args ) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a starting number");
		int startingNumber = input.nextInt();
		
		while(startingNumber != 50) {
			System.out.println(Math.pow(50, 2));
		}
	}
}
