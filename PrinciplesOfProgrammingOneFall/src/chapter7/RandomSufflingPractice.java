package chapter7;

public class RandomSufflingPractice {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5 };
		int j, temp;
		
		for (int i = 0; i < arr.length - 1; i ++) {
			
			j = (int) (Math.random() * arr.length);
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
		}
		for (int i = 0; i < arr.length; i ++) {
			
			System.out.printf("%d ", arr[i]);
		}
	}
}
