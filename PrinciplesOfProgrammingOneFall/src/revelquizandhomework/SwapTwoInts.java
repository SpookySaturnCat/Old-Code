package revelquizandhomework;
/**
 * File: SwapTwoInts.java
 * Author: Seraphina Morrison
 * Created: 08/21/23
 * Description: This programs swaps two int variables
 */
public class SwapTwoInts {
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = 2;
		int temp = number1; //the temp variable hold the initial value of number1
		number1 = number2; //number1 is assigned the value of number2
		/**
		 * The number2 value is then given the temp value
		 * Remember that number1 now has number2's value
		 * So if number1 and number2 have the same value 
		 * nothing has been swapped and they are equal values
		 * That is why the temp variable holds number1 to later
		 * "give" to number2
		 */
		number2 = temp; 
		System.out.print(number1 + " " + number2);
	}
}
