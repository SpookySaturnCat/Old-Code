package chapter7;

public class Lab9RepeatProb2 {
	
	public static void main(String[] args) {
		
		double[] arr = { 12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916,
				82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628,
				77.1494972203 };
		
		double max = arr[arr.length - 1];
		int maxIndex = -1;
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("Index %d of %d: %.5f%n", i, arr.length, arr[i]);
			
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.printf("%nMaximum value: %.5f at index %d", max, maxIndex);
		
	}
}
