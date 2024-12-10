
public class Lab06Prob02 {
	
	public static void main(String[] args) {
		
		// Declare and initialize sum
		int sum = 0;
		
		// For loop to calculate sum
		for (int i = 5; i <= 250; i++) {
			sum += Math.pow(2 * i + 1, 2);
		}
		
		// Print results
		System.out.printf("The sum is %,d", sum);
	}
}
