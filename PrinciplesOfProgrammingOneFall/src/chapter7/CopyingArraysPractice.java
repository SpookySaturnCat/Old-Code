package chapter7;

import java.util.Arrays;

public class CopyingArraysPractice {

	public static void main(String[] args) {
		
		int[] arr = { 1 , 2, 3, 4, 5 };
		int[] arr2 = new int[5];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			arr2[i] = arr[i];
		}
		
		System.out.print(Arrays.toString(arr2));
	}
}
