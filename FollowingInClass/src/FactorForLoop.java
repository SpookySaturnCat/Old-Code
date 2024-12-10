
public class FactorForLoop {
	public static void main(String[] args) {
		
		// Go from 5-25 by fives
		for (int i = 5; i <= 25; i += 5) {
			System.out.printf("Factor of %d: ", i);
			
		// Find all factors iteratively from 1 to i
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				System.out.printf("%d ", j);
			}
		}
		
		// Put a blank line after each set of factors
		System.out.println();
	}
		
}
}
