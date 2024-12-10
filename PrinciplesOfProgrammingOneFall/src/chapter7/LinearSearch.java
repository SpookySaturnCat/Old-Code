package chapter7;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5 };
		int key = 4, index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (key == arr[i]) {
				index = i;
			}
		}
		System.out.printf("The key of %d was found at index %d", key, index);
	}
}
