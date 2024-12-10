
public class Lab09Prob01Practice {
	 
	public static void main(String[] args) {
		double starting = 0;
		
		double[] arr = new double[21];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = starting;
			starting += 7;
		}
		printArray(arr);
		}
	
	public static void printArray(double[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%.1f%n", arr[i]);
		}
	}
}
