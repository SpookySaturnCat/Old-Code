package chapter7;

public class Lab9RepeatProb3 {
	
	public static void main(String[] args) {
	double[] arr = { -12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916,
			82.0442710394, 155.0005475009, -6.1179400421, 120.1984991874, 38.6575114628,
			77.1494972203 };
	
	double max = arr[arr.length - 1], min = arr[0], sum = 0, average;
	int maxIndex = 0, minIndex = 0, overAv = 0, underAv = 0;
	
	for (int i = 0; i < arr.length; i++) {
		
		System.out.printf("Index %d of %d: %.5f%n", i, arr.length, arr[i]);
		
		if (max < arr[i]) {
			max = arr[i];
			maxIndex = i;
		}
		
		if (min > arr[i]) {
			min = arr[i];
			minIndex = i;
		}
		
		sum += arr[i];
		
	}
	
	average = sum / (double) arr.length;
	
	for (int i = 0; i < arr.length; i++) {
		
		if (arr[i] < average ) {
			underAv++;
		}
		if (arr[i] > average ) {
			overAv++;
		}
	}
	
	System.out.printf("%nMaximum value: %.3f at index %d", max, maxIndex);
	System.out.printf("%nMinimum value: %.3f at index %d", min, minIndex);
	System.out.printf("%nAverage vale: %.3f%n", average);
	System.out.printf("Values above average: %d%nValues below average: %d%n", overAv, underAv);

	

}
}
