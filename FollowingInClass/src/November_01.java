
public class November_01 {
	public static void main(String[] args) {
		
		int[] arr = { 9, 4, -2, 8 };
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
