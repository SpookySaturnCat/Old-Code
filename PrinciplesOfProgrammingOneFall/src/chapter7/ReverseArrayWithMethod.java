package chapter7;

import java.util.Arrays;

public class ReverseArrayWithMethod {
	
	public static void main(String[] args) {
		
		int[] original = { 1, 2, 3, 4, 5 };
		int[] reverse = reverse(original);
		
		System.out.println("The orginal is " + Arrays.toString(original));
		System.out.println("The reverse is " + Arrays.toString(reverse));

	}
	
	public static int[] reverse(int[] arr) {
		
		int[] result = new int[arr.length];

		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			
			result[j] = arr[i];
			
		}
		return result;
	}
}
