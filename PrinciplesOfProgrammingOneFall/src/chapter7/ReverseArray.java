package chapter7;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp;
		
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.print(Arrays.toString(arr));
		}
}
