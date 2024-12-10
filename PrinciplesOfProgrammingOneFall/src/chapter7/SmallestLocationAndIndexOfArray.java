package chapter7;

public class SmallestLocationAndIndexOfArray {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, -155, };	
		
		int smallestLoc = 0; // assume first is smallest
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
			smallest = arr[i];
			smallestLoc = i; // index where value is located
			}
		}
		System.out.printf("Smallest Value @ index: %d: %d%n", smallestLoc, smallest);
	}
}
