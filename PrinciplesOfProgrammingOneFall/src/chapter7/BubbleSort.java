package chapter7;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = { 1 , 5, 8, 3, 9, 2, 4 };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				
				if (arr[j] > arr[j + 1]) { 
                    // swap temp and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
			}
		}
	}
}
