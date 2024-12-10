package ungraded.exercises.chapter4;

public class Exercise04_25 {
	public static void main(String[] args) {
		
		// Generate random chars
		char charOne = (char) (Math.random() * 26 + 'A');
		char charTwo = (char) (Math.random() * 26 + 'A');
		char charThree = (char) (Math.random() * 26 + 'A');
		
		// Generate random ints
		int intOne = (int) (Math.random() * 9);
		int intTwo = (int) (Math.random() * 9);
		int intThree = (int) (Math.random() * 9);
		int intFour = (int) (Math.random() * 9);

		// Create string
		String plate = "" + charOne + charTwo + charThree + intOne + intTwo + intThree + intFour;
		
		// Print results
		System.out.println(plate);
	}
}
