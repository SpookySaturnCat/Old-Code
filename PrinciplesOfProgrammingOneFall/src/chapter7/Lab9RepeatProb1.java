package chapter7;

public class Lab9RepeatProb1 {
	
	public static void main(String[] args ) {
		
		// Initialize local variables
		int upper = 256, lower = -256;
		
		// Create array with length of 12 (0-12) index
		int[] randomArray = new int[12];
		
		// For loop to populate array
		for (int i = 0; i < randomArray.length; i++) {
			
			randomArray[i] = (int) (lower + Math.random() * (upper - lower + 1));
		}
		
		// Print array length
		System.out.printf("Length: %d%n%n", randomArray.length);
		
		// For loop to print out population
		for (int i = 0; i < randomArray.length; i++) {
			
			System.out.printf("%d%n", randomArray[i]);
		}
		
		int minimum = randomArray[0];
		
		for (int i = 1; i < randomArray.length; i++) {
			
			if (randomArray[i] < minimum) {
				minimum = randomArray[i];
			}
		}
		
		System.out.printf("%nMinimum: %d%n", minimum);
	}
}
