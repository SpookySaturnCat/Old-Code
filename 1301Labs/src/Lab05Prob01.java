import java.util.Scanner;

public class Lab05Prob01 {

	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Create array
		double[] length = new double[3];
		
		// For loop to iterate 3 times
		for (int i = 0; i < 3; i++) {
		
			// Prompt and store lengths
			System.out.print("Enter the " + (i + 1) + " length: ");
			length[i] = input.nextDouble();
		}
		
		// Calculate perimeter and area
		double perimeter = (length[0] + length[1] + length[2]) / 2.0;
		double area = Math.sqrt(perimeter * ((perimeter - length[0]) * (perimeter - length[1]) * (perimeter - length[2])));
	
		// print results
		System.out.println("For side lengths of " + length[0] + ", "
				+ length[1] + ", " + length[2] + ", the area is "
				+ area + ".");
	}
}
