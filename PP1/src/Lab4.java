/*Name: Seraphina Morrison
 *CSCI-1301-01E
 *May 26, 2023
 *Lab4
 *This code sorts defined integers and displays the highest 
 *numerical value within each method*/


public class Lab4 {

//first max method that holds two integers
	public static int max(int num1, int num2) {
		int result;// variable that holds largest integer

		// sorting process
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}

//second max method that holds three integers
	public static int max(int num1, int num2, int num3) {
		int result;// variable that holds largest integer
		int maxOne = max(num1, num2);// assign local variables to method value
		int maxTwo = max(maxOne, num3);

		// sorting process
		result = maxTwo;
		// returns with value
		return result;
	}

	// third max method that holds four integers
	public static int max(int num1, int num2, int num3, int num4) {
		int result;// variable that holds largest integer
		int maxTwo = max(num1, num2, num3);// assign local variables to method value
		int maxThree = max(maxTwo, num4);

		// sorting process
		result = maxThree;
		// returns with value
		return result;
	}

	public static void main(String[] args) { // main method
		// values of integers that are sorted above
		int a = 4, b = -9, c = 7, d = 10;
		// result of first max method is assigned to larger
		int larger = max(a, b);
		System.out.println("The larger of a and b is " + larger);
		// result of second max method is assigned to largestOfThree
		int largestOfThree = max(a, b, c);
		System.out.println("The largest of a, b, and c is " + largestOfThree);
		// result of third max method is assigned to largestOfFour
		int largestOfFour = max(a, b, c, d);
		System.out.println("The largest of a, b, c and d is " + largestOfFour);

	}
}