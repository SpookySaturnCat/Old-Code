package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SortSearchMethodPractice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt user and store array length
		System.out.print("Welcome to the Arrays and Methods Practice Program!\n\nPlease enter the length of your array: ");
		int arrLength = (int) input.nextInt();
		
		// Create array
		int[] arr = new int[arrLength];
		
		// For loop to prompt user and populate array
		for (int i = 0; i < arr.length; i++) {

			System.out.printf("Number %d of %d: ", i + 1, arr.length);
			arr[i] = (int) input.nextInt();
		}

		// Print array and sorted array after called bubbleSort method
		System.out.printf("%nThe initial array is %s%nThe sorted array is %s%n", Arrays.toString(arr),
				Arrays.toString(bubbleSort(arr)));

		// Prompts the user for the key
		System.out.print("Please enter the key you are searching for: ");
		int key = input.nextInt();

		// Prints key results through bianarySearch method
		System.out.printf("The key is at index %d", binarySearch(arr, key));

	}

	public static int[] bubbleSort(int[] arr) {
		
		int temp;

		// Outer loop that iterates for the entire length of arr
		for (int i = 0; i < arr.length; i++) {
			// For loop that pushes larger values to the back
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) { // If j is larger than j + 1 swap them
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}

	public static int binarySearch(int[] arr, int key) {
		// Initialize low and high, declare mid
		int low = 0, high = arr.length - 1, mid = 0;

		while (high >= low) {

			// Create middle point of list value each loop
			mid = (low + high) / 2;
			
			// If the key is less than mid's value throw everything to the right away
			if (key < arr[mid]) {
				high = mid - 1; // Search left
			// If the key equals mid's value stop the method
			} else if (key == arr[mid]) {
				return mid; // Ends method and returns value
			// If If the key is more than mid's value throw everything to the left away
		} else {
				low = mid + 1; // Search right
			}
		}
		return -1 - low; // Return insertion point
	}
}
