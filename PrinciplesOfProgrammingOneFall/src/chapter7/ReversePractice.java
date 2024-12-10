package chapter7;

import java.util.Arrays;

public class ReversePractice {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp;
		
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		int[] newArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (int i = 0, j = newArray.length - 1; i < newArray.length / 2; i++, j--) {
			temp = newArray[i];
			newArray[i] = newArray[j];
			newArray[j] = temp;
		}
		System.out.println(Arrays.toString(newArray));
	}
	
	
}
