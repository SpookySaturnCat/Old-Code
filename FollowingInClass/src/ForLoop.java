import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
	
		System.out.println("for loop");
		for(int i = 30; i >= 0; i--) {
			System.out.printf("%n%d", i);
		}
		
		System.out.println("\nwhile loop");
		int i = 30;
		while (i >= 0 ) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("\ndo-while loop");
		i = 30;
		do {
			System.out.println(i);
			i--;
		} while (i >= 0);
}
}
