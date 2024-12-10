/* File: Lab09Prob01
 * Authors: Seraphina Morrison and Cameron Askins
 * Date: 10/27/2023
 * Class: CSCI 1301
 * Description: Create a range of random numbers stores in an array,
 *  print the length, array contents, and the minimum
 * 
 */
// import gsu.Math;
public class Lab09Prob01 {
	public static void main(String[] args) {

		// Create array with 12 length and variables
		int[] randomNumber = new int[12];
		int temp = randomNumber[0], randomNumberIndex = randomNumber[0], minimum = 256;

		System.out.printf("Length: %d%n%n", randomNumber.length);

		for (int i = 0; i < randomNumber.length; i++) {

			// 12 numbers between -256 and 256
			int lower = -256, upper = 256;
			randomNumber[i] = (int) (lower + Math.random() * (upper - lower + 1));

			temp = randomNumber[i];
			System.out.printf("%d%n", temp);
			
			// Selection statement to determine min
			if (randomNumber[i] < minimum) {
				randomNumberIndex = i;
				minimum = randomNumber[i];
			}

		}
		
		// Print results
		System.out.printf("%nMinimum value: %d at index %d%n", minimum, randomNumberIndex);

	}
}
